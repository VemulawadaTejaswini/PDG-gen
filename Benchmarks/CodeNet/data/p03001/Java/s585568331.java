import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
      int x = scan.nextInt();
		int y = scan.nextInt();
      double a = 1.0;
      double b = 0;
      double c = 0;
      if(w*y<w*(h-y)) {
    	  
    	  b = a*w*y;
      }else {
    	  b = a*w*(h-y);
      }
      if(h*x<h*(w-x)) {
    	  c = a*h*x;
      }else {
    	 
    	  c = a*h*(w-x);
      }
      
      if(b==c) {
    	  System.out.print(b+" "+1);
      }else if (b<c) {
    	  System.out.print(c+" "+0);
      }else {
    	  System.out.print(b+" "+0);
      }

      
	}
 
}