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
		int ans = 0;
		int p = 0;
		while (p < N) {
			int x = a[p];

			int q = p + 1;
			while (q < N && a[q] == x) {
				q++;
			}

			if (q < 0) {
				q = (-q) - 1;
			}

			if (x > q - p) {
				ans += (q - p);
			} else if (x < q - p) {
				ans += (q - p) - x;
			}

			p = q;
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
