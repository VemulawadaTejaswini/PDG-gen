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
		int[] A = nextIntArray(sc, N);
		int[] B = nextIntArray(sc, N);
		int[] C = nextIntArray(sc, N);

		sc.close();

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		int ans = 0;

		int[] B2 = new int[N + 1];
		B2[N] = 0;
		for (int i = N - 1; i >= 0; i--) {
			int ci = upperBound(C, 0, C.length, B[i]);
			B2[i] = B2[i + 1] + N - ci;
		}

		for (int i = 0; i < N; i++) {
			int bi = upperBound(B, 0, B.length, A[i]);
			ans += B2[bi];
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	private static int upperBound(int[] a, int st, int ed, int k) {
		if (st == ed - 1) {
			if (a[st] <= k) {
				return st + 1;
			} else {
				return st;
			}
		}

		int m = (ed - st) / 2 + st;
		if (a[m] <= k) {
			//右側
			return upperBound(a, m, ed, k);
		} else {
			//左側
			return upperBound(a, st, m, k);
		}

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
