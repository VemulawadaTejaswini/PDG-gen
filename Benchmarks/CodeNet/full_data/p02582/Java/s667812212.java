/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if(input.equals("SSS"))
			System.out.println(0);
			
		if(input.equals("RRR"))
			System.out.println(3);
			
		if(input.equals("RRS") || input.equals("SRR"))
			System.out.println(2);
			
		if(input.equals("RSR") || input.equals("SRS") || input.equals("SSR") || input.equals("RSS"))
			System.out.println(1);
	}
}