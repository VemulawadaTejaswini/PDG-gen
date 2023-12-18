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
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(L);

		int ans = 0;

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				int x = lowerBound(L, j + 1, N, L[i] + L[j]) - 1;
				ans += x - j;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	private static int lowerBound(int[] a, int st, int ed, int k) {
		if (st == ed - 1) {
			if (a[st] < k) {
				return st + 1;
			} else {
				return st;
			}
		}

		int m = (ed - st) / 2 + st;
		if (a[m] < k) {
			// 右側
			return lowerBound(a, m, ed, k);
		} else {
			// 左側
			return lowerBound(a, st, m, k);
		}
	}
}
