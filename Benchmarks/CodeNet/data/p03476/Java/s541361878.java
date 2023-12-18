import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

	class SegTree {
		int n;
		int[] v;

		public SegTree(int n_) {
			n = 1;
			while (n < n_)
				n *= 2;
			v = new int[2 * n - 1];
		}

		void addVal(int k, int val) {
			k += n - 1;
			v[k] += val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = v[2 * k + 1] + v[2 * k + 2];
			}
		}

		int query(int a, int b) {
			return query(a, b, 0, n, 0);
		}

		int query(int a, int b, int l, int r, int k) {
			if (b <= l || r <= a) {
				return 0;
			} else if (a <= l && r <= b) {
				return v[k];
			} else {
				return query(a, b, l, (l + r) / 2, 2 * k + 1) + query(a, b, (l + r) / 2, r, 2 * k + 2);
			}
		}
	}

	boolean[] isPrime = new boolean[200000];
	{
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; ++i) {
			if (!isPrime[i])
				continue;
			for (int j = 2 * i; j < isPrime.length; j += i) {
				isPrime[j] = false;
			}
		}
	}

	boolean[] a = new boolean[200000];

	public void run() {
		Scanner sc = new Scanner(System.in);
		SegTree sum = new SegTree(200000);
		for (int i = 2; i < a.length; ++i) {
			if (isPrime[i] && isPrime[(i + 1) / 2]) {
				a[i] = true;
				sum.addVal(i, 1);
			}
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; ++i) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(sum.query(l, r + 1));
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}
}
