import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int mod = 1000000000 + 7;
	static int[][] dp;
	static ArrayList<Integer>[] edges;
	static void dfs(int node, int parent) {
		if(dp[node][0] != -1 && dp[node][1] != -1) return;
		long white = 1, black = 1;
		boolean is_leaf = true;

		for(int edge : edges[node]) {
			if(edge != parent) {
				is_leaf = false;
				if(dp[edge][0] == -1 || dp[edge][1] == -1) dfs(edge, node);
				white *= (long)(dp[edge][0] + dp[edge][1]);
	            black *= (long)dp[edge][0];
	            white %= mod;
	            black %= mod;
			}
		}

		if(is_leaf) {
			dp[node][0] = 1;
			dp[node][1] = 1;
		} else {
			dp[node][0] = (int)white;
			dp[node][1] = (int)black;
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		edges = new ArrayList[N];
		for(int i = 0; i < N; i++) edges[i] = new ArrayList<Integer>();
		for(int i = 0; i < N - 1; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			edges[x - 1].add(y - 1);
			edges[y - 1].add(x - 1);
		}
		dp = new int[N][2];
		for(int j = 0; j < 2; j++) for(int i = 0; i < N; i++) dp[i][j] = -1;
		dfs(0, -1);
		System.out.println((dp[0][0] + dp[0][1]) % mod);
	}
}