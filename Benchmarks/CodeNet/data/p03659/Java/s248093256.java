
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long x = 0;
			long y = 0;
			int d = n / 2;

			for (int i = 0; i < d; i++) {
				x += a[i];
			}
			for (int i = d; i < n; i++) {
				y += a[i];
			}
			long result = Math.abs(x - y);

			int min = 1;
			int max = n - 1;
			do {
				int d1 = (d + min) / 2;
				x = 0;
				y = 0;

				for (int j = 0; j < d1; j++) {
					x += a[j];
				}
				for (int j = d1; j < n; j++) {
					y += a[j];
				}
				if (Math.abs(x - y) < result) {
					result = Math.abs(x - y);
					max = d;
					d = d1;
					continue;
				}

				int d2 = (d + max) / 2;
				x = 0;
				y = 0;

				for (int j = 0; j < d2; j++) {
					x += a[j];
				}
				for (int j = d2; j < n; j++) {
					y += a[j];
				}
				if (Math.abs(x - y) < result) {
					result = Math.abs(x - y);
					min = d;
					d = d2;
					continue;
				}
				break;
			} while (min != max);

			System.out.println(result);
		}
	}
}
