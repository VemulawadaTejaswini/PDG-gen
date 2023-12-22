import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] P = new int[N][D];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < D; ++j) {
				P[i][j] = sc.nextInt();
			}
		}
		int INF = 1 << 28;
		int[][][] dp = new int[D + 1][N][D + 1];
		int[][][] prev = new int[D + 1][N][D + 1];
		for (int[][] aa : dp) {
			for (int[] a : aa) {
				Arrays.fill(a, INF);
			}
		}
		for (int i = 0; i < N; ++i) {
			dp[0][i][0] = 0;
		}
		for (int i = 0; i < D; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = 0; k < N; ++k) {
					for (int l = 0; l <= i; ++l) {
						if (dp[i][k][l] == INF) continue;
						if (j == k) {
							if (dp[i][k][l] + P[j][i] < dp[i + 1][j][l]) {
								dp[i + 1][j][l] = dp[i][k][l] + P[j][i];
								prev[i + 1][j][l] = k;
							}
						} else {
							if (dp[i][k][l] + P[j][i] < dp[i + 1][j][l + 1]) {
								dp[i + 1][j][l + 1] = dp[i][k][l] + P[j][i];
								prev[i + 1][j][l + 1] = k;
							}
						}
					}
				}
			}
		}

		int min = INF;
		int minM = 0;
		int minH = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j <= D; ++j) {
				if (dp[D][i][j] < min) {
					min = dp[D][i][j];
					minM = j;
					minH = i;
				}
			}
		}
		int move = minM;
		int[] path = new int[D];
		for (int i = 0; i < D; ++i) {
			path[D - 1 - i] = minH;
			int p = prev[D - i][minH][move];
			if (p != minH) --move;
			minH = p;
		}
		System.out.println(min + " " + minM);
		for (int i = 0; i < D; ++i) {
			System.out.println(path[i] + 1);
		}
	}
}