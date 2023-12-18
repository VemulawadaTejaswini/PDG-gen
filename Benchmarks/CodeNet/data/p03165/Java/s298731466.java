import static java.lang.Math.max;
import static java.lang.Math.min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
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
//		int n = in.nextInt();
//		int w = in.nextInt();
//		int[] a = new int[n];
//		int[] wt = new int[n];
//		for (int j = 0; j < n; j++) {
//			wt[j] = in.nextInt();
//			a[j] = in.nextInt();
//		}
		String s = in.next();
		String t = in.next();
		String ret = solveLine(s, t);
		out.printf(Locale.ENGLISH, "%s%n", ret);
	}

	private static String solveLine(String s, String t) {
		int lens = s.length(), lent = t.length();
		int[][] dp = new int[lens+1][lent+1];
		for (int i = 1; i <= lens; i++) {
			for (int j = 1; j <= lent; j++) {
				dp[i][j] = max(dp[i][j - 1], dp[i - 1][j]);
				if (s.charAt(i-1) == t.charAt(j-1)) dp[i][j] = dp[i - 1][j - 1] + 1;
			}
		}
		String ans = "";
		for (int col = lent; col > 0; col--) {
			if (dp[lens][col] > dp[lens][col - 1]) ans = t.charAt(col - 1) + ans;
		}
 		return ans;
	}

}