
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String args[] ) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        String[] NUMBER1 = br.readLine().split(" ");
        DICE dice1 = new DICE(NUMBER1);
        String[] NUMBER2 = br.readLine().split(" ");
        DICE dice2 = new DICE(NUMBER2);


        if( Discrime.Discrime_Two_Dice(dice1, dice2)){
            System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }





    }



}


class DICE{

	int[] surface = new int[6];

    DICE(String[] number){                              //0: ?????¢
                                                        //1: ??£??¢
    	for(int i = 0; i < 6;i++ ){                    //2: ?????¢
    		surface[i] = Integer.parseInt(number[i]);  //3: ?????¢
    	}                                               //4: ?????¢
                                                        //5: ?????¢
    }




}


class Discrime{


	static boolean Discrime_Two_Dice(DICE dice1, DICE dice2){


		for(int i = 0; i < 6 ; i++){

		  for(int j = 0; j < 6 ;j++){
			if(dice1.surface[i] == dice2.surface[j]){

				 Roll_Dice.Roll_SetTop(dice1.surface[i], dice1);
				 Roll_Dice.Roll_SetTop(dice2.surface[j], dice2);

				 if( dice1.surface[5] == dice2.surface[5]  ){
					 //System.out.println("dice1.top = "+dice1.surface[0] +" dice2.top"+dice2.surface[0]);
                    for(int k = 0; k < 4; k++){
	                    if( dice1.surface[1] == dice2.surface[2+k]){
	                    	Roll_Dice.Roll_FrontandTop(dice2.surface[0] ,  dice2.surface[2+k] , dice2 );
	                    	//System.out.println("dice1.front = "+dice1.surface[1] +" dice2.front"+dice2.surface[1]);

	                    	if( dice1.surface[3] == dice2.surface[3] && dice1.surface[2] == dice2.surface[2] && dice1.surface[4] == dice2.surface[4]){
                                 return true;
	                    	}

	                    }

                    }
                    return false;


				 }
				 else{
					 return false;
				 }

			}
		  }

		}


                     return false;
	}




}



class Roll_Dice{


	static void Roll(String order , DICE dice){



		if( order.equals("S") ){
            int tmp0 = dice.surface[0], tmp1 = dice.surface[1], tmp4 = dice.surface[4], tmp5 = dice.surface[5];
            dice.surface[0] = tmp4;
            dice.surface[1] = tmp0;
            dice.surface[4] = tmp5;
            dice.surface[5] = tmp1;
		}
		else if( order.equals("N") ){
			int tmp0 = dice.surface[0], tmp1 = dice.surface[1], tmp4 = dice.surface[4], tmp5 = dice.surface[5];
            dice.surface[0] = tmp1;
            dice.surface[1] = tmp5;
            dice.surface[4] = tmp0;
            dice.surface[5] = tmp4;

		}
		else if( order.equals("W") ){
			int tmp0 = dice.surface[0], tmp2 = dice.surface[2], tmp3 = dice.surface[3], tmp5 = dice.surface[5];
            dice.surface[0] = tmp2;
            dice.surface[2] = tmp5;
            dice.surface[3] = tmp0;
            dice.surface[5] = tmp3;

		}
		else if( order.equals("E") ){
			int tmp0 = dice.surface[0], tmp2 = dice.surface[2], tmp3 = dice.surface[3], tmp5 = dice.surface[5];
            dice.surface[0] = tmp3;
            dice.surface[2] = tmp0;
            dice.surface[3] = tmp5;
            dice.surface[5] = tmp2;

		}

	}

	static void Roll_FrontandTop( int top, int front , DICE dice){


		if(     dice.surface[1]==top){
			Roll_Dice.Roll("N" , dice);
		}
		else if(dice.surface[2]==top){
			Roll_Dice.Roll("W" , dice);
		}
		else if(dice.surface[3]==top){
			Roll_Dice.Roll("E" , dice);
		}
		else if(dice.surface[4]==top){
			Roll_Dice.Roll("S" , dice);
		}
		else if(dice.surface[5]==top){
			Roll_Dice.Roll("N" , dice);
			Roll_Dice.Roll("N" , dice);
		}

		if(      dice.surface[2]==front ){
			Roll_Dice.Roll("N" , dice);
			Roll_Dice.Roll("W" , dice);
			Roll_Dice.Roll("S" , dice);
		}
		else if( dice.surface[3]==front ){
			Roll_Dice.Roll("N" , dice);
			Roll_Dice.Roll("E" , dice);
			Roll_Dice.Roll("S" , dice);
		}
		else if( dice.surface[4]==front ){
			Roll_Dice.Roll("N" , dice);
			Roll_Dice.Roll("W" , dice);
			Roll_Dice.Roll("W" , dice);
			Roll_Dice.Roll("S" , dice);
		}
	}

	static void Roll_SetTop( int top, DICE dice){


		if(     dice.surface[1]== top){
			Roll_Dice.Roll("N" , dice);
		}
		else if(dice.surface[2]== top){
			Roll_Dice.Roll("W" , dice);
		}
		else if(dice.surface[3]== top){
			Roll_Dice.Roll("E" , dice);
		}
		else if(dice.surface[4]== top){
			Roll_Dice.Roll("S" , dice);
		}
		else if(dice.surface[5]== top){
			Roll_Dice.Roll("N" , dice);
			Roll_Dice.Roll("N" , dice);
		}


	}

   void swap_surface(int x , int y){
	   int tmp = x;
	   x = y;
	   y = tmp;

   }


}