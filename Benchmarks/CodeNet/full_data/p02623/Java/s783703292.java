//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		long sum=0;
		int a[]=new int[n];
		int b[]=new int[m];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
		
		/*
		Stack<Integer> s1=new Stack<>();
		
		Stack<Integer> s2=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			s1.push(a[i]);
		}
		
		for(int j=0;j<m;j++)
		{
			s2.push(b[j]);
		}
		*/
		int dp[][]=new int[n+1][m+1];
		
		for(int j[]:dp)
		{
			Arrays.fill(j,-1);
		}
		
		
		
		System.out.println(solve(a,b,0,0,k,0,dp));
		
	}
	
	public static int solve(int a[],int b[],int i,int j,int k,long sum,int dp[][])
	{
		if(dp[i][j]!=-1)
		{
			return -1;
		}
		if(sum>k)
		{
			return -1;
		}
		if(sum==k)
		{
			return 0;
		}
		if(i>=a.length && j>=b.length)
		{
			return 0;
		}
		int option1=0;
		int option2=0;
		if(i<a.length)
		{
			option1=1+solve(a,b,i+1,j,k,sum+a[i],dp);
		}
		if(j<b.length)
		{
			option2=1+solve(a,b,i,j+1,k,sum+b[j],dp);
		}
		
		
		return dp[i][j]=Math.max(option1,option2);
	}
	
	

}
