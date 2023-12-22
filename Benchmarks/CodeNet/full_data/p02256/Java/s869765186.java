import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = Math.max(a, b);
            int d = Math.min(a, b);
           a = c;
           b = d;
           if(a >= 2 * b && a % b == 0) {
        	  a = b;
           }
           for(int i = 0; i < b; i++) {
        	   
           while(b > i) {
        	   if(a % b == 0) {
        		   System.out.println(b);
        		   break;
        	   } else {
        		   b = b / i;
        	   }
            }
           if(a % b == 0) {
    		   break;
    	   }
            b = d;
        }
	}
}
