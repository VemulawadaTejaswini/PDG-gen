import java.util.Arrays;
import java.util.Scanner;
 
class Main {
    	static String[] x;
    	static String[] y;
    	static String temp;
 
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	x = sc.nextLine().split(" ");
        	y = sc.nextLine().split(" ");
        	char[] c = { 'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S' };
         
        	boolean flag = false;
        	for(int i=0;i<3;i++){
            		for(char d:c){
                		roll(d);
                		if(Arrays.equals(x, y)){
                    			flag=true;
                    			break;
                		}
            		}
        	}
        	if(flag){
            		System.out.println("Yes");
        	}else{
            		System.out.println("No");
		}
    	}
 
    	public static void roll(char c) {
        	switch (c) {
        		case 'E':
            		    temp = x[0];
		            x[0] = x[3];
		            x[3] = x[5];
		            x[5] = x[2];
		            x[2] = temp;
		            break;
        		case 'N':
		            temp = x[0];
		            x[0] = x[1];
		            x[1] = x[5];
		            x[5] = x[4];
		            x[4] = temp;
		            break;
        		case 'W':
		            temp = x[0];
		            x[0] = x[2];
		            x[2] = x[5];
		            x[5] = x[3];
		            x[3] = temp;
		            break;
		        default:
		            temp = x[0];
		            x[0] = x[4];
		            x[4] = x[5];
		            x[5] = x[1];
		            x[1] = temp;
		            break;
        	}
    	}
}