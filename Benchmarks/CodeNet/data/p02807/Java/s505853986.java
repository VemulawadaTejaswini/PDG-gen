import java.util.Scanner;

public class Main {

	private static final int M = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		long[] d = new long[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
		}
		for (int i = 0; i < n - 1; i++) {
			d[i] = x[i + 1] - x[i];
		}

		double c = 1;
		double answer = 0;
		int[] fact = new int[n + 1];
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = fact[i - 1] * i;

		}

		for (int i = 0; i < n - 1; i++) {
			answer += c * d[i];
			answer %= M;
			c += 1.0 / (i + 2);
			c %= M;
		}
		answer *= fact[n - 1];
		System.out.println(String.format("%.0f", answer % M));
	}
}
