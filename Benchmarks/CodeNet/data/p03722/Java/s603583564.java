import jdk.nashorn.internal.ir.BaseNode;

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

		int count = 0;
		while (true) {
			boolean hasUpdate = false;
			for (int i = 0; i < M; i++) {
				if (d[a[i]] != Long.MAX_VALUE && d[b[i]] > d[a[i]] + c[i]) {
					d[b[i]] = d[a[i]] + c[i];
					hasUpdate = true;
				}
			}
			if (!hasUpdate) {
				System.out.println(-1L * d[N - 1]);
				return;
			}
			if (++count >= N) break;


		}
		long answer = -1L * d[N - 1];
		boolean[] isNegativeClosed = new boolean[N];
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < M; i++) {
				if (d[a[i]] != Long.MAX_VALUE && d[b[i]] > d[a[i]] + c[i]) {
					d[b[i]] = d[a[i]] + c[i];
					isNegativeClosed[b[i]] = true;
				}
				if (isNegativeClosed[a[i]]) isNegativeClosed[b[i]] = true;
			}
		}

		if (isNegativeClosed[N - 1]) {
			System.out.println("inf");
		} else {
			System.out.println(answer);
		}
	}
}
