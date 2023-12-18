// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] aa = new int[n];
		int[] bb = new int[m];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		for (int j = 0; j < m; j++)
			bb[j] = sc.nextInt();
		int[][] dp = new int[n + 1][m + 1];
		dp[0][0] = 1;
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= m; j++)
				if (i == 0 && j == 0)
					dp[i][j] = 1;
				else {
					int x = 0;
					if (i > 0)
						x = (x + dp[i - 1][j]) % MD;
					if (j > 0)
						x = (x + dp[i][j - 1]) % MD;
					if (i > 0 && j > 0 && aa[i - 1] != bb[j - 1])
						x = (x - dp[i - 1][j - 1]) % MD;
					dp[i][j] = x;
				}
		int ans = dp[n][m];
		if (ans < 0)
			ans += MD;
		println(ans);
	}
}
