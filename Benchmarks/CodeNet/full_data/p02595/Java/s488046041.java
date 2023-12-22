/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double d = scan.nextInt();
		int count = 0;
		
		while(n-- >0){
			int x = scan.nextInt();
			int y = scan.nextInt();
			double dis = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			if(dis<=d){
				count++;
			}
		}
		System.out.println(count);
	}
}