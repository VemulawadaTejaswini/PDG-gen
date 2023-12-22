import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{ 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
        
        	int num,count,spinA,spinB,spinC;
        	
        	String number1 = read.readLine();
	        String[] spli1 = number1.split(" ");
	        int [] dice1 = new int [9];
	        for(count = 0; count < 9; count++){ 
	        	dice1[count] = 0;
	        }
	        for(num = 0; num < 6; num++){
	        	dice1[num] = Integer.parseInt(spli1[num]);
	        }
	        	
	        String number2 = read.readLine();
	        String[] spli2 = number2.split(" ");
	        int [] dice2 = new int [6];
	        for(count = 0; count < 6; count++){ 
	          	dice2[count] = 0;
	        }
	        for(num = 0; num < 6; num++){
	        	dice2[num] = Integer.parseInt(spli2[num]);
	        }
	        
	        
	        	for(spinA = 0; spinA < 4; spinA++){
	        		if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
	        			System.out.println("Yes");
	        			break;
        			}
        			else{
        				dice1[6] = dice1[0];
        				dice1[0] = dice1[1];
        				dice1[1] = dice1[5];
        				dice1[5] = dice1[4];
        				dice1[4] = dice1[6];
        				
		        		for(spinB = 0; spinB < 4; spinB++){
		        			if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
		        				break;
		        			}
		        			else{
		        				dice1[6] = dice1[1];
		        				dice1[7] = dice1[2];
		        				dice1[8] = dice1[4];
		        				dice1[1] = dice1[3];
		        				dice1[2] = dice1[6];
		        				dice1[4] = dice1[7];
		        				dice1[3] = dice1[8];
		        				
			        			for(spinC = 0; spinC < 4; spinC++){
				        			if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
				        				break;
				        			}
				        			else{
				        				dice1[6] = dice1[2];
				        				dice1[7] = dice1[0];
				        				dice1[8] = dice1[3];
				        				dice1[2] = dice1[5];
				        				dice1[0] = dice1[6];
				        				dice1[3] = dice1[7];
				        				dice1[5] = dice1[8];
				        			}
			        			}
			        		}
		        		}
        			}
	        	}
	        	if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
	        	}
	        	else{
	        		System.out.println("No");
	        	}
    }
}