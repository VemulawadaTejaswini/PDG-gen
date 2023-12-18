/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double epsilon = 0.0000000000000001;
		if(Math.sqrt(a) + Math.sqrt(b) + epsilon < Math.sqrt(c)){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
