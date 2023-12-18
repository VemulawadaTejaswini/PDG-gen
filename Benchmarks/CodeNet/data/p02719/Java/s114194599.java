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
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bu.readLine().split(" ");
		Long n=Long.parseLong(s[0]),m=Long.parseLong(s[1]);
		n%=m;
		if(Math.abs(n-m)<n) n=Math.abs(n-m);
		System.out.print(n);
	}
}