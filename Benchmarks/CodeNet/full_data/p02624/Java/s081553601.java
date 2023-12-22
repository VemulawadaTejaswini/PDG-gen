/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechefs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	  
	    long s=0;
	    for (long j=1; j<=n; j++)
	    {
	          long c=0;
	    for (long i=1; i<=Math.sqrt(j); i++) 
        { 
            if (j%i==0) 
            { 
                // If divisors are equal, print only one 
                if (j/i == i) 
                    c++; 
       
                else // Otherwise print both 
                    c+=2;
            } 
        } 
        s+=j*c;
    }
        System.out.print(s);
	   }
}