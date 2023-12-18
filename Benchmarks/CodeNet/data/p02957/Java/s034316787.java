/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if ((a + b)%2 == 0) {
			System.out.println((a + b)%2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}