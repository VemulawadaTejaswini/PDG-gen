/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int t = scanner.nextInt();
		
		int total = 0;
		int rem = n;
		while(rem > 0){
			total += t;
			rem -= x;
		}
		
		System.out.println(total);
	}
}