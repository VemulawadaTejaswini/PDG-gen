// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int[] aa = new int[n + 1];
		aa[0] = w;
		for (int i = 1; i <= n; i++)
			aa[i] = sc.nextInt();
		int[] dp = new int[n];
		int[] dq = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			dp[i] = dq[i] = Math.abs(aa[i] - aa[n]);
			for (int j = i + 1; j < n; j++) {
				dp[i] = Math.max(dp[i], dq[j]);
				dq[i] = Math.min(dq[i], dp[j]);
			}
		}
		println(dp[0]);
	}
}
