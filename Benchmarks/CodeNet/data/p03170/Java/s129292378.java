import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static boolean predictWinner(int ar[], int k)
	{
		if(k==0)
			return false;
		System.out.println(k);
		boolean temp=true;
		for(int i=0;i<ar.length;i++)
		{
			if(k>=ar[i])
				temp = temp && predictWinner(ar, k-ar[i]);
		}
		return (!temp);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();

		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=scan.nextInt();

		boolean dp[]=new boolean[k+1];
		for(int i=1;i<=k;i++)
		{
			boolean temp=false;
			for(int j=0;j<n;j++)
			{
				if(i>=ar[j])
					temp = temp || (!dp[i-ar[j]]);
			}
			dp[i]=temp;
		}

		if(dp[k])
			System.out.println("First");
		else
			System.out.println("Second");

	}
}