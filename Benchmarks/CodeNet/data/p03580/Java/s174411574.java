import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Main().solve();
	}

	public void run() {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() + 2;
		String s = sc.next() + "00";
		int[] a = new int[n];
		int[] sz = new int[n];
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == '1') {
				a[i] = 1;
			} else {
				a[i] = 0;
			}
		}
		for (int i = 0; i < n; ++i) {
			if (a[i] == 1) {
				++sz[i];
				if (i > 0)
					sz[i] += sz[i - 1];
			}
		}

		int[] dp = new int[n];
		for (int i = 2; i < n; ++i) {
			dp[i] = dp[i - 1];
			if (a[i] == 0)
				continue;
			if (a[i - 1] == 0 && a[i - 2] == 1) {
				dp[i] = Math.max(dp[i], sz[i - 2] + (i - 2 - sz[i - 2] >= 0 ? dp[i - 2 - sz[i - 2]] : 0));
			}
			if (i - sz[i] - 1 >= 0 && a[i - sz[i] - 1] == 1) {
				dp[i] = Math.max(dp[i], sz[i] + (i - 2 - sz[i] >= 0 ? dp[i - 2 - sz[i]] : 0));
			}
		}
		System.out.println(dp[n - 1]);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
