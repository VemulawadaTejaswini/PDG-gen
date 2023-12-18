/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner sc=new Scanner (System.in);
		
		int ass=0;
		int nod=sc.nextInt();
		int t=sc.nextInt();
		while (t>0)
		{
		    ass=ass+sc.nextInt();
		    t--;
		}
		if(nod>=ass)
		System.out.println(nod-ass);
		else System.out.println(-1);
		
	}
}
