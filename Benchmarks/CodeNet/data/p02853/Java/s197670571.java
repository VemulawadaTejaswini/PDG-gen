/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		long ans=0;
		if(n==1 && m==1)
		{ans=1000000;}
		else
		{if(n==1 || m==1)
		ans+=300000;
		if(n==2 || m==2)
		ans+=200000;
		if(n==3 || m==3)
		ans+=100000;
	}
	System.out.println(ans);
}
}