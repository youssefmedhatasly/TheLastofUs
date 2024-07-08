package views;

import model.world.Cell;
import model.world.CharacterCell;
import model.world.CollectibleCell;
import model.world.TrapCell;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.util.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import java.awt.Point;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Iterator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import engine.Game;
import exceptions.InvalidTargetException;
import exceptions.MovementException;
import exceptions.NoAvailableResourcesException;
import exceptions.NotEnoughActionsException;
import javafx.scene.control.ToggleGroup; 
import javafx.scene.control.RadioButton;  
import javafx.scene.control.Button; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.control.Label; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.layout.VBox;
import model.characters.Direction;
import model.characters.Explorer;
import model.characters.Fighter;
import model.characters.Hero;
import model.characters.Medic;
import model.characters.Zombie;
import model.collectibles.Supply;
import model.world.CharacterCell;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.world.CharacterCell;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Tooltip;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class view extends Application {
	
	
	public Hero selectedhero ;
	//public Character setTarget ;
	public Boolean flag = false;

	public void start(Stage primaryStage) throws Exception  {
	
			try {
				Game.loadHeroes("Heroes.csv");
			}catch (Exception IOException){
				System.out.print("file cannot be found ") ;
			}
			for (int i =0 ; i<Game.availableHeroes.size(); i++) {
			    System.out.print(Game.availableHeroes.get(i));	
			}
		
		    ToggleGroup group = new ToggleGroup();
		    Label l = new Label("You need to choose a hero!"
		    		+"\n"+ "There are some instructions as well; you need to select and choose a hero from the map before taking any actions"
		    		+"\n" + "You also need to select a target before attacking or curing or use special in case of medic");
		    RadioButton button1 = new RadioButton("Name Joel Miller, Type Fighter, maximum Health 140,  actions available   5,  attack damage 30 "); 
		    RadioButton button2 = new RadioButton("Name Ellie Williams, Type Medic, Maximum Health 110, Actions Available 6, Attack Damage 15    ");  		    
		    RadioButton button3 = new RadioButton("Name Tess, Type Explorer, Maximum Health 80, Actions Available 6, Attack Damage 20        	 ");  
		    RadioButton button4 = new RadioButton("Name Riley Abel, Type Explorer, Maximum Health 90, Actions Available 5, Attack Damage 25  	 ");
		    RadioButton button5 = new RadioButton("Name Tommy Miller, Type Explorer, Maximum Health 95, Actions Available 5, Attack Damage 25	 ");  
		    RadioButton button6 = new RadioButton("Name Bill, Type Medic, Maximum Health 100, Actions Available 7, Attack Damage 10				 ");  
		    RadioButton button7 = new RadioButton("Name David , Type Fighter, Maximum Health 150, Actions Available 4, Attack Damage 35			 ");  
		    RadioButton button8 = new RadioButton("Name Henry Burell, Type Medic, Maximum Health 105, Actions Available 6, Attack Damage 15		 ");
		    Button startgame =new Button("Start Game");

		    
		    button1.setOnAction(e1 ->{
		    	Hero H = Game.availableHeroes.get(0) ;
		    	if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    	});
		    button2.setOnAction(e2 ->{	
		    	Hero H  = Game.availableHeroes.get(1) ;
		    	if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    });
		    button3.setOnAction(e3 ->{
		    	Hero H  = Game.availableHeroes.get(2) ;
		    	if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    });
		    button4.setOnAction(e4 ->{
		    	Hero H  = Game.availableHeroes.get(3) ;
		    	if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    });
		    button5.setOnAction(e5 ->{
		    	Hero H  = Game.availableHeroes.get(4) ;
		    	if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    });
		    button6.setOnAction(e6 ->{
		    	Hero H  = Game.availableHeroes.get(5) ;
		    
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   
		    });
		    button7.setOnAction(e7 ->{
		    	Hero H  = Game.availableHeroes.get(6) ;
		    	  if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
						   
				    });
				   }
		    });
		    button8.setOnAction(e8 ->{
		    	Hero H  = Game.availableHeroes.get(7) ;
		    	  if ( H != null) {
		  		    
					   startgame.setOnAction(e ->{
					   Game.startGame( H);
						   primaryStage.close();
						   Stage s = new Stage();
						   try {
							start2(s, H);
						} catch (Exception e9) {
							// TODO Auto-generated catch block
							e9.printStackTrace();
						}
				    });
				   }
		    });
		    
		    
		
		    button1.setToggleGroup(group);  
		    button2.setToggleGroup(group);  
		    button3.setToggleGroup(group);  
		    button4.setToggleGroup(group);  
		    button5.setToggleGroup(group);  
		    button6.setToggleGroup(group);  
		    button7.setToggleGroup(group);  
		    button8.setToggleGroup(group);  
		    
		    

		    VBox root=new VBox();  
		    root.setSpacing(30);  
		    root.setAlignment(Pos.CENTER );
		    root.getChildren().addAll(l,button1,button2,button3,button4,button5,button6,button7,button8,startgame);  
		    Scene scene=new Scene(root,Color.ALICEBLUE);
		    primaryStage.setWidth(1100); // Set the width of the stage
		    primaryStage.setHeight(700); // Set the height of the stage
		  //  primaryStage.setScene(scene);
		    primaryStage.setScene(scene);
		    
		primaryStage.setTitle("The last of Us");
		primaryStage.getIcons().add(new Image("data:image/png;base64,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"));
		primaryStage.show();
		} 
		
		public void CheckWin(Stage secondryStage) {
  	          if(Game.checkWin()) {
  	        	 Alert alert = new Alert(Alert.AlertType.INFORMATION);
   			     alert.setContentText("Congratulations!!You have won."); 
   			     alert.setTitle("woooohoooo");
   			     alert.getButtonTypes().setAll(ButtonType.OK);  			        
   			     alert.show();
   			     secondryStage.close();   	    	
  	          }
    	    	    
		}						
		public void CheckGameOver(Stage secondryStage) {
	        if(Game.checkWin())	  {	
	    	  Alert alert = new Alert(Alert.AlertType.INFORMATION);
			  alert.setContentText("Congratulations!!You have won."); 
			  alert.setTitle("woooohoooo");
			  alert.getButtonTypes().setAll(ButtonType.OK);  			        
			  alert.show();
			  secondryStage.close();   	    	   
	        }
		if(Game.checkGameOver()) {
			//	if (selectedhero )
	        	 Alert alert = new Alert(Alert.AlertType.INFORMATION);
				  alert.setContentText("HardLuck. You have lost."); 
				  alert.setTitle("oops");
				  alert.getButtonTypes().setAll(ButtonType.OK);  			        
				  alert.show();
				  secondryStage.close();   	
		}  
			
		}
	  	
	  public  void checkMap(Button[][] buttons, Stage secondryStage) {
		  Image zombie = new Image("views/smallzombie.jpg");
		  ImageView zombieView = new ImageView (zombie);
	      
	      Image fighter = new Image("views/fighter.jpg");
	      ImageView fighterView = new ImageView(fighter);
	        
	      Image medic = new Image("views/medic.jpg");
	      ImageView medicView = new ImageView(medic);
	      
	      Image Explorer = new Image("views/exploer.jpg");
	      ImageView ExplorerView = new ImageView(Explorer);
	      
	      Image Supply = new Image("views/smallsupply.jpg");
	      ImageView supplyView = new ImageView(Supply);
	      
	      Image Vacine = new Image("views/supplyvacine.jpg");
	      ImageView vacineView = new ImageView(Vacine);
	      
	      
	  	CheckGameOver(secondryStage);
		CheckWin(secondryStage);
	
//		  if (selectedhero.getCurrentHp() == 0) {
//			 
//			  CheckGameOver(secondryStage);
//		  }
		
      	for (int i =0 ; i<Game.map.length; i++) {
      		for (int j =0 ; j<Game.map.length ;j++) {
      			 
      			
     			
      			
      			if (Game.map[i][j].isVisible())
      				buttons[i][j].setVisible(true);
      			else if (!Game.map[i][j].isVisible()) {
      				buttons[i][j].setVisible(false);
      			}
      			
      			if ( Game.map[i][j] instanceof CharacterCell) {
      				if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Hero) {
      					if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Fighter) {
      						buttons[i][j].setGraphic(new ImageView(fighter));
      						fighterView.setFitWidth(buttons[i][j].getPrefWidth());
      						fighterView.setFitHeight(buttons[i][j].getPrefHeight());
      						fighterView.setPreserveRatio(true);
      						
      					}
      					else if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Medic) {
      					   buttons[i][j].setGraphic(new ImageView(medic));
      					   medicView.setFitWidth(buttons[i][j].getPrefWidth());
           				   medicView.setFitHeight(buttons[i][j].getPrefHeight());
           				   medicView.setPreserveRatio(true);
      					}
      					else if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Explorer) {
      						buttons[i][j].setGraphic(new ImageView(Explorer));
      						ExplorerView.setFitWidth(buttons[i][j].getPrefWidth());
           				   ExplorerView.setFitHeight(buttons[i][j].getPrefHeight());
           				   ExplorerView.setPreserveRatio(true);

      					}
      				}else if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Zombie) {
      					buttons[i][j].setGraphic(new ImageView(zombie));
      					zombieView.setFitWidth(buttons[i][j].getPrefWidth());
       				   supplyView.setFitHeight(buttons[i][j].getPrefHeight());
       				   supplyView.setPreserveRatio(true);

      				}
      					
      			}else if (Game.map[i][j] instanceof CollectibleCell) {
      				if (((CollectibleCell) Game.map[i][j]).getCollectible() instanceof Supply) {
      					buttons[i][j].setGraphic(new ImageView(Supply));
      					supplyView.setFitWidth(buttons[i][j].getPrefWidth());
       				   supplyView.setFitHeight(buttons[i][j].getPrefHeight());
       				   supplyView.setPreserveRatio(true);
      				}else 
      				buttons[i][j].setGraphic(new ImageView(Vacine));
      				vacineView.setFitWidth(buttons[i][j].getPrefWidth());
      				vacineView.setFitHeight(buttons[i][j].getPrefHeight());
      				vacineView.setPreserveRatio(true);
      		}
      			else {
      				buttons[i][j].setGraphic(null);
      			}
      	}
      }
	}
	  
	   
	  		  

	  
		public  void start2(Stage secondryStage, Hero H) throws Exception {
			  Game.startGame( H);
			 
            VBox movePane = new VBox();
	        GridPane gridPane = new GridPane();
	        HBox verticalButtonPane = new HBox();
	     
	     

	        gridPane.setPadding(new Insets(10));
	        //gridPane.setHgap(5);
	        //gridPane.setVgap(5);

	        verticalButtonPane.setSpacing(10);
	        verticalButtonPane.setAlignment(Pos.CENTER);
	        
	
	        int numRows = 15;
	     //   int numCols = 15;
	       
	        
	        Button [][]  buttons = new Button[15][15];
	        for (int row = 0; row < 15; row++) {
	            for (int col = 0; col < 15; col++) {
	            	final int r = row;
	            	final int c = col;
	               Button b = new Button();
	               b.setOnMouseClicked(new EventHandler<Event>() {
					@Override
					public void handle(Event arg0) {
					//	Point p = new Point(row,col);
						if( flag == false ){
						if (Game.map[r][c] instanceof CharacterCell) {
						//	if (Event.isPrimaryButtonDown()) {
							 if (((CharacterCell) Game.map[r][c]).getCharacter() instanceof Hero) {
								selectedhero = (Hero) ((CharacterCell) Game.map[r][c]).getCharacter();
								
								
								System.out.println();
								System.out.println("Name "+selectedhero.getName()+"\n"+
								"Current Hp "+selectedhero.getCurrentHp()+"\n"+
								"Attack damage "+selectedhero.getAttackDmg()+"\n"+
								"action availble "+selectedhero.getActionsAvailable()+"\n"+
								"supply "+selectedhero.getSupplyInventory().size()+"\n"+
								"vaccine "+selectedhero.getVaccineInventory().size()+"\n");
								Tooltip aa = new Tooltip("Name "+selectedhero.getName()+"\n"+
										"Current Hp "+selectedhero.getCurrentHp()+"\n"+
										"Attack damage "+selectedhero.getAttackDmg()+"\n"+
										"action availble "+selectedhero.getActionsAvailable()+"\n"+
										"supply "+selectedhero.getSupplyInventory().size()+"\n"+
										"vaccine "+selectedhero.getVaccineInventory().size()+"\n");
								buttons[r][c].setTooltip(aa);
							 }
							}
						
						}
					 
					else {
						if (Game.map[r][c] instanceof CharacterCell) {
							selectedhero.setTarget(((CharacterCell) Game.map[r][c]).getCharacter()) ;
							System.out.println();
							System.out.print(selectedhero.getTarget().getName());
							flag = false;
						}
					}
					
					
					}
				});
	               b.setMinSize(40, 40);
	               b.setPrefSize(40, 40);
	               b.setMaxSize(40, 40);

	                b.setVisible(false);
	                buttons[row][col]= b;
	                gridPane.add(buttons[row][col], col, row);
	            }
	        }
       
	        //
	        for (int j = 0; j < numRows / 2; j++) {
	            for (Node node : gridPane.getChildren()) {
	                if (GridPane.getRowIndex(node) == j) 
	                    GridPane.setRowIndex(node, numRows - j - 1);
	                 else if (GridPane.getRowIndex(node) == numRows - j - 1) 
	                    GridPane.setRowIndex(node, j);
	            }
	        }
	        
	       checkMap(buttons,secondryStage);
	       
	    
	       
	       // buttons[0][0].setGraphic(zombieView);
	       // buttons[0][0].setPrefSize(10, 5);
	        
	        Button moveLeft = new Button("left");
	        Button moveRight = new Button("right");
	        Button moveup = new Button("up");
	        Button movedown = new Button("down");
	        Button attack = new Button("Attack");
	        Button cure = new Button("cure");
	        Button useSpecial = new Button("use Special");
	        Button endTurn = new Button("end Turn");
	        Button SetTarget = new Button("Set Target");
	        movePane.getChildren().addAll(moveup,moveLeft,moveRight,movedown);
	        verticalButtonPane.getChildren().addAll(attack,cure,useSpecial,endTurn,SetTarget);
	        
	        secondryStage.setWidth(1100); // Set the width of the stage
	        secondryStage.setHeight(700); // Set the height of the stage 
	        
	        useSpecial.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					try {
						selectedhero.useSpecial();
						checkMap(buttons,secondryStage);
						if(selectedhero.getCurrentHp()==0) {
							((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
						}
						CheckGameOver(secondryStage);
						CheckWin(secondryStage);
					} catch (NoAvailableResourcesException e) {
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   			        alert.setContentText("you don't have enough supply for special action"); 
	   			        alert.setTitle("Exception");
	   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
	   			        alert.show();
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvalidTargetException e) {
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   			        alert.setContentText("invalid target"); 
	   			        alert.setTitle("Exception");
	   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
	   			        alert.show();
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
	        		
		});		
	        SetTarget.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					flag =true;
				}
	        	
	        	
	        });
	        
	        endTurn.setOnAction(new EventHandler<>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					try {
						checkMap(buttons,secondryStage);
						if(selectedhero.getCurrentHp()==0) {
							((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
						}
						CheckGameOver(secondryStage);
							Game.endTurn();
							checkMap(buttons,secondryStage);
							CheckGameOver(secondryStage);
						CheckWin(secondryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
				}
	        });
	        

	        attack.setOnAction(new EventHandler<ActionEvent>() {
	             public void handle (ActionEvent event) {
	            	   
	            	 Point p =selectedhero.getTarget().getLocation();
	            	 int i = (int)p.getX();
	                 int j = (int)p.getY();
	                 
	                 Point h = selectedhero.getLocation();
	                 int x = (int)h.getX();
	                 int y = (int)h.getY();
	                 	
	            		try {
	            	
							selectedhero.attack();
							checkMap(buttons,secondryStage);
							if(selectedhero.getCurrentHp()==0) {
								((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
							}
							CheckGameOver(secondryStage);
							CheckWin(secondryStage);
							
						} catch (NotEnoughActionsException e) {
							// TODO Auto-generated catch block
		   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
		   			        alert.setContentText("Out of available Actions to move"); 
		   			        alert.setTitle("Exception");
		   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
		   			        alert.show();
							e.printStackTrace();
						} catch (InvalidTargetException e) {
							// TODO Auto-generated catch block
		   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
		   			        alert.setContentText("Invalid Target"); 
		   			        alert.setTitle("Exception");
		   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
		   			        alert.show();
							e.printStackTrace();
						}
	            		if (selectedhero.getTarget().getCurrentHp()<10) {
							buttons[i][j].setGraphic(null);
	            		}if (selectedhero.getCurrentHp()==0) {
	            			buttons[x][y].setGraphic(null);
	            			
	            			CheckGameOver(secondryStage);
							CheckWin(secondryStage);
	            		
						}
	            		checkMap(buttons,secondryStage);
	            		
	            }
	            } );
	        cure.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Point p = selectedhero.getLocation();
	                 int i = p.x;
	                 int j = p.y;
					// TODO Auto-generated method stub
					try {
						selectedhero.cure();
						checkMap(buttons,secondryStage);
						if(selectedhero.getCurrentHp()==0) {
							((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
						}
						CheckGameOver(secondryStage);
						CheckWin(secondryStage);
					} catch (NoAvailableResourcesException e) {
						// TODO Auto-generated catch block
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   			        alert.setContentText("No available resources"); 
	   			        alert.setTitle("Exception");
	   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
	   			        alert.show();
						e.printStackTrace();
					} catch (InvalidTargetException e) {
						// TODO Auto-generated catch block
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   			        alert.setContentText("Invalid Target"); 
	   			        alert.setTitle("Exception");
	   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
	   			        alert.show();
						e.printStackTrace();
					} catch (NotEnoughActionsException e) {
						// TODO Auto-generated catch block
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
	   			        alert.setContentText("you don't have enought actions"); 
	   			        alert.setTitle("Exception");
	   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
	   			        alert.show();
						e.printStackTrace();
					}
					buttons[i][j].setGraphic(null);
					checkMap(buttons,secondryStage);
				}
	        	
	        });
	        
            moveRight.setOnAction(new EventHandler<ActionEvent>() {
             public void handle (ActionEvent event) {
            	 
              Image fighter = new Image("views/fighter.jpg");
       	      Image medic = new Image("views/medic.jpg");
       	      Image Explorer = new Image("views/exploer.jpg");
             
       	      Point p = selectedhero.getLocation();
              int i = p.x;
              int j = p.y;
              
              if(Game.map[i][j] instanceof TrapCell) {
              	Alert alert = new Alert(Alert.AlertType.INFORMATION);
  			        alert.setContentText("oops you fell in the trap "); 
  			        alert.setTitle("Exception");
  			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
  			        alert.show();
             	 if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Medic) {
             		 buttons[i][j].setGraphic(new ImageView(medic));
             		 
             	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Fighter) {
             		 buttons[i][j].setGraphic(new ImageView(fighter));
             		 
             	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Explorer) {
             			buttons[i][j].setGraphic(new ImageView(Explorer));
             		 
             	 }
 
              }
              
            	try {
            		selectedhero.move(Direction.RIGHT);
            		if(selectedhero.getCurrentHp()==0) {
						((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
					}
            		CheckGameOver(secondryStage);
            		CheckWin(secondryStage);
				} catch (MovementException e) {
					// TODO Auto-generated catch block

   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
   			        alert.setContentText("Hero Can't cross the border or there is a character here"); 
   			        alert.setTitle("Exception");
   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
   			        alert.show();
					e.printStackTrace();
				} catch (NotEnoughActionsException e) {
					// TODO Auto-generated catch block

   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
   			        alert.setContentText("Out of available Actions to move"); 
   			        alert.setTitle("Exception");
   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
   			        alert.show();
					e.printStackTrace();
				}
            	buttons[i][j].setGraphic(null);
            	checkMap(buttons,secondryStage);
            }
            } );
            
          //  showMessage("Hello, World!", "This is a custom message.");
            moveLeft.setOnAction(new EventHandler<ActionEvent>() {
                public void handle (ActionEvent event) {
               
                	  Image fighter = new Image("views/fighter.jpg");
               	      Image medic = new Image("views/medic.jpg");
               	      Image Explorer = new Image("views/exploer.jpg");
                     
               	      Point p = selectedhero.getLocation();
                      int i = p.x;
                      int j = p.y;
                      
                      if(Game.map[i][j] instanceof TrapCell) {
                    	  Alert alert = new Alert(Alert.AlertType.INFORMATION);
        			        alert.setContentText("oops you fell in the trap "); 
        			        alert.setTitle("Exception");
        			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
        			        alert.show();
                     	 if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Medic) {
                     		 buttons[i][j].setGraphic(new ImageView(medic));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Fighter) {
                     		 buttons[i][j].setGraphic(new ImageView(fighter));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Explorer) {
                     			buttons[i][j].setGraphic(new ImageView(Explorer));
                     		 
                     	 }
                     	
                      }	
                	
                	
                	
               	try {
               		selectedhero.move(Direction.LEFT);
               		if(selectedhero.getCurrentHp()==0) {
						((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
					}
               		CheckGameOver(secondryStage);
            		CheckWin(secondryStage);
   				} catch (MovementException e) {
   					// TODO Auto-generated catch block

      					Alert alert = new Alert(Alert.AlertType.INFORMATION);
      			        alert.setContentText("Hero Can't cross the border or there is a character here"); 
      			        alert.setTitle("Exception");
      			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
      			        alert.show();
   					e.printStackTrace();
   				} catch (NotEnoughActionsException e) {
   					// TODO Auto-generated catch block

      					Alert alert = new Alert(Alert.AlertType.INFORMATION);
      			        alert.setContentText("Out of available Actions to move"); 
      			        alert.setTitle("Exception");
      			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
      			        alert.show();
   					e.printStackTrace();
   				}
               	buttons[i][j].setGraphic(null);
               	checkMap(buttons,secondryStage);
               }
               } );
            
            moveup.setOnAction(new EventHandler<ActionEvent>() {
                public void handle (ActionEvent event) {
                	
                	  Image fighter = new Image("views/fighter.jpg");
               	      Image medic = new Image("views/medic.jpg");
               	      Image Explorer = new Image("views/exploer.jpg");
                     
               	      Point p = selectedhero.getLocation();
                      int i = p.x;
                      int j = p.y;
                      
                      if(Game.map[i][j] instanceof TrapCell) {
                    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
          			        alert.setContentText("oops you fell in the trap "); 
          			        alert.setTitle("Exception");
          			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
          			        alert.show();
                     	 if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Medic) {
                     		 buttons[i][j].setGraphic(new ImageView(medic));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Fighter) {
                     		 buttons[i][j].setGraphic(new ImageView(fighter));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Explorer) {
                     			buttons[i][j].setGraphic(new ImageView(Explorer));
                     		 
                     	 }
                    
                      }
                	
                try {
               	   
               		selectedhero.move(Direction.UP);
               		if(selectedhero.getCurrentHp()==0) {
						((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
					}
               		CheckGameOver(secondryStage);
            		CheckWin(secondryStage);
   				} catch (MovementException e) {
   					// TODO Auto-generated catch block

   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
   			        alert.setContentText("Hero Can't cross the border or there is a character here"); 
   			        alert.setTitle("Exception");
   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
   			        alert.show();
   					e.printStackTrace();
   				} catch (NotEnoughActionsException e) {
   					// TODO Auto-generated catch block

   					Alert alert = new Alert(Alert.AlertType.INFORMATION);
   			        alert.setContentText("Out of available Actions to move"); 
   			        alert.setTitle("Exception");
   			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
   			        alert.show();
   					e.printStackTrace();
   				}
            
               	buttons[i][j].setGraphic(null);
               	checkMap(buttons,secondryStage);
               }
               } );
            
            movedown.setOnAction(new EventHandler<ActionEvent>() {
                public void handle (ActionEvent event) {
               	
                	  Image fighter = new Image("views/fighter.jpg");
               	      Image medic = new Image("views/medic.jpg");
               	      Image Explorer = new Image("views/exploer.jpg");
                     
               	      Point p = selectedhero.getLocation();
                      int i = p.x;
                      int j = p.y;
                     
                      
                      
                      
                      if(Game.map[i][j] instanceof TrapCell) {
                    		
                     	 if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Medic) {
                     		 buttons[i][j].setGraphic(new ImageView(medic));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Fighter) {
                     		 buttons[i][j].setGraphic(new ImageView(fighter));
                     		 
                     	 }if (((CharacterCell) Game.map[i][j]).getCharacter() instanceof Explorer) {
                     			buttons[i][j].setGraphic(new ImageView(Explorer));
                     		 
                     	 }
                     
                      } 	
                	
               	try {
               		selectedhero.move(Direction.DOWN);
               		if(selectedhero.getCurrentHp()==0) {
						((CharacterCell)Game.map[selectedhero.getLocation().x][selectedhero.getLocation().y]).setCharacter(null);
					}
               		CheckGameOver(secondryStage);
            		CheckWin(secondryStage);
   				} catch (MovementException e) {
   					// TODO Auto-generated catch block

      					Alert alert = new Alert(Alert.AlertType.INFORMATION);
      			        alert.setContentText("Hero Can't cross the border or there is a character here"); 
      			        alert.setTitle("Exception");
      			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
      			        alert.show();
   					e.printStackTrace();
   				} catch (NotEnoughActionsException e) {
   					// TODO Auto-generated catch block

      					Alert alert = new Alert(Alert.AlertType.INFORMATION);
      			        alert.setContentText("Out of available Actions to move"); 
      			        alert.setTitle("Exception");
      			        alert.getButtonTypes().setAll(ButtonType.OK);  			        
      			        alert.show();
   					e.printStackTrace();
   				}
               	buttons[i][j].setGraphic(null);
               	checkMap(buttons,secondryStage);
               }
               } );
               
            
            
            
            
            
	        HBox root = new HBox(10);
	        root.getChildren().addAll(gridPane, verticalButtonPane,movePane);
	        
	        
	        
	        
	        
	        
	      //  Image icon = new Image("padge.jpg"); 		
	    	//secondryStage.getIcons().add(icon); 
	        //Button[10,2].setVisible(false);
	        Scene scene = new Scene(root);
	       // scene.setp(400, 300);
	        //secondryStage.set/*//**/**/Fill(Color.rgb(numCols, numRows, numCols));
	        secondryStage.setTitle("The last of Us");
	        secondryStage.setScene(scene);
	        secondryStage.show();
	        Color midnightBlue = Color.web("#152238");
	        BackgroundFill backgroundFill = new BackgroundFill(midnightBlue, null, null);
	        Background background = new Background(backgroundFill);
	        //verticalButtonPane.setBackground(background);
	        gridPane.setBackground(background);
		}	
		
		
		
		
		
	

		public static void main (String[]args){
		launch(args); // Step 5
		} 
}