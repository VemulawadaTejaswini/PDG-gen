import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ways = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int a=0;a<ways;a++)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			arr[l-1][r-1] = 1;
			arr[r-1][l-1] = 1;	
		}
		int[][] ans = new int[2][n];
		for(int i=0;i<n;i++)
		{
			ans[1][i] = Integer.MAX_VALUE;
		}
		giveout(arr,ans,n);
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(ans[1][i]<Integer.MAX_VALUE)
				count++;
		}
		if(count == n)
		{
			System.out.println("Yes");
			for(int i=1;i<n;i++)
			{
				System.out.println(ans[0][i]+1);
			}
		}
		else{
			System.out.println("No");
		}
	}
	static void giveout(int[][] arr, int[][] ans,int n)
	{
		ans[1][0] = 0;
		Boolean[] st = new Boolean[n];
		for(int i=0;i<n;i++)
		{
			st[i] = false;
		}
		for(int j=0;j<n;j++)
		{
			int ver = 0;
			int min = Integer.MAX_VALUE;
			int index = -1;
			int i = 0;
			for(i=0;i<n;i++)
			{
				if(st[i] == false && ans[1][i] <= min)
				{
					min = ans[1][i];
					index = i;
				}
			}
			st[index] = true;
			for(i=0;i<n;i++)
			{
				if(st[i] == false && ans[1][i]>=min+1 && arr[index][i] != 0 && min!=Integer.MAX_VALUE)
				{
					ans[1][i] = min+1;
					ans[0][i] = index;
				}
			}
		}
	}
}