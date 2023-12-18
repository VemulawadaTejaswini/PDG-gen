import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if(n==1) {
				System.out.printf("%.9f", 1.0);
			}
			else if(n%2==0) {
				System.out.printf("%.9f", 0.5);
			}
			else {
				System.out.printf("%.9f", (n/2+1.0)/n);
			}
	}
}
