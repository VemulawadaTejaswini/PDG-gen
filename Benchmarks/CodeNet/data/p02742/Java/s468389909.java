/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; 


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		BigInteger b1, b2, b3;
		b1 = new BigInteger(a); 
        b2 = new BigInteger(b); 
        b3= b1.multiply(b2);
        BigInteger one=new BigInteger("2");
        BigInteger zero=new BigInteger("0");
        BigInteger two=new BigInteger("1");
        BigInteger modu=b3.mod(one);
        if(modu.compareTo(zero)==0)
        {
        	System.out.println(b3.divide(one));
        }
        else
        {
        	System.out.println(b3.divide(one).add(two));
        }
        }
        
		
		
	}