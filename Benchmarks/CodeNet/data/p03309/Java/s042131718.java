import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] x = new int[n];
		long ans = 0, b = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			x[i] = a[i] - (i + 1);
		}
		
		Arrays.sort(a);

		if (n % 2 == 0) {
			b = (x[(n / 2) - 1] + x[n / 2]) / 2;
			if (Math.abs(x[(n / 2) - 1] - b) <= Math.abs(x[n / 2] - b)) {
				b = x[(n / 2) - 1];
			} else {
				b = x[n / 2];
			}
		} else {
			b = x[(n / 2)];
		}

		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - (b + (i + 1)));
		}

		System.out.println(ans);

		sc.close();
	}
}
