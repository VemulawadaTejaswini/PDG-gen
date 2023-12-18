import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long M = sc.nextLong();

		sc.close();

		long ans = 0;

		if (N * 2 <= M) {
			ans += N;
			M -= N * 2;
			N = 0;
		} else {
			ans += M / 2;
			N -= M / 2;
			M = 0;
		}

		if (M > 0) {
			ans += M / 4;
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

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
