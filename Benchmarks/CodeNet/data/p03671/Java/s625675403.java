/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int a, b, c ;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println(minValue(a,b,c)
        		);
        }
	
	        	public static int minValue(int a, int b, int c) {
	        		int min = a + b;
	        		if (min > b + c) min = b + c;
	        		if (min > c + a) min = c + a;
	        		return min;
	        		
	        	}
	        	
}