import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] edge;
	static long mod=1000000007;
	static long[][] dp;
	static long ans;
	static boolean[] visited;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		edge=new ArrayList[n];
		dp=new long[n][2];
		visited=new boolean[n];
		for(int i=0; i<n; i++){
			Arrays.fill(dp[i],1);
		}
		for(int i=0; i<n; i++){
			edge[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			edge[x].add(y);
			edge[y].add(x);
		}
		for(int i=0; i<n; i++){
			if(!visited[i]){
				dfs(i,i,0);
				dfs(i,i,1);
				ans=(dp[i][0]+dp[i][1])%mod;
			}
		}
		System.out.println(ans);
	}
	static void dfs(int now,int from,int black){
		if(visited[now]){
			return;
		}
		visited[now]=true;
		for(int i:edge[now]){
			if(i!=from){
				dfs(i,now,0);
				dfs(i,now,1);
				dp[now][0]=(dp[now][0]*(dp[i][0]+dp[i][1]))%mod;
				dp[now][1]=dp[now][1]*dp[i][0]%mod;
			}
		}
	}
}