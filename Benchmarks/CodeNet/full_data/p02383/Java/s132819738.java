import java.util.Scanner;
class Main{
     public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice1 = new Dice();
    	int[] v = new int[6];
    	
    	for(int i = 0; i < 6; i++){
    		dice1.S[i] = scan.nextInt();
    		v[i] = i;
    	}
    	
    	String order = scan.next();
    	char[] c_order = new char[order.length()];
    	
    	for(int i = 0; i < order.length(); i++){
    		c_order[i] = order.charAt(i);
    		int buf;
    		switch(c_order[i]){
    			case 'N':{
    				buf = v[0];
    				v[0] = v[1];
    				v[1] = v[5];
    				v[5] = v[4];
    				v[4] = buf;
    				break;
    			}
    			case 'E':{
        			buf = v[0];
        			v[0] = v[3];
        			v[3] = v[5];
        			v[5] = v[2];
        			v[2] = buf;
        			break;
    			}
    			case 'W':{
    				buf = v[0];
        			v[0] = v[2];
        			v[2] = v[5];
        			v[5] = v[3];
        			v[3] = buf;
        			break;
    			}
    			case 'S':{
    				buf = v[0];
        			v[0] = v[4];
        			v[4] = v[5];
        			v[5] = v[1];
        			v[1] = buf;
        			break;
    			}
    		}
    	}
    	
    	
    	System.out.println(dice1.S[v[0]]);
     }
}

class Dice{
	int[] S = new int[6];
}