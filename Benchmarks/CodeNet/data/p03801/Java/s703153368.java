// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int[] aa = new int[n + 1];
		for (int i = 1; i <= n; i++)
			aa[i] = sc.nextInt();
		Integer[] ii = new Integer[n + 1];
		for (int i = 0; i <= n; i++)
			ii[i] = i;
		Arrays.sort(ii, (i, j) -> aa[j] - aa[i]);
		long[] kk = new long[n + 1];
		for (int h = 0, h_, i = n, i_; h < n; h = h_) {
			int a = aa[ii[h]];
			h_ = h;
			while (aa[i_ = ii[h_]] == a) {
				i = Math.min(i, i_);
				h_++;
			}
			int b = aa[ii[h_]];
			kk[i] += (long) (a - b) * h_;
		}
		for (int i = 1; i <= n; i++)
			println(kk[i]);
	}
}
