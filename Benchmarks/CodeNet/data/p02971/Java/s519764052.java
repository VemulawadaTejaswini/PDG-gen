import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		int[] left = new int[N];
		int[] right = new int[N];

		left[0] = A[0];
		for (int i = 1; i < N; i++) {
			left[i] = Math.max(left[i - 1], A[i]);
		}

		right[N - 1] = A[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], A[i]);
		}

		StringBuilder sb = new StringBuilder();

		sb.append(right[1]);
		sb.append("\n");
		for (int i = 1; i < N - 1; i++) {
			int l = left[i - 1];
			int r = right[i + 1];

			sb.append(Math.max(l, r));
			sb.append("\n");
		}
		sb.append(left[N - 2]);
		sb.append("\n");

		out.print(sb.toString());

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
