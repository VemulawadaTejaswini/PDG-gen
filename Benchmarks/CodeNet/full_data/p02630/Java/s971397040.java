import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		int q = sc.nextInt();
		int[] b = new int[q];
		int[] c = new int[q];
		for(int i=0;i<q;i++)
		{
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			for(int j=0;j<n;j++)
			{
				if(arr[j] == b[i])
				{
					arr[j] = c[i];
					sum = sum+c[i]-b[i];
				}
			}
			System.out.println(sum);
		}
	}
}