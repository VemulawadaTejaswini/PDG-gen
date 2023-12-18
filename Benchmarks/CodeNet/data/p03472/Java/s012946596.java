import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			sum = sum + b[i];
		}

		Arrays.sort(a);
		Arrays.sort(b);
		if (b[0] >= a[n - 1]) {
			if (sum >= h) {
				int tmp = 0;
				for (int i = 0; i < n; i++) {
					tmp = sum - b[i];
					if (tmp >= h) {
						sum = tmp;
					} else {
						System.out.println(n - i);
						return;
					}
				}
			} else {
				int tmp = h - sum;
				int t = tmp / a[n - 1];
				if (tmp <= (a[n - 1] * t)) {
					System.out.println(n + t);
					return;
				} else {
					System.out.println(n + t + 1);
					return;
				}

			}

		} else {
			int r = 0;
			for (int i = 0; i < n; i++) {
				if (b[i] <= a[n - 1]) {
					sum = sum - b[i];
					r = r + 1;
				}
			}

			int tmp = h - sum;
			int t = tmp / a[n - 1];
			if (tmp <= (a[n - 1] * t)) {
				System.out.println(n + t - r);
				return;
			} else {
				System.out.println(n + t + 1 - r);
				return;
			}
		}

	}
}
