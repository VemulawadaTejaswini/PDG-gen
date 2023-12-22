/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws IOException
	{
		int x;
		String xx; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		xx = br.readLine();
		x = Integer.parseInt(xx);
		System.out.println(x * x * x);
	}
}