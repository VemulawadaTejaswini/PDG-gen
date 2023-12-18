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
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bu.readLine().split(" ");
		int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]),z=Integer.parseInt(s[2]);
		x=x^y^(y=x);
		x=x^z^(z=x);
		System.out.print(x+" "+y+" "+z);
	}
}