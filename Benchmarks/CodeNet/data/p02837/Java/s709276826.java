// preparation for N log^2 N

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] x = new int[N][];
		int[][] y = new int[N][];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for (int j = 0; j < A[i]; ++j) {
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
				--x[i][j];
			}
		}
		int ans = 0;
		out: for (int s = 1; s < (1 << N) - 1; ++s) {
			for (int i = 0; i < N; ++i) {
				if ((s >> i) % 2 == 0)
					continue;
				for (int j = 0; j < A[i]; ++j) {
					if ((s >> x[i][j]) % 2 != y[i][j])
						continue out;
				}
			}
			ans = Math.max(ans, Integer.bitCount(s));
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
