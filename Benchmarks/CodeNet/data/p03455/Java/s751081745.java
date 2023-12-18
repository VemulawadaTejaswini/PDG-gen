/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String s1 = input.readLine();
		String s2 = input.readLine();
		String s3=s1+s2;
		int result = Integer.parseInt(s3);
		int a=(int)Math.pow(result,0.5);
		if((int)Math.pow(a,2)==result)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}