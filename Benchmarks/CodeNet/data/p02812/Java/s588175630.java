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
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String c=s.next();
		
		int count=0;
		for(int i=2;i<n;i++)
		{if(c.charAt(i-2)=='A' && c.charAt(i-1)=='B' && c.charAt(i)=='C')
		count++;}
		System.out.println(count);
	}
}