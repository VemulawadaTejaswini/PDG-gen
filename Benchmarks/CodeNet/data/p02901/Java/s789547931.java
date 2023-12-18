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
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dp = new int[1 << n]; Arrays.fill(dp, INF); dp[0] = 0;
		while (m-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = 0;
			while (b-- > 0) {
				int c = sc.nextInt() - 1;
				x |= 1 << c;
			}
			for (int y = 0; y < 1 << n; y++)
				if (dp[y] != INF)
					dp[y | x] = Math.min(dp[y | x], dp[y] + a);
		}
		int ans = dp[(1 << n) - 1];
		println(ans == INF ? -1 : ans);
	}
}
