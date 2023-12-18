
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static long mod = (long) 1e9 + 7;
	static long dp[][];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int mat[][] = new int[n][n];
		dp = new long[n][1<<22];
		for(long v[]:dp){
			Arrays.fill(v, -1);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scn.nextInt();
				
			}
		}

		long ans = dfs(mat, 0, 0, 0);
		System.out.println(ans);

	}

	private static long dfs(int[][] mat, int i, int pla, int vis) {
		if (pla == mat.length) {
			return 1;
		}
		if (dp[i][vis] != -1) {
			return dp[i][vis];
		}
		long res = 0;
		for (int j = 0; j < mat.length; j++) {
			if ( (vis&(1<<j))==0 && mat[i][j] == 1) {
				vis=vis^(1<<j);
				res = (res + dfs(mat, i + 1, pla + 1, vis)) % mod;
				vis=vis^(1<<j);
			}

		}

		dp[i][vis] = res % mod;
		return dp[i][vis];

	}
}