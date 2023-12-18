import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		final int N = sc.nextInt();
		final int K = sc.nextInt();
		final int Q = sc.nextInt();
		final int[] A = nextIntArray(sc, Q);

		sc.close();

		long[] point = new long[N + 1];
		Arrays.fill(point, K - Q);

		for (int i = 0; i < A.length; i++) {
			point[A[i]]++;
		}

		StringBuilder ans = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (point[i] <= 0) {
				ans.append("No\n");
			} else {
				ans.append("Yes\n");
			}
		}

		out.print(ans.toString());

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
