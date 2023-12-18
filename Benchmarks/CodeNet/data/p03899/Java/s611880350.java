import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		long[][] f = new long[n][k];
		for (int i = 0; i < f.length; ++i)
			for (int j = 0; j < f[i].length; ++j)
				f[i][j] = -Long.MAX_VALUE / 3;

		ArrayDeque<Long>[] dq = new ArrayDeque[k];
		for (int i = 0; i < dq.length; ++i)
			dq[i] = new ArrayDeque();
		dq[0].add(a[0]);
		for (int i = 0; i < f.length; ++i) {
			for (int j = k - 1; j >= 0; --j) {
				long add = a[i] * (j + 1);
				long base;
				if (j > 0) {
					if (dq[j - 1].isEmpty())
						continue;
					else
						base = dq[j - 1].peekLast();
				} else {
					base = 0;
				}
				f[i][j] = Math.max(f[i][j], add + base);
				int cnt = 0;
				while (!dq[j].isEmpty() && dq[j].peekFirst() < f[i][j]) {
					dq[j].pollFirst();
					++cnt;
				}
				while (cnt-- >= 0) {
					dq[j].addFirst(f[i][j]);
				}
				while (dq[j].size() > m)
					dq[j].pollLast();
			}
		}
		long ans = 0;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, f[i][k - 1]);
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}