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
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		dp[N - 2] = abs(h[N - 2] - h[N - 1]);
		for (int i = N - 3; i >= 0; i--) {
			dp[i] = min(dp[i + 1] + abs(h[i + 1] - h[i]), dp[i + 2] + abs(h[i + 2] - h[i]));
		}

		out.println(dp[0]);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
