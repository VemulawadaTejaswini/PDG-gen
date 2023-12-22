/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		String s = in.next();
		String new_s = s.substring(0,k);
		if(s.length()>k){
			System.out.println(new_s + "...");
		}else{
			System.out.println(s);
		}
	}
}