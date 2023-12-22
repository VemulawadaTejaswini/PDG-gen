import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean[][] a = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt() - 1;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				a[u][sc.nextInt() - 1] = true;
			}
		}

		int[] d = new int[n];
		int[] f = new int[n];
		boolean[] used = new boolean[n];
		int clock = 1;
		for (int j = 0; j < n; j++) {
			if (used[j]) {
				continue;
			}

			Deque<Integer> st = new ArrayDeque<Integer>();
			st.push(j);

			while (!st.isEmpty()) {
				int e = st.peek();

				if (!used[e]) {
					used[e] = true;
					d[e] = clock;

					for (int i = n - 1; i >= 0; i--) {
						if (used[i]) {
							continue;
						}
						if (a[e][i]) {
							st.push(i);
						}
					}
				} else {
					st.pop();
					if (f[e] != 0) {
						continue;
					}
					f[e] = clock;
				}

				clock++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d %d\n", i + 1, d[i], f[i]);
		}

		sc.close();
	}
}