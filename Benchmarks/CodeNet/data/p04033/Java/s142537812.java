/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		long a=in.nextInt();
		long b=in.nextInt();
		long a1=Math.min(a,b);
		long b1=Math.max(a,b);
		if(a1>0){
			System.out.println("Positive");
			return;
		}
		if(b1>=0){
			System.out.println("Zero");
		return;
			
		}
		System.out.println("Positive");
	}
}