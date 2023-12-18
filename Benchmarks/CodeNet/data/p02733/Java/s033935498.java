// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int count(int b) {
		return b == 0 ? 0 : count(b & b - 1) + 1;
	}
	byte[][] aa, bb;
	void compress(int n, int m, int b) {
		for (int j = 0; j < m; j++)
			bb[0][j] = aa[0][j];
		for (int i = 0, h = 0; h < n - 1; h++)
			if ((b & 1 << h) == 0)
				for (int j = 0; j < m; j++)
					bb[i][j] += aa[h + 1][j];
			else {
				i++;
				for (int j = 0; j < m; j++)
					bb[i][j] = aa[h + 1][j];
			}
	}
	int[] kk;
	int cut(int n, int m, int k) {
		Arrays.fill(kk, 0, n, 0);
		int c = 0;
		for (int j = 0; j < m; j++) {
			boolean yes = true;
			for (int i = 0; i < n; i++) {
				if (bb[i][j] > k)
					return -1;
				if (kk[i] + bb[i][j] > k) {
					yes = false;
					break;
				}
			}
			if (yes)
				for (int i = 0; i < n; i++)
					kk[i] += bb[i][j];
			else {
				c++;
				for (int i = 0; i < n; i++)
					kk[i] = bb[i][j];
			}
		}
		return c;
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		aa = new byte[n][];
		for (int i = 0; i < n; i++) {
			aa[i] = sc.next().getBytes();
			for (int j = 0; j < m; j++)
				aa[i][j] -= '0';
		}
		bb = new byte[n][m];
		kk = new int[n];
		int ans = n - 1 + m - 1;
		for (int b = 0; b < 1 << n - 1; b++) {
			int h = count(b);
			compress(n, m, b);
			int v = cut(h + 1, m, k);
			if (v >= 0)
				ans = Math.min(ans, h + v);
		}
		println(ans);
	}
}
