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
		int k = sc.nextInt();
		int[] tt = new int[n];
		int[] dd = new int[n];
		Integer[] ii = new Integer[n];
		for (int i = 0; i < n; i++) {
			tt[i] = sc.nextInt();
			dd[i] = sc.nextInt();
			ii[i] = i;
		}
		Arrays.sort(ii, (i, j) -> tt[i] != tt[j] ? tt[i] - tt[j] : dd[j] - dd[i]);
		Integer[] jj = new Integer[n];
		int n_ = 0, m = 0;
		for (int i = 0; i < n; i++)
			if (i == 0 || tt[ii[i - 1]] != tt[ii[i]])
				jj[m++] = ii[i];
			else
				ii[n_++] = ii[i];
		n = n_;
		Arrays.sort(jj, 0, m, (i, j) -> dd[j] - dd[i]);
		long[] pp = new long[n + 1];
		long[] qq = new long[m + 1];
		for (int i = 0; i < n; i++)
			pp[i + 1] = pp[i] + dd[ii[i]];
		for (int j = 0; j < m; j++)
			qq[j + 1] = qq[j] + dd[jj[j]];
		long ans = 0;
		for (int x = Math.max(1, k - n); x <= k && x <= m; x++)
			ans = Math.max(ans, qq[x] + pp[k - x] + (long) x * x);
		println(ans);
	}
}
