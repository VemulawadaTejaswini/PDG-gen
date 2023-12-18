import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int n = scn.nextInt();
	int m =scn.nextInt();
	ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
	for(int i=0;i<=n;i++)
	{
		adj.add(new ArrayList<Integer>());
	}
	for(int i=0;i<m;i++)
	{
		int x = scn.nextInt();
		int y = scn.nextInt();
		adj.get(x).add(y);
	}
	boolean []visited = new boolean[n+1];
	int[]dp = new int[n+1];
	Arrays.fill(dp, -1);
	int max=0;
	for(int i=1;i<=n;i++)
	{
		if(!visited[i]) {
		int d= dfs(i,adj,visited,dp);
		  max=Math.max(max,d);
		}
	}
	System.out.println(max);
	
	
}
   public static int dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean[]visited,int[]dp)
   {
	   if(dp[v]!=-1)
	   {
		   return dp[v];
	   }
	   visited[v]=true;
	   int max=0;
	   for(int nbr:adj.get(v))
	   {
		   if(!visited[nbr])
		   max=Math.max(max, 1+ dfs(nbr,adj,visited,dp)) ;
	   }
	   visited[v]=false;
	   dp[v]=max;
	   return max;
   }
}
