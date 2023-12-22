import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice[] dice;

    	dice = new Dice[2];

    	for(int i = 0; i < 2; i++){
    		dice[i] = new Dice();
    	}

    	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < 6; j++){
    			dice[i].S[j] = scan.nextInt();
    		}
    	}

    	
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
			    for(int k = 0; k < 4; k++){
			   		dice[1].vRoll();
			    		if(dice[0].S[0] == dice[1].S[0] && dice[0].S[1] == dice[1].S[1] && dice[0].S[2] == dice[1].S[2] && dice[0].S[3] == dice[1].S[3] && dice[0].S[4] == dice[1].S[4] && dice[0].S[5] == dice[1].S[5]) {
			    			System.out.println("Yes");
			    			return;
			    		}
			        }
			    	dice[1].yRoll();
		    	}
		    	dice[1].v2Roll();				
		}
    	System.out.println("No");
     }
}

class Dice{
	int[] S = new int[6];
	
	public void vRoll(){
		int temp3 = S[0];
		S[0] = S[1];
		S[1] = S[5];
		S[5] = S[4];
		S[4] = temp3;
	}
	
	public void yRoll(){
		int temp2 = S[0];
		S[0] = S[3];
		S[3] = S[5];
		S[5] = S[2];
		S[2] = temp2;
	}
	
	public void v2Roll(){
		int temp = S[0];
		S[0] = S[1];
		S[1] = S[5];
		S[5] = S[4];
		S[4] = temp;
	}
}