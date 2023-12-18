
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int mod(int a)
	{
		if (a>=0)return a;
		else return -1*a;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for (int i=0 ; i<n  ;i++)
		arr[i]=in.nextInt();
		int sum_1=mod(arr[1]-arr[0]);
		int sum_2=mod(arr[2]-arr[0]);
		for (int i=3 ; i<n ; i++)
		{
			int tempsum_1=sum_1+mod(arr[i]-arr[i-2]);
			int tempsum_2=sum_2+mod(arr[i]-arr[i-1]);
			if (tempsum_1<tempsum_2)
			{
				sum_1=sum_2;
				sum_2=tempsum_1;
			}
			else
			{
				sum_1=sum_2;
				sum_2=tempsum_2;
			}
			
		}
		System.out.println(sum_2);
		
	}
}