

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair> {
		long a, b;

		Pair(long a, long b) {
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

		int n = sc.nextInt();
		long[] a = new long[n];
		Pair[] pair = new Pair[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			pair[i] = new Pair(a[i], i);
		}

		Arrays.sort(pair);
		Deque<Long> dq = new ArrayDeque<>();
		for (long i = 0; i < n; i++) {
			dq.addLast(i);
		}

		long ans = 0;

		for (int i = n - 1; i >= 0; i--) {
			long left = Math.abs(dq.getFirst() - pair[i].b);
			long right = Math.abs(dq.getLast() - pair[i].b);

			if (left > right) {
				ans += pair[i].a * left;
				dq.pollFirst();
			} else if (left < right) {
				ans += pair[i].a * right;
				dq.pollLast();
			} else {
				if (i == 0) {
					ans += pair[i].a * left;
				} else {
					if (pair[i - 1].b < pair[i].b) {
						ans += pair[i].a * left;
						dq.pollFirst();
					} else {
						ans += pair[i].a * right;
						dq.pollLast();
					}
				}
			}
		}
		System.out.println(ans);

	}

}
