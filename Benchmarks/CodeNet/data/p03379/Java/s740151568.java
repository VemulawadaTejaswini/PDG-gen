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

		int[] b = new int[N];
		System.arraycopy(X, 0, b, 0, N);
		Arrays.sort(b);

		int m1 = b[N / 2 - 1];
		int m2 = b[N / 2];

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < N; i++) {

			if (X[i] <= m1) {
				ans.append(m2);
				ans.append("\r\n");
			} else {
				ans.append(m1);
				ans.append("\r\n");
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
