import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; ++i)
			x[i] = sc.nextInt();

		long all = 0;
		for (int i = 0; i < n; ++i)
			all += x[i];
		SegmentTree seg = new SegmentTree(n + 1);
		for (int i = 0; i < n; ++i) {
			long pre = seg.query(0, x[i]);
			seg.set(x[i], pre + x[i]);
		}
		long fix = seg.query(0, n + 1);
		System.out.println(all - fix);
	}

	static class SegmentTree {
		int n = 1;
		long[] val;

		public SegmentTree(int n) {
			while (this.n < n)
				this.n *= 2;
			val = new long[2 * this.n - 1];
		}

		void set(int k, long l) {
			k += n - 1;
			val[k] = l;
			while (k > 0) {
				k = (k - 1) / 2;
				val[k] = Math.max(val[2 * k + 1], val[2 * k + 2]);
			}
		}

		long query(int a, int b) {
			return query(a, b, 0, n, 0);
		}

		long query(int a, int b, int l, int r, int k) {
			if (r <= a || b <= l)
				return 0;
			else if (a <= l && r <= b) {
				return val[k];
			} else {
				long vl = query(a, b, l, (l + r) / 2, 2 * k + 1);
				long vr = query(a, b, (l + r) / 2, r, 2 * k + 2);
				return Math.max(vl, vr);
			}
		}
	}
}