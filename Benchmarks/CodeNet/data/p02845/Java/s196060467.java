import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int mod = 1000000007;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		long ans = 1;
		int[] x = new int[] { 0, 0, 0 };

		for (int i = 0; i < N; i++) {
			int z = 0;
			boolean b = false;
			if (x[0] == A[i]) {
				z++;
				x[0]++;
				b = true;
			}
			if (x[1] == A[i]) {
				z++;
				if (!b) {
					x[1]++;
					b = true;
				}
			}
			if (x[2] == A[i]) {
				z++;
				if (!b) {
					x[2]++;
					b = true;
				}
			}
			ans *= z;
			ans %= mod;
		}

		out.println(ans);

	}

	int[] f(String s) {
		int[] result = new int[s.length()];

		int[] cnt = new int[] { 0, 0, 0 };

		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			result[i] = cnt[c - '0']++;
		}
		return result;
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
