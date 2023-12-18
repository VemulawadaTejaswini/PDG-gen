

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long dp[];
	static ArrayList<Integer> adj[];
	public static long dfs(int u)
	{
		
		if(adj[u].size()==0)
		{
			return 0;
		}
		if(dp[u]!=-1)
			return dp[u];
		for(int x:adj[u])
		{
			dp[u]=Math.max(dp[u],1+dfs(x));
		}
		return dp[u];
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
		dp=new long [n];
		for(int i=0;i<m;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;
			v--;
			adj[u].add(v);
		}
		Arrays.fill(dp,-1);
		long ans=0;
		for(int i=0;i<n;i++)
		{
			ans=Math.max(ans, dfs(i));
		}
		System.out.println(ans);
		
		
	}
}
