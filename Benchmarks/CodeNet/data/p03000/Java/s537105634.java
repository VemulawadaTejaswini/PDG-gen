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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] l=new int[n+1];
		int[] d=new int[n];
		d[0]=0;
		int c=0;
		for(int i=1;i<=n;i++)
		{
			l[i]=sc.nextInt();
			d[i]=d[i-1]+l[i];
			if(d[i]<=x)
			c++;
		}
		System.out.println(c);
	}
}