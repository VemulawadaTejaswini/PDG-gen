

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextLong();
		long[] a = new long[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		long result = (long) (Math.ceil(N/a[0]) + 5);

		System.out.println(result);
	}
}
