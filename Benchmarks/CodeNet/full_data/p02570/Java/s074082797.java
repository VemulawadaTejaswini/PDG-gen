/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int s,d,t;
		Scanner scanner = new Scanner(System.in);
		
		d = scanner.nextInt();
		t = scanner.nextInt();
		s = scanner.nextInt();
		
		if(s * t >= d)
			System.out.println("Yes");
			
		else 
			System.out.println("No");
	}
}