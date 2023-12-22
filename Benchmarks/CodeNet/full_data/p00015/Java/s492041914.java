/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
 		String s1, s2;
 		for(int i = 0; i < q; ++i){
 			s1 = sc.next();
 			s2 = sc.next();
 			BigInteger n1 = new BigInteger(s1, 10);
 			BigInteger n2 = new BigInteger(s2, 10);
 			BigInteger ans = n1.add(n2);
 			String sa = ans.toString(10);
 			if(sa.length() > 80){
 				System.out.println("overflow");	
 			}
 			else{
 				System.out.println(sa);
 			}
 		}	
	}
}