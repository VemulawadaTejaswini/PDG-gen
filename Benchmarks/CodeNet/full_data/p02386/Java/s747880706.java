import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice[] dice;

    	int dice_num = scan.nextInt();
    	dice = new Dice[dice_num];

    	for(int i = 0; i < dice_num; i++){
    		dice[i] = new Dice();
    	}

    	for(int i = 0; i < dice_num; i++){
    		for(int j = 0; j < 6; j++){
    			dice[i].S[j] = scan.nextInt();
    		}
    	}

    	for(int n = 0; n < dice_num - 1; n++){
    		for(int m = n + 1; m < dice_num; m++){
				for(int i = 0; i < 4; i++){
					for(int j = 0; j < 4; j++){
			    		for(int k = 0; k < 4; k++){
			    			dice[m].vRoll();
			    			if(dice[n].S[0] == dice[m].S[0] && dice[n].S[1] == dice[m].S[1] && dice[n].S[2] == dice[m].S[2] && dice[n].S[3] == dice[m].S[3] && dice[n].S[4] == dice[m].S[4] && dice[n].S[5] == dice[m].S[5]) {
			    				System.out.println("No");
			    				return;
			    			}
			        	}
			    		dice[m].yRoll();
		    		}
		    		
				}
				int temp = dice[m].S[0];
				dice[m].S[0] = dice[m].S[1];
				dice[m].S[1] = dice[m].S[5];
				dice[m].S[5] = dice[m].S[4];
				dice[m].S[4] = temp;
    		}
		}
    	System.out.println("Yes");
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
		//System.out.println(String.format("n:%d m:%d i:%d j:%d k:%d", n, m, i, j, k));
		//System.out.println(String.format("dice[%d] = %d, %d, %d, %d, %d, %d", n, dice[n].S[0], dice[n].S[1], dice[n].S[2], dice[n].S[3], dice[n].S[4], dice[n].S[5]));
		//System.out.println(String.format("dice[%d] = %d, %d, %d, %d, %d, %d", m, dice[m].S[0], dice[m].S[1], dice[m].S[2], dice[m].S[3], dice[m].S[4], dice[m].S[5]));
	}
	
	public void yRoll(){
		int temp2 = S[0];
		S[0] = S[3];
		S[3] = S[5];
		S[5] = S[2];
		S[2] = temp2;
	}
}