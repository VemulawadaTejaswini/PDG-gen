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
		int m = sc.nextInt();
		int[][] aa = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				aa[i][j] = sc.nextInt();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				aa[i][j] = Math.abs(aa[i][j] - sc.nextInt());
		int d = (n + m - 1) * 80;
		boolean[][][] dp = new boolean[n][m][d + 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				int a = aa[i][j];
				if (i == 0 && j == 0) {
					dp[i][j][a] = true;
					continue;
				}
				if (i > 0)
					for (int b = 0; b <= d; b++)
						if (dp[i - 1][j][b]) {
							int c = a + b;
							if (c <= d)
								dp[i][j][c] = true;
							c = Math.abs(a - b);
							dp[i][j][c] = true;
						}
				if (j > 0)
					for (int b = 0; b <= d; b++)
						if (dp[i][j - 1][b]) {
							int c = a + b;
							if (c <= d)
								dp[i][j][c] = true;
							c = Math.abs(a - b);
							dp[i][j][c] = true;
						}
			}
		int c = 0;
		while (!dp[n - 1][m - 1][c])
			c++;
		println(c);
	}
}
