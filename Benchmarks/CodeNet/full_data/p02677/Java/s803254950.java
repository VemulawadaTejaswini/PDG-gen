/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int h = s.nextInt();
		int m = s.nextInt();
		double angle = Math.abs((double)(60*h - 11*m)/(double)2);
		angle = Math.toRadians(angle);
		// System.out.println((2*a*b*Math.cos(angle)));
		double ans = Math.sqrt(a*a + b*b - (2*a*b*Math.cos(angle)));
		System.out.println(ans);
	}
}