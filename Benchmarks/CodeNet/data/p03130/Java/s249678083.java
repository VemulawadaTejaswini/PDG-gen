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
		int[] arr = new int[5];
		for(int i = 0; i < 6; i++) {
			arr[sc.nextInt()]++;
		}
		System.out.println(valid(arr[1]) && valid(arr[2]) && valid(arr[3]) && valid(arr[4]) ? "YES" : "NO");
	}
	
	public static boolean valid(int num) {
		return num > 0 && num < 3;
	}
}