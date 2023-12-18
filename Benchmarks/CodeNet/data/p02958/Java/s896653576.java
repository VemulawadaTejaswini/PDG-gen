import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] p = nextIntArray(sc, N);

		sc.close();

		int c = 0;
		for (int i = 0; i < N; i++) {
			if (p[i] != i + 1) {
				c++;
			}
		}

		if (c <= 2) {
			out.println("YES");
		} else {
			out.println("NO");
		}

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
