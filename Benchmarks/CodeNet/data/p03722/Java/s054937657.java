import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long[] d = new long[N];
		Arrays.fill(d, Long.MAX_VALUE);
		d[0] = 0;

		int[] a = new int[M];
		int[] b = new int[M];
		long[] c = new long[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextLong() * -1;
		}

		// 1. check the existence of closed circuit with positive value
		int count = 0;
		while (true) {
			boolean hasUpdate = false;
			for (int i = 0; i < M; i++) {
				if (d[a[i]] != Long.MAX_VALUE && d[b[i]] > d[a[i]] + c[i]) {
					d[b[i]] = d[a[i]] + c[i];
					hasUpdate = true;
				}
			}
			if (!hasUpdate) break;
			if (count++ > N + 3) {
				System.out.println("inf");
				return;
			}
		}

		// 2. calculate the max sum of weights
		System.out.println(-1 * d[N - 1]);
	}
}
