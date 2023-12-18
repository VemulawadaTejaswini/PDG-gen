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
		int[] a = nextIntArray(sc, N);

		sc.close();

		Arrays.sort(a);

		int alice = 0;
		int bob = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				alice += a[N - 1 - i];
			} else {
				bob += a[N - 1 - i];
			}
		}

		out.println(alice - bob);

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
