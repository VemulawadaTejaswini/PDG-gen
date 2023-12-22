/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		Arrays.sort(arr);
		int q = sc.nextInt();
		while(q-->0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int i = 0; i<n; i++)
			{
				if(a<arr[0]||a>arr[n-1])
				{
					break;
				}
				if(arr[i] == a)
				{
					sum = sum-a+b;
					arr[i] = b;
					for(int j = i+1; j<n; j++)
					{
						if(a == arr[j])
						{
							sum = sum-a+b;
							arr[j]  =b;
						}
						else break;
					}
					break;
				}
			}
			System.out.println(sum);
		}	
	}
}
