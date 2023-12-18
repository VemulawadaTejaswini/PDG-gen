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
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int x=0;
		if(b>9){
		x=2;
		}
		else x=1;
		int num=a*(int)(Math.pow(10,x))+b;
		int y=(int)Math.pow(num,0.5);
		int z=(int)Math.pow(y,2);
		if(z==num)
		System.out.println("Yes");
		else System.out.println("No");
		
	}
}