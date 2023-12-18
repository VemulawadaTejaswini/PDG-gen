// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int INF = 0x3f3f3f3f;
	void main() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] dp = new int[m + 1]; Arrays.fill(dp, INF); dp[0] = 0;
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int x = 0; x < m; x++) {
				int y = Math.min(x + a, m);
				dp[y] = Math.min(dp[y], dp[x] + b);
			}
		}
		println(dp[m]);
	}
}
