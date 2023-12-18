/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	   String s = sc.next();
	   String year =("2018");
	   String month = s.substring(4);
	   System.out.println(year + month);	
	}
}