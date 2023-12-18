import static java.lang.Math.abs;
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
		int k = in.nextInt();
		int[] a = new int[n];
		for (int j = 0; j < n; j++) {
			a[j] = in.nextInt();
		}
		int ret = solveLine(n, k, a);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static int solveLine(int n, int k, int[] ar) {
		int[] dp = new int[n + 2];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j <= k && i + j < n; j++) {
				dp[i + j] = min(dp[i + j], dp[i] + abs(ar[i] - ar[i + j]));
			}
		}
		return dp[n - 1];
	}

}