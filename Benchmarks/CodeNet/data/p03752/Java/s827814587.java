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
		int K = sc.nextInt();

		int[] a = nextIntArray(sc, N);

		sc.close();

		int ans = Integer.MAX_VALUE;

		for (int bit = 0; bit < (1 << N); bit++) {
			if (Integer.bitCount(bit) != K || (bit&1)!=1) {
				continue;
			}

			int t = a[0];
			int c = 0;
			for (int j = 1; j < N; j++) {
				if (((bit >> j) & 1) == 1) {
					c += Math.max( (t + 1) - a[j], 0);
					t = Math.max(t + 1, a[j]);
				} else {
					t = Math.max(t, a[j]);
				}
			}

			ans = Math.min(ans, c);
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
