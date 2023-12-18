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
		int M = sc.nextInt();
		int[] k = new int[M];
		int[][] s = new int[M][];
		for (int i = 0; i < M; i++) {
			k[i] = sc.nextInt();
			s[i] = new int[k[i]];
			for (int j = 0; j < k[i]; j++) {
				s[i][j] = sc.nextInt() - 1;
			}
		}

		int[] p = new int[M];
		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}

		sc.close();

		int ans = 0;

		for (int bit = 0; bit < (1 << N); bit++) {
//			System.err.println(Integer.toBinaryString(bit));
			int light = 1;
			// 電球iが点灯するか
			for (int i = 0; i < M; i++) {
				int n = 0;
				for (int j = 0; j < k[i]; j++) {
//					System.err.println("[[ " + j + "," + k[i]);
					if (((bit >> s[i][j]) & 1) == 1) {
						System.err.println(j + " switch on");
						n++;
					}
				}
				System.err.println("i=" + i + "  n=" + n + "  p[i]=" + p[i]);
				if (n % 2 != p[i]) {
//					System.err.println("x");
					light = 0;
				} else {
//					System.err.println("o");

				}
			}

			if (light == 1) {
				System.err.println("ok");

				ans++;
			}

		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
