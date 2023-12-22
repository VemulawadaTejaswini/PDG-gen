/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		Integer n = (Integer)in.nextInt();
		Integer[] arr = new Integer[n];
		for(int i =0;i<n;i++){
			arr[i] = (Integer)in.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		int sum = 0;		
		
		for(int i=1;i<n;i++){
			if(i==1){
				sum+= arr[0];
			}else{
				sum += arr[i/2];
			}
		}
		System.out.println(sum);
		// your code goes here
	}
}