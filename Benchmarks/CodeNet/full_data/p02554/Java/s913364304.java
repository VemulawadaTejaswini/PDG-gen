import java.math.BigInteger; 
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	       long n=sc.nextLong();
	       long res=n*n-n;
	       long q =1000000007;
	       res%=q;
	      //BigInteger ten = new BigInteger("10");
	    //BigInteger prod = new BigInteger("1");
      BigInteger qr = new BigInteger("1000000007");BigInteger ten = new BigInteger("10");
	    // prod=prod.multiply(BigInteger.valueOf(n)).multiply(BigInteger.valueOf(n-1));
      //for(int i=0;i<n-2;i++)
       // prod=prod.multiply(BigInteger.valueOf(10));
       if(n>2) {ten=ten.pow((int)n-2);
       ten=ten.mod(qr);
       Long tan=ten.longValue();
       res=(res%q)*(tan%q)%q;
       }
      //prod=prod.mod(q);
      
	     System.out.println(res);
	     
	        // your code goes here
	
	        
	    
	    
	}
}
