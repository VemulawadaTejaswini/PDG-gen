/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(b.substring(0, b.length()-1).equals(a)) {
		   System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	}
}
