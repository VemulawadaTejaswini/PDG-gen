import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] p = nextIntArray(sc, N);

		sc.close();

		double[] sum = new double[N + 1];
		sum[0] = 0;

		for (int i = 0; i < N; i++) {
			sum[i + 1] = sum[i] + (1 + p[i]) / 2.0;
		}

		double ans = 0;

		for (int i = 1; i <= N - K + 1; i++) {
			double x = sum[i - 1 + K] - sum[i - 1];
			ans = Math.max(ans, x);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
