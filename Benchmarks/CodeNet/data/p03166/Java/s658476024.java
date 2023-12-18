import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] edge;
	static int[] dp;
	static boolean[] visited;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		edge=new ArrayList[n];
		dp=new int[n];
		visited=new boolean[n];
		for(int i=0; i<n; i++){
			edge[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			edge[x].add(y);
		}
		int ans=0;
		for(int i=0; i<n; i++){
			if(!visited[i]){
				dfs(i);
				ans=Math.max(ans,dp[i]);
			}
		}
		System.out.println(ans);
	}
	static void dfs(int now){
		visited[now]=true;
		for(int i:edge[now]){
			if(!visited[i]){
				dfs(i);
			}
			dp[now]=Math.max(dp[now],dp[i]+1);
		}
	}
}
