// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] dd = new int[8];
	int[] qu = new int[9], aa = new int[9], aa_ = new int[9]; int k_, l_;
	void sort(int[] aa, int n) {
		Arrays.sort(aa, 0, n);
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			int tmp = aa[i]; aa[i] = aa[j]; aa[j] = tmp;
		}
	}
	int c_;
	void update(int k, int l) {
		if (l_ > l)
			return;
		for (int h = 0; h < k; h++)
			aa[h] = dd[qu[h]];
		int m = Math.min(l, 9);
		for (int h = k; h < m; h++)
			aa[h] = dd[c_];
		sort(aa, m);
		boolean better = false;
		if (l_ < l)
			better = true;
		else
			for (int h = 0; h < l; h++)
				if (aa_[h] != aa[h]) {
					if (aa_[h] < aa[h])
						better = true;
					break;
				}
		if (!better)
			return;
		k_ = k;
		l_ = l;
		for (int h = 0; h < m; h++)
			aa_[h] = aa[h];
	}
	void solve(int c, int n, int k) {
		while (c > c_ && dd[c] == 0)
			c--;
		if (c == c_) {
			if (n % c == 0) {
				int l = k + n / c;
				update(k, l);
			}
			return;
		}
		for (int h = 0; h < c_; h++) {
			solve(c - 1, n, k);
			if (n < c || k == 9)
				break;
			n -= c;
			qu[k++] = c;
		}
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] d2c = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (m-- > 0) {
			int d = sc.nextInt();
			int c = d2c[d];
			dd[c] = Math.max(dd[c], d);
		}
		c_ = 2;
		while (dd[c_] == 0)
			c_++;
		solve(7, n, 0);
		m = Math.min(l_, 9);
		for (int h = 0; h < m; h++)
			if (aa_[h] > dd[c_])
				print(aa_[h]);
		for (int h = k_; h < l_; h++)
			print(dd[c_]);
		for (int h = 0; h < m; h++)
			if (aa_[h] < dd[c_])
				print(aa_[h]);
		println();
	}
}
