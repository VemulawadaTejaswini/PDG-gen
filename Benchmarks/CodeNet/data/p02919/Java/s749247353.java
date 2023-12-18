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
		int[] ii = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			ii[a] = i;
		}
		boolean[] used = new boolean[n + 2];
		int[] ll = new int[n + 2];
		int[] rr = new int[n + 2];
		long ans = 0;
		for (int a = 1; a <= n; a++) {
			int i = ii[a], l = i, r = i;
			used[i] = true;
			if (used[l - 1])
				l = ll[l - 1];
			if (used[r + 1])
				r = rr[r + 1];
			rr[l] = r; ll[r] = l;
			if (r < n) {
				int p = i - l + 1;
				int q = used[r + 2] ? rr[r + 2] - r : 1;
				ans += (long) p * q * a;
			}
			if (l > 1) {
				int p = used[l - 2] ? l - ll[l - 2] : 1;
				int q = r - i + 1;
				ans += (long) p * q * a;
			}
		}
		println(ans);
	}
}
