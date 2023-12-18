import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; ++i) {
			b[i] = sc.nextInt();
			s[i] = (i > 0 ? s[i - 1] : 0) + b[i];
		}
		int Q = sc.nextInt();
		int[][] qs = new int[Q][2];
		for (int i = 0; i < Q; ++i) {
			qs[i][0] = sc.nextInt();
			qs[i][1] = sc.nextInt();
			--qs[i][0];
			--qs[i][1];
		}
		Arrays.sort(qs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int[] f = new int[n];
		Arrays.fill(f, Integer.MAX_VALUE / 3);
		int pre = -1;
		for (int i = 0; i < Q; ++i) {
			while (pre < qs[i][1]) {
				++pre;
				f[pre] = (pre > 0 ? f[pre - 1] : 0) + b[pre];
			}
			f[qs[i][1]] = Math.min(f[qs[i][1]], (qs[i][0] > 0 ? f[qs[i][0] - 1] : 0)
					+ Math.abs((qs[i][1] - qs[i][0] + 1) - (s[qs[i][1]] - (qs[i][0] > 0 ? s[qs[i][0] - 1] : 0))));
		}
		while (pre < n - 1) {
			++pre;
			f[pre] = (pre > 0 ? f[pre - 1] : 0) + b[pre];
		}
		System.out.println(f[n - 1]);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}