import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int N;
	static int M;
	static int K;
	static int P;
	static int[][] dp;
	static int[] s;
	static int[] t;
	static int INF = 2 << 27;
	static int CHECK;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		P = sc.nextInt();
		dp = new int[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dp[i], INF);
			dp[i][i] = 0;
		}
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int w = sc.nextInt();
			dp[x][y] = w;
			dp[y][x] = w;
		}
		s = new int[K];
		t = new int[K];
		for(int i = 0; i < K; i++) {
			s[i] = sc.nextInt()-1;
			t[i] = sc.nextInt()-1;
		}
		for(int i = 0; i < K; i++) {
			CHECK |= 1 << i;
		}
		
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(dp[i][j] > dp[i][k] + dp[k][j]) {
						dp[i][j] = dp[i][k] + dp[k][j];
					}
				}
			}
		}
		int ans = dfs(P-1,0,0,0);
		
		if(ans == INF) {
			System.out.println("Cannot deliver");
		}
		else {
			System.out.println(ans);
		}
	}
	static int dfs(int now, int sS, int tS,int cost) {
		if(sS == CHECK && tS == CHECK) return cost;
		int ret = INF;
		for(int i = 0; i < s.length; i++) {
			if((sS & 1 << i) != 0 || dp[now][s[i]] == INF) continue;
			ret = Math.min(ret, dfs(s[i],sS | 1 << i,tS,cost + dp[now][s[i]]));
		}
		for(int i = 0; i < t.length; i++) {
			if((tS & 1 << i) != 0 || (sS & 1 << i) == 0 || dp[now][t[i]] == INF) continue;
			ret = Math.min(ret, dfs(t[i],sS,tS | 1 << i,cost + dp[now][t[i]]));
		}
		return ret;
	}
}