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
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int count=0;
		for(int j : arr){
			if((j&1)==0){
				if(!((j%3==0)||(j%5==0))){
					count =1;
					System.out.println("DENIED");
				}
			}
		}
		if(count==0){
		System.out.println("APPROVED");
		}
		// your code goes here
	}
}