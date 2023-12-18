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
		String result = "";
		while(sc.hasNext()) {
			String word = sc.next();
			char first = word.charAt(0);
			result += first;
		}
		System.out.println(result.toUpperCase());
	}
}