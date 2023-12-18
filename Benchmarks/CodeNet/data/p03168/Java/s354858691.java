import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static int MAX;
	static Double dp[][];
	static Double tailProd[];

	static void pre(double ar[])
	{
		tailProd=new Double[ar.length];
		
		tailProd[0]=(1-ar[0]);
		for(int i=1;i<ar.length;i++)
			tailProd[i]=tailProd[i-1]*(1-ar[i]);
	}

	static double maxProbility(double ar[], int n, int k)
	{
		if(n==0)
			return (k==0)?1.0: 0;
		if(k==0)
		{
			return tailProd[n-1];
		}

		if(dp[n][k]!=null)
			return dp[n][k];
		
		double  prod1=0.0, prod2=0.0;

		if(dp[n-1][k-1]==null)
			prod1 = (maxProbility(ar, n-1, k-1)*ar[n-1]);
		else
			prod1 = dp[n-1][k-1]*ar[n-1];

		if(dp[n-1][k]==null)
			prod2 = (maxProbility(ar, n-1, k)*(1-ar[n-1]));
		else
			prod2 = dp[n-1][k]*(1-ar[n-1]);

		return dp[n][k] = (prod1+prod2);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double ar[]=new double[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextDouble();
		}

		double ans=0;
		dp=new Double[n+1][n+1];
		pre(ar);

		for(int k=(n/2)+1;k<=n;k++)
		{
			ans += maxProbility(ar, n, k);
		}

		System.out.println(ans);
	}
}