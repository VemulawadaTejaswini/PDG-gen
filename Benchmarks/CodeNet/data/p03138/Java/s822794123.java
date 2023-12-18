/*
 * test
 * test
 * test
 * test
 * test
 * test
 * test
 * test
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long x = 0;
		int count = 0;
		while (Math.pow(2, count + 1) <= k) {
			count++;
		}
		while (count >= 0) {
			long tmp = x + (long) Math.pow(2, count);
//			if (tmp > k) {
//				count--;
//				continue;
//			}
			long sum = 0;
			long osum = 0;
			for (int i = 0; i < n; i++) {
				sum += tmp ^ a[i];
				osum += x ^ a[i];
			}
			if (sum >= osum) {
				x = tmp;
			}
			count--;
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += x ^ a[i];
		}
		System.out.println(ans);
	}
}















