import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long answer = Long.MAX_VALUE;
		for (int i = 0; i < (1 << n); i++) {
			if (Integer.bitCount(i) != k) continue;
			int ma = 0;
			long cost = 0;

			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) != 1) {
					ma = Math.max(ma, a[j]);
					continue;
				}

				if (ma < a[j]) {
					ma = a[j];
					continue;
				}

				cost += (ma - a[j]) + 1;
				ma++;
			}

			answer = Math.min(answer, cost);
		}

		System.out.println(answer);

	}
}
