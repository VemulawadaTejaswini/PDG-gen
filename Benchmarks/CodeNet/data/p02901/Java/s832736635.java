import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long[] p;
	int[] a, b;
	int[][] c;
	int N, M;

	private int rec(int i, long t) { //i以降でtの箱をあけられる鍵の買い方の、最小金額
		if (t == 0) {
			return 0;
		}
		if (i == M) {
			return -1;
		}

		//i番目を買う
		int z1 = rec(i + 1, t & (~p[i]));
		int z2 = a[i] + z1;
		if (z1 == -1) {
			z2 = Integer.MAX_VALUE;
		}

		//i番目を買わない
		int y = rec(i + 1, t);

		if (z1 == -1 && y == -1) {
			return -1;
		}
		if (y == -1) {
			y = Integer.MAX_VALUE;
		}

		return Math.min(z2, y);

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();

		a = new int[M];
		b = new int[M];
		c = new int[M][];

		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = nextIntArray(sc, b[i]);
		}

		sc.close();

		p = new long[M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < c[i].length; j++) {
				p[i] |= ((long) 1 << (c[i][j] - 1));
			}
		}

		int ans = rec(0, (1 << N) - 1);
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
