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
		int T = sc.nextInt();
		int[] t = nextIntArray(sc, N);

		sc.close();

		long ct = 0;
		long pt = t[0];
		long ans = 0;
		for (int i = 1; i < N; i++) {
			ct = t[i];

			ans += Math.min(T, ct - pt);
			pt = ct;
		}
		ans += T;

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
