import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
      int x = sn.nextInt();
      int res = 1;
      int top = 1999;
      int interval = 199;
      while( true ) {
      	if(x <= top && x>= (top - interval)) {
        	System.out.println(res);	
          	break;
        } else {
        	top = top - interval - 1;
           res++;
        }
      }
    }
}