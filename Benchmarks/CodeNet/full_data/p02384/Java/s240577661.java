import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice;
    	dice = new Dice();
    	int v = 0;
    	int up;
    	int front;

    	for(int j = 0; j < 6; j++){
    		dice.S[j] = scan.nextInt();
    	}
    	int qustion = scan.nextInt();
    	
    	for(int m = 0; m < qustion; m++){
    		up = scan.nextInt();
    		front = scan.nextInt();
    		for(int i = 0; i < 4; i++){
    			for(int j = 0; j < 4; j++){
    				for(int k = 0; k < 4; k++){
    					dice.vRoll();
			    			if(up == dice.S[0] && front == dice.S[1]) {
			    				v = dice.S[2];
			    				break;
			    			}
			        }
			    	dice.yRoll();
		    	}
		    	dice.v2Roll();				
    		}
    		System.out.println(v);
    	}
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