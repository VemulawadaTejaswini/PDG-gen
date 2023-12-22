


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] surface1 =  br.readLine().split(" ");
   String[] surface2 =  br.readLine().split(" ");



   Dise[] dice = new Dise[2];

   dice[0] = new Dise();
   dice[0].setSurface(surface1);
   dice[0].SetDice(1, 2 , 3);

   dice[1] = new Dise();
   dice[1].setSurface(surface2);
   dice[1].SetDice(1, 2 , 3);



   int matchpoint = 0;
   for(int i = 0; i < 6  ; i++){
     if(matchpoint == 3 )break;
     matchpoint = 0;
     for(int j = 0; j < 6; j++){
    	 if(matchpoint == 3 )break;
         matchpoint = 0;

       if(dice[0].surface[i] == dice[1].surface[j] ){
    	   dice[0].RegulateDiceLeft( dice[0].surface[i] );
    	   dice[1].RegulateDiceLeft( dice[1].surface[j] );

    	   if(dice[0].surface[ dice[0].Right ] == dice[1].surface[ dice[1].Right ] ){
    		   matchpoint++;

    	   }

    	   for(int k = 0; k < 3; k++){
    		   if(dice[0].surface[ dice[0].Top ] == dice[1].surface[ dice[1].Top ] ){

    			   matchpoint++;

    			   break;

    		   }else{

    			   dice[1].RollDice("N");

    		   }
    	   }

    	   if(dice[0].surface[ dice[0].Bottom ] == dice[1].surface[ dice[1].Bottom ]  &&
    			   dice[0].surface[ dice[0].Front ] == dice[1].surface[ dice[1].Front ] &&
    					   dice[0].surface[ dice[0].Back ] == dice[1].surface[ dice[1].Back ]
    			   ){

    		   matchpoint ++;

    	   }


       }
      }

   }




   if(matchpoint==3){
	   System.out.println("Yes");


   }else{
	   System.out.println("No");
   }


  }
}

class Dise{

	int[] surface = new int [6];
    int Top,Bottom,Right,Left,Front,Back;


	void setSurface(String[] SurfaceString){

		for(int i = 0; i < 6; i++){

			surface[i] = Integer.parseInt( SurfaceString[i] );

		}

	}

    void SetDice(int top, int front, int right){
	   Top  = top - 1;
       Front = front - 1;
       Right = right - 1;
       Bottom = 5- (top - 1);
       Back = 5- (front - 1);
       Left = 5- (right - 1);
    }//SetDice


    void RegulateDice( int setTop, int setFront  ){


    	if( surface[Left] == setTop )   {


    	    RollDice("E");

    	}else if( surface[Right] == setTop ){

    		RollDice("W");

    	}else if( surface[Front] == setTop ){

    		RollDice("N");

    	}else if( surface[Back] == setTop ){

    		RollDice("S");

    	}else if( surface[Bottom] == setTop ) {

    		RollDice("NN");

    	}

    	if( surface[Left] == setFront )   {

      	  RollDice("NES");

      	}else if( surface[Right] == setFront ){

      		RollDice("NWS");

      	}else if(surface[Back]== setFront){

      		RollDice("NEES");

      	}


    }

    void RegulateDiceLeft( int setLeft){

    	if( surface[Top] == setLeft )   {

    	    RollDice("E");

    	}else if( surface[Right] ==setLeft ){

    		RollDice("EE");

    	}else if( surface[Front] == setLeft ){

    		RollDice("NE");

    	}else if( surface[Back] == setLeft ){

    		RollDice("SE");

    	}else if( surface[Bottom] == setLeft ) {

    		RollDice("W");

    	}

    }


    void RollDice(String RollString){

    	String[] SurfaceString =  RollString.split("");
    	for(int i = 0; i < SurfaceString.length ; i++){

    		if( SurfaceString[i].equals("W") ){

    			Bottom = Left;
    			Left = Top;
    			Top = 5 - Bottom;
    			Right = 5 - Left;

    		}else if( SurfaceString[i].equals("S")){

    			Bottom = Front;
    			Front = Top;
    			Top = 5 - Bottom;
    			Back = 5 - Front;

    		}else if( SurfaceString[i].equals("E")){

    			Bottom = Right;
    			Right = Top;
    			Top = 5 - Bottom;
    			Left = 5 - Right;

    		}else{

    			Bottom = Back;
    			Back = Top;
    			Top = 5 - Bottom;
    			Front = 5 - Back;

    		}
    	}


    }//RollDice


    void lookoutDice(){

    	System.out.println("?????¢:"+surface[Top] +" ?????¢:" +surface[Bottom] +" ?????¢:" + surface[Left] + " ?????¢:"+ surface[Right] + " ??£??¢:" + surface[Front] + " ?????¢:" +surface[Back]) ;

    }

}