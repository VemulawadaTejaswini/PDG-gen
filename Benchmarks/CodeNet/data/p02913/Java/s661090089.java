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
		byte[] cc = sc.next().getBytes();
		int[][] dp = new int[n + 1][n + 1];
		for (int i = n - 1; i >= 0; i--)
			for (int j = i + 1; j < n; j++)
				if (cc[i] == cc[j])
					dp[i][j] = dp[i + 1][j + 1] + 1;
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1 + ans; j < n; j++)
				ans = Math.max(ans, Math.min(dp[i][j], j - i));
		println(ans);
	}
}
