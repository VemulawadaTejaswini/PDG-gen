import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		String k = sc.next();
		int d = sc.nextInt();

		int[][][] dp = new int[k.length() + 1][101][2];
		dp[0][0][0] = 1;

		for (int i = 0; i < k.length(); i++) {
			for (int j = 0; j < d; j++) {
				for (int l = 0; l < 2; l++) {
					int c = Character.digit(k.charAt(i), 10);
					for (int next = 0; next < 10; next++) {
						if (next < c) dp[i + 1][(j + next) % d][1] += dp[i][j][l];
						else if (next == c) dp[i + 1][(j + next) % d][l] += dp[i][j][l];
						else if (l == 1) dp[i + 1][(j + next) % d][l] += dp[i][j][l];
						dp[i + 1][(j + next) % d][0] %= M;
						dp[i + 1][(j + next) % d][1] %= M;
					}
				}
			}
		}

		System.out.println((((dp[k.length()][0][0] - 1 + M) % M) + dp[k.length()][0][1]) % M);
	}
}
