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
		
		int i = 0;
		int arr[];
		while( sc.hasNext() ){
			arr = new int[2];
			
    		String line[] = sc.nextLine().split(" ");
			arr[0] = Integer.parseInt(line[0]);
			arr[1] = Integer.parseInt(line[1]);
			
    		System.out.println(String.valueOf(arr[0]+arr[1]).length());
		}
	}
}