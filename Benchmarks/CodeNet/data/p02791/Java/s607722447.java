import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	class SegTree {
		int n = 1;
		int[] v;

		public SegTree(int n) {
			while (this.n < n)
				this.n *= 2;
			v = new int[2 * this.n - 1];
		}

		void set(int k) {
			v[k] = 1;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = v[2 * k + 1] + v[2 * k + 2];
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (r <= a || b <= l)
				return 0;
			else if (a <= l && r <= b)
				return v[k];
			else {
				int vl = query(l, (l + r) / 2, a, b, 2 * k + 1);
				int vr = query((l + r) / 2, r, a, b, 2 * k + 2);
				return vl + vr;
			}

		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int min=Integer.MAX_VALUE/3;
		int ans=0;
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
			if(min>=P[i])++ans;
			min=Math.min(min, P[i]);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
