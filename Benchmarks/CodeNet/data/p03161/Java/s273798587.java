import static java.lang.Math.*;

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
		int[] h = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}

		int[] dp = new int[N];
		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			int m = Integer.MAX_VALUE;
			for (int j = max(0, i - K); j < i; j++) {
				m = min(m, dp[j] + abs(h[j] - h[i]));
			}
			dp[i] = m;
		}
		out.println(dp[N - 1]);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
