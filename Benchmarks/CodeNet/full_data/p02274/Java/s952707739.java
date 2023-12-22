import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}
	private void solv() {
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		Bit bit = new Bit(n);
		long cnt = 0; 
		for (int i = 1; i <= n; i++) {
			int v = a[i-1];

			int l = 0, r = n - 1;
			while (l < r) {
				int m = (l + r) / 2;
				if (b[m] < v) {
					l = m + 1;
				} else {
					r = m;
				}
			}

			cnt += i - bit.sum(l+1) - 1;
			bit.add(l+1, 1);
		}
		out.println(cnt);
	}

	private static class Bit {
		int n;
		int[] bit;
		Bit(int n) {
			this.n = n;
			this.bit = new int[n+1];
		}
		public void add(int a, int w) {
			for (int x = a; x <= n; x += x & -x) {
				bit[x] += w;
			}
		}
		public int sum(int a) {
			int ret = 0;
			for (int x = a; x > 0; x -= x & -x) {
				ret += bit[x];
			}
			return ret;
		}
	}
}