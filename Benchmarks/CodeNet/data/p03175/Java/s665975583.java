import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] edge;
	static long mod=1000000007;
	static long[][] dp;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		edge=new ArrayList[n];
		dp=new long[2][n];
		Arrays.fill(dp[0],1);
		Arrays.fill(dp[1],1);
		for(int i=0; i<n; i++){
			edge[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			edge[x].add(y);
			edge[y].add(x);
		}
		dfs(0,0);
		System.out.println((dp[1][0]+dp[0][0])%mod);
	}
	static void dfs(int now,int from){
		for(int i:edge[now]){
			if(i!=from){
				dfs(i,now);
				dp[0][now]=(dp[0][now]*(dp[0][i]+dp[1][i]))%mod;
				dp[1][now]=dp[1][now]*dp[0][i]%mod;
			}
		}
	}
}