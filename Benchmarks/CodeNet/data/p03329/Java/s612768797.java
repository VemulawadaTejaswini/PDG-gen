import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE / 2);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			if (i + 1 <= n) {
				dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
			}
			for (int j = 0, tmp = 6; true; j++, tmp *= 6) {
				if (i + tmp <= n) {
					dp[i + tmp] = Math.min(dp[i + tmp], dp[i] + 1);
				} else {
					break;
				}
			}
			for (int j = 0, tmp = 9; true; j++, tmp *= 9) {
				if (i + tmp <= n) {
					dp[i + tmp] = Math.min(dp[i + tmp], dp[i] + 1);
				} else {
					break;
				}
			}
		}

		pr.println(dp[n]);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
