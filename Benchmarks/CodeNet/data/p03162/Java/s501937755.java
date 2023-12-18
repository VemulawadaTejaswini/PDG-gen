import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static Integer dp[][];

	static int maxhappiness(int n, int prev, int a[], int b[], int c[])
	{
		if(n==0)
			return 0;

		if(dp[n][prev]!=null)
			return dp[n][prev];

		int max = -1;
		if(prev==1)
		{
			int temp = Math.max(b[n-1]+maxhappiness(n-1, 2, a, b, c), c[n-1]+maxhappiness(n-1, 3, a, b, c));
			max = Math.max(max, temp);
		}
		if(prev==2)
		{
			int temp = Math.max(a[n-1]+maxhappiness(n-1, 1, a, b, c), c[n-1]+maxhappiness(n-1, 3, a, b, c));
			max = Math.max(max, temp);
		}
		if(prev==3)
		{
			int temp = Math.max(a[n-1]+maxhappiness(n-1, 1, a, b, c), b[n-1]+maxhappiness(n-1, 2, a, b, c));
			max = Math.max(max, temp);
		}
		if(prev==0)
		{
			int temp = Math.max(a[n-1]+maxhappiness(n-1, 1, a, b, c), c[n-1]+maxhappiness(n-1, 3, a, b, c));
			temp = Math.max(temp, b[n-1]+maxhappiness(n-1, 2, a, b, c));
			max = Math.max(max, temp);
		}
		return dp[n][prev]=max;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
			c[i]=scan.nextInt();
		}

		dp=new Integer[n+1][4];

		int ans = maxhappiness(n, 0, a, b, c);
		System.out.println(ans);
	}
}