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
		long s = sc.nextLong();
		long c = sc.nextLong();
		long count = 0;
		
		if(s * 2 > c) {
			count = c / 2;
		} else {
			count = s + (c - s * 2) / 4;
		}

		System.out.println(count);
	}
}