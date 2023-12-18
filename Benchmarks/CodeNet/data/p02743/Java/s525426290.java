import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	long a = (long)itr.nextInt();
      	long b = (long)itr.nextInt();
      	long c = (long)itr.nextInt();
      
      	long item1 = a * b;
      	long item2 = (c - a - b) / 2;
      	
      	if (item2 <= 0)
          System.out.println("No");
      	
      	item2 *= item2;
      
      	if (item1 < item2)
          System.out.println("Yes");
      	else
          System.out.println("No");
    } 
}
