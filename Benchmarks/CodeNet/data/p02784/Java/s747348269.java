import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long H = sc.nextLong();
		int N = sc.nextInt();
		long[] A = nextLongArray(sc, N);

		sc.close();

		long sum = 0;
		for (long a : A) {
			sum += a;
		}

		if (sum >= H) {
			out.println("Yes");
		} else {
			out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}
}
