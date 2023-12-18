import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long c = sc.nextLong();

		long[] x = new long[n + 1];
		long[] v = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}

		long[] sum = new long[n + 1];
		long[] a = new long[n + 1];
		long[] b = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + v[i];
			a[i] = Math.max(a[i - 1], sum[i] - x[i]);
		}

		b[n] = Math.max(0, v[n] - (c - x[n]));
		for (int i = n - 1; i > 0; i--) {
			b[i] = Math.max(b[i + 1], sum[n] - sum[i - 1] - (c - x[i]));
		}

		long answer = Math.max(a[n], b[1]);
		for (int i = 1; i < n; i++) {
			answer = Math.max(answer, Math.max(
					sum[i] - 2 * x[i] + b[i + 1],
					sum[n] - sum[i - 1] - 2 * (c - x[i]) + a[i - 1]
			));
		}
		System.out.println(answer);
	}
}
