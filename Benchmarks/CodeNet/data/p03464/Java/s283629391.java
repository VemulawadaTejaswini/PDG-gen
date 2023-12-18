
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}

		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();

			long[] a = new long[k];

			for (int i = 0; i < k; i++) {
				a[i] = sc.nextLong();
			}

			long min = 2;
			long max = 2;

			for (int i = k - 1; i >= 0; i--) {
				if (a[i] > max) {
					System.out.println("-1");
					return;
				}

				if (a[i] < min) {
					long t = min / a[i];
					if (min % a[i] == 0) {
					} else {
						min = a[i] * (t + 1);
					}
				} else {
					min = a[i];
				}
				max = Math.max(max, min + a[i] - 1);
			}
			System.out.println(min + " " + max);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int d = b - a;
			if (d % 2 == 0) {
				System.out.println("Alice");
			} else {
				System.out.println("Borys");
			}
		}
	}

}
