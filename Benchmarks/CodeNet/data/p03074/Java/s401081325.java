import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		sc.close();

		int[][] s = new int[2][100100];

		int[] idx = new int[2];
		int f = 0;

		if (S.charAt(0) == '1') {
			f = 0;
			s[f][idx[f]]++;
		} else {
			idx[0] = 1;
			f = 1;
			s[f][idx[f]]++;
		}

		for (int i = 1; i < N; i++) {
			if (S.charAt(i - 1) != S.charAt(i)) {
				idx[f]++;
				f ^= 1;
			}
			s[f][idx[f]]++;
		}

		int[][] w = new int[2][100101];
		for (int i = 0; i < 100100; i++) {
			w[0][i + 1] = w[0][i] + s[0][i];
			w[1][i + 1] = w[1][i] + s[1][i];
		}

		int ans = Integer.MIN_VALUE;
		for (int i = 0; i + K <= 100000 - K; i++) {
			// [i, i+K)
			// 逆立ちの数
			int sum = w[1][i + K] - w[1][i];
			sum += w[0][i + K + 1] - w[0][i];

			ans = Math.max(ans, sum);

		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
