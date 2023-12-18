import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	long a = (long)itr.nextInt();
      	long b = (long)itr.nextInt();
      	long c = (long)itr.nextInt();
      
      	a *= 4;
      	b *= 4;
      	c *= 4;
    
      	long left = (c - a - b);
      	left /= 2;
      	
      	if (left < 0) {
          	System.out.println("No");
        	//return;
        }
      	left = left * left;
      
      	if (a * b < left)
          System.out.println("Yes");
      	else
          System.out.println("No");
    } 
}
