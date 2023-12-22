import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] l = new int[n];
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			l[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}

		int[] dp = new int[400];
		fill(dp, -1);
		dp[0] = 0;

		for (int i = 0; i < n; i++) {
			int[] ndp = dp.clone();
			for (int x = 399; x >= 0; x--) {
				for (int j = s[i]; j <= l[i]; j++) {
					if (x - j >= 0) {
						ndp[x] = max(ndp[x], dp[x - j] + p[i]);
					}
				}
			}
			dp = ndp;
		}


		int m = sc.nextInt();
		int[] ans = new int[m];

		boolean imp = false;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			ans[i] = dp[x];
			if (ans[i] == -1) imp = true;
		}
		if (imp) {
			System.out.println(-1);
		} else {
			for (int x : ans) {
				System.out.println(x);
			}
		}
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}