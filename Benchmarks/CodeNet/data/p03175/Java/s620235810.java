
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int mod = (int) 1e9 + 7;

	static ArrayList<Integer>[] g;
	static boolean leaf[];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n == 1) {
			System.out.println(2);
			return;
		}
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int x = scn.nextInt() - 1;
			int y = scn.nextInt() - 1;
			g[x].add(y);
			g[y].add(x);
		}
		int color[] = new int[n];
		for (int i = 0; i < n; i++) {
			color[i] = -1;
		}
		long dp[][] = new long[2][n];
		for (long v[] : dp) {
			Arrays.fill(v, -1);
		}
		
		long ans=0;
		ans=dfs(0, -1, 0, dp, color);
		ans=(ans+dfs(0, -1, 1, dp, color))%mod;
		System.out.println(ans);
	}

	private static long dfs(int sr, int pa, int col, long[][] dp, int[] color) {
		color[sr] = col;
	
		if (dp[col][sr] != -1) {
			return dp[col][sr];
		}
		long res = 1;
		for (int nei : g[sr]) {
			if (nei != pa) {
				if (color[sr] == 0) {
					res = (res* dfs(nei, sr, 1, dp, color))%mod;
				} else {
					res = (res*(dfs(nei, sr, 1, dp, color)+dfs(nei, sr, 0, dp, color))%mod)%mod;
				}
			}
		}
		dp[col][sr] = res%mod;
		return res;
	}

}