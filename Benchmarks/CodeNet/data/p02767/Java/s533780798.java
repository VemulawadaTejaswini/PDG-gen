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
		int[] X = nextIntArray(sc, N);

		sc.close();

		long ans = Long.MAX_VALUE;

		for (int p = 1; p <= 100; p++) {
			long s = 0;
			for (int i = 0; i < N; i++) {
				s += Math.pow(p - X[i], 2);
			}
			ans = Math.min(ans, s);
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
