import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		// System.err.println(System.currentTimeMillis() - t);
	}

	class BIT {
		int n;
		long[] v;

		public BIT(int n_) {
			n = n_;
			v = new long[n + 1];
		}

		void add(int k, int val) {
			++k;
			while (k <= n) {
				v[k] += val;
				k += k & -k;
			}
		}

		long sum(int k) {
			++k;
			long ret = 0;
			while (k > 0) {
				ret += v[k];
				k -= k & -k;
			}
			return ret;
		}
	}

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		BIT bit = new BIT(n);
		while (q-- > 0) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (com == 0) {
				--x;
				bit.add(x, y);
			} else {
				--x;
				--y;
				System.out.println(bit.sum(y) - bit.sum(x - 1));
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}