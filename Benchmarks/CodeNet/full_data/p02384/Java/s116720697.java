import java.util.Arrays;
import java.util.Scanner;
 
class Main {
    	static String str;
    	static Scanner sc = new Scanner(System.in);
    	public static void main(String[] args) {
        	str = sc.nextLine();
        	String[] dice = str.split(" ");
        	String[] x;
        	int y = Integer.parseInt(sc.nextLine());
         
        	for (int i = 0; i < y; i++) {
            		str = sc.nextLine();
            		x = str.split(" ");
            		sort(dice, x);
        	}
    	}

    	private static void sort(String[] dice, String[] x){
        	for(int i = 0; i < 4; i++){
            		for(int j = 0; j < 4; j++){
                		for (int h = 0; h < 4; h++) {
                    			String[] z = new String[i+j+(h*3)];
                    			String[] dice2 = Arrays.copyOf(dice, dice.length);
                    			for (int k = 0; k < i; k++) {
	                        		z[k] = "N";
	                    		}
	                    		for (int l = 0; l < j; l++) {
	                        		z[i+l] = "E";
	                    		}
	                    		for (int f = 0; f < h; f++) {
	                        		int num = f * 3;
	                        		z[i+j+num] = "W";
	                        		z[i+j+(num+1)] = "S";
	                        		z[i+j+(num+2)] = "E";
	                    		}
	                    		move(dice2, z);                     
	                    		if(dice2[0].equals(x[0]) && dice2[1].equals(x[1])){
	                        		System.out.println(dice2[2]);
	                        		return;
	                    		}
	                	}
	                }
	        }
	}
	    
	private static String[] move(String[] dice, String[] z) {
        	for (int i = 0; i < z.length; i++) {
            		if(z[i].equals("E")){
               			str = dice[0];
		                dice[0] = dice[3];
		                dice[3] = dice[5];
		                dice[5] = dice[2];
		                dice[2] = str;
            		}else if(z[i].equals("W")){
                		str = dice[0];
		                dice[0] = dice[2];
		                dice[2] = dice[5];
		                dice[5] = dice[3];
		                dice[3] = str;
		       	}else if(z[i].equals("S")){
		                str = dice[0];
		                dice[0] = dice[4];
		                dice[4] = dice[5];
		                dice[5] = dice[1];
		                dice[1] = str;
		        }else if(z[i].equals("N")){
		                str = dice[0];
		                dice[0] = dice[1];
		                dice[1] = dice[5];
		                dice[5] = dice[4];
		                dice[4] = str;
            		}
        	}
        	return dice;        
    	}
}