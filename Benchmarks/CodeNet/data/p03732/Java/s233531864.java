import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
	static Map<String,Long> dpa;
	static int N,W;
	static long[][] table;
	static long[][] dp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		W=sc.nextInt();
		dp=new long[N+1][W+1];
		table=new long[N][2];
		if(N*W<=1000000) {

			for(int i=0; i<=N; i++) {
				for(int j=0; j<=W; j++) {
					dp[i][j]=0;
				}
			}

			for(int i=0; i<N; i++) {
				table[i][0]=sc.nextLong();
				table[i][1]=sc.nextLong();
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<=W; j++) {
					if(j-table[i][0]>=0) {
						dp[i+1][j]=Math.max(dp[i][j], dp[i][(int) (j-table[i][0])]+table[i][1]);
					}
					else {
						dp[i+1][j]=dp[i][j];
					}
				}
			}
			System.out.println(dp[N][W]);
		}
		else {
			dpa = new HashMap<>();
			long ans = dfs(0,W);
			System.out.println(ans);
		}
	}
	static long dfs(int n, long w) {
		if (dpa.get(getKey(n,w))!=null) {
			return dpa.get(getKey(n,w));
		}
		long res;
		if (n==N) {
			res=0;
		}else if(w<table[n][1]) {
			res = dfs(n+1, w);
		}else{
			res = Math.max( dfs(n+1, w), dfs(n+1, w-table[n][1])+table[n][0]);
		}
		dpa.put(getKey(n,w), res);
		return res;
	}

	static String getKey(int n, long w){
		return String.format("%d.%d", n,w);
	}

}