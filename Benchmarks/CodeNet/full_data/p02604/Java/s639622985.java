import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		long[] P = new long[N];
		for(int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		long inf = (1L << 62);
		long[] cost = new long[1 << N];
		long[][] dp = new long[1 << N][N + 1];
		for(int i = 0; i < 1 << N; ++i) {
			cost[i] = inf;
			for(int j = 0; j < N; ++j) {
				if(((i >> j) & 1) == 0) continue;
				long sumx = 0, sumy = 0;
				for(int k = 0; k < N; ++k) {
					if(((i >> k) & 1) == 0) continue;
					sumx += Math.abs(X[j] - X[k]) * P[k];
					sumy += Math.abs(Y[j] - Y[k]) * P[k];
				}
				cost[i] = Math.min(cost[i], sumx);
				cost[i] = Math.min(cost[i], sumy);
			}
			for(int j = 1; j <= N; ++j) {
				dp[i][j] = inf;
			}
			for(int j = 0; j < N; ++j) {
				if(((i >> j) & 1) == 1) {
					dp[i][0] += Math.min(Math.abs(X[j]), Math.abs(Y[j])) * P[j];
				}
			}
		}
		int[] bitcnts = new int[1 << N];
		for(int i = 0; i < 1 << N; ++i) {
			bitcnts[i] = 0;
			for(int j = 0; j < N; ++j) {
				bitcnts[i] += ((i >> j) & 1);
			}
		}
		for(int i = 0; i < 1 << N; ++i) {
			for(int j = i; j >= 1; j = (j - 1) & i) {
				int last = bitcnts[i - j];
				for(int k = 0; k <= last; ++k) {
					dp[i][k + 1] = Math.min(dp[i][k + 1], dp[i - j][k] + cost[j]);
				}
			}
		}
		for(int i = 0; i <= N; ++i) {
			System.out.println(dp[(1 << N) - 1][i]);
		}
	}
}