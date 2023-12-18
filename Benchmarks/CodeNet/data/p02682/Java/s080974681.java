

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long ans = 0;

		if (k <= a) {
			ans = k;
		} else if (k <= a + b) {
			ans = a;
		} else if (k <= a + b + c) {
			ans = 2 * a - k + b;
		} else {
			ans = a - c;
		}

		System.out.println(ans);
	}

}
