

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		long a, b;

		public Pair(long a, long b) {
			this.a = a;
			this.b = b;
		}

		public int compareTo(Pair p) {
			if (a > p.a)
				return 1;
			else if (a < p.a)
				return -1;
			else
				return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];

		Pair[] p = new Pair[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
			p[i] = new Pair(a[i], b[i]);
		}

		Arrays.sort(p);

		long ans = 0;
		long sum = 0;

		for (int i = 0; i < n; i++) {

			if (sum + p[i].b >= m) {
				ans += p[i].a * (m - sum);
				break;
			} else {
				ans += p[i].a * p[i].b;
				sum += p[i].b;
			}
		}

		System.out.println(ans);

	}

}
