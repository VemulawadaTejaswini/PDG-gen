import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N;
	int[] s;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		s = nextIntArray(sc, N);

		sc.close();

		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			sum += s[i];
			if (s[i] % 10 != 0) {
				min = Math.min(min, s[i]);
			}
		}

		int ans = sum;

		if (ans % 10 == 0) {
			if (min == Integer.MAX_VALUE) {
				ans = 0;
			} else {
				ans -= min;
			}
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
