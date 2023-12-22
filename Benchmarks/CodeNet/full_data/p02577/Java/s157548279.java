/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    String str=scan.next();
	    long c=0;
	    for(int i=0;i<str.length();i++)
	    {
	        c+=(str.charAt(i)-'0');
	    }
	    if(c%9 == 0)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}
