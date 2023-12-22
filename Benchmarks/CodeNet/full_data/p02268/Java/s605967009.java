import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private static boolean binarySearch(int[] a, int st, int ed, int k) {
		if (st == ed - 1) {
			return a[st] == k;
		}

		int idx = (ed - st) / 2 + st;
		int m = a[idx];

		if (m == k) {
			return true;
		} else if (m > k) {
			return binarySearch(a, st, idx, k);
		} else if (m < k) {
			return binarySearch(a, idx, ed, k);
		}

		return false; // 到達しない

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int[] S = nextIntArray(sc, n);

		int q = sc.nextInt();
		int[] T = nextIntArray(sc, q);

		sc.close();

		int ans = 0;

		for (int i = 0; i < q; i++) {
			if (binarySearch(S, 0, n, T[i])) {
				ans++;
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

