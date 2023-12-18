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
		int p = sc.nextInt();
		int[] ii = new int[m];
		int[] jj = new int[m];
		int[] ww = new int[m];
		for (int h = 0; h < m; h++) {
			ii[h] = sc.nextInt() - 1;
			jj[h] = sc.nextInt() - 1;
			ww[h] = sc.nextInt() - p;
		}
		int[] dd = new int[n]; Arrays.fill(dd, -INF); dd[0] = 0;
		for (int k = 0; k < n * 2; k++) {
			boolean updated = false;
			for (int h = 0; h < m; h++) {
				int i = ii[h], j = jj[h], d = dd[i] + ww[h];
				if (dd[j] < d) {
					dd[j] = d;
					if (j == n - 1)
						updated = true;
				}
			}
			if (updated && k >= n) {
				println(-1);
				return;
			}
		}
		println(Math.max(dd[n - 1], 0));
	}
}
