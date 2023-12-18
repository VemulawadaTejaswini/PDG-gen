import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	final static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		solve(in, System.out);
		in.close();
	}

	protected static void solve(Scanner in, PrintStream out) {
		int n = in.nextInt();
		int[][] a = new int[n][3];
		for (int j = 0; j < n; j++) {
			a[j][0] = in.nextInt();
			a[j][1] = in.nextInt();
			a[j][2] = in.nextInt();
		}
		int ret = solveLine(n, a);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static int solveLine(int n, int[][] ar) {
		int[][] dp = new int[n + 2][3];
		dp[0][0] = dp[0][1] = dp[0][2] = 0;
		for (int i = 0; i < n; i++) {
			dp[i+1][0] = max(dp[i][1],dp[i][2]) + ar[i][0];
			dp[i+1][1] = max(dp[i][0],dp[i][2]) + ar[i][1];
			dp[i+1][2] = max(dp[i][0],dp[i][1]) + ar[i][2];
		}
		return max(dp[n][0], max(dp[n][1],dp[n][2]));
	}

}