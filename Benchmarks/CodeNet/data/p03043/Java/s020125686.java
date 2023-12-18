import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();
		final int K = in.nextInt();

		double p = solve(N, K);
		System.out.println(p);
	}

	private static final double LOG_2 = Math.log(2);

	static double solve(int N, int K) {
		double p = 0;
		for (int n = 1; n <= N; ++n) {
			if (n >= K) {
				p += 1;
			} else {
				// n*2^x = K
				final double x = Math.ceil(Math.log(K / (double) n) / LOG_2);
				p += Math.pow(0.5, x);
			}
		}
		return p / N;
	}
}
