package info.searchman;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] surface =  br.readLine().split(" ");
   String[] order = br.readLine().split("");

   Dise dice1 = new Dise();
   dice1.setSurface(surface);
   dice1.SetDice(1, 2 , 3);
   dice1.RollDice(order);


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

    void RollDice(String[] RollString){
    	for(int i = 0; i < RollString.length ; i++){

    		if( RollString[i].equals("W") ){

    			Bottom = Left;
    			Left = Top;
    			Top = 5 - Bottom;
    			Right = 5 - Left;

    		}else if( RollString[i].equals("S")){

    			Bottom = Front;
    			Front = Top;
    			Top = 5 - Bottom;
    			Back = 5 - Front;

    		}else if( RollString[i].equals("E")){

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

    	System.out.println( surface[Top] );
    }//RollDice

}