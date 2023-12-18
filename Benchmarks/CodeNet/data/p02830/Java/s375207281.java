/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int n =  Integer.parseInt(a);
		String s = sc.nextLine();
		
		String[] arr = s.split(" ");
		
		StringBuffer sb = new StringBuffer("");
		
		for(int i = 0; i<n;i++){
			sb.append(arr[0].charAt(i));
			sb.append(arr[1].charAt(i));
		}
		
		System.out.println(sb.toString());
	}
}