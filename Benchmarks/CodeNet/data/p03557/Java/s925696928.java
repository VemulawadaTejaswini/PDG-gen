package project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Long[] a = new Long[n];
		long[] b = new long[n];
		Long[] c = new Long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = scanner.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int count = 0;
		int aCount = 0;
		int cCount = 0;
		for (int i = 0; i < n; i++) {
			long tar = b[i];
			aCount = lower_bound(Arrays.asList(a), tar);
			cCount = n - upper_bound(Arrays.asList(c), tar);
			count += aCount * cCount;
		}

		System.out.println(count);
	}

	// 指定した値`以上`の要素が最初に現れる位置を返す
	private static int lower_bound(List<Long> list, long val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
	}

	// 指定した値`より大きい`の要素が最初に現れる位置を返す
	private static int upper_bound(List<Long> list, long val) {
		return ~Collections.binarySearch(list, val, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
	}
}