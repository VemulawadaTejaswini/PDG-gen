import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long K = Long.parseLong(sc.get());
		long[] A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));
		var count = new int[40];
		for (int i = 0; i < 40; i++) {
			long bit = 1L << i;
			for (long l : A) {
				if ((l & bit) != 0) count[i]++;
			}
		}

		long[][] dp = new long[2][41]; // 0: smaller, 1: same
		Arrays.fill(dp[0], Integer.MIN_VALUE);
		dp[1] = Arrays.copyOf(dp[0], dp[0].length);
		dp[1][40] = 0;
		for (int i = 40 - 1; i >= 0; i--) {
			long bit = 1L << i;
			var cnt = count[i];
			var turnOn = (N - cnt) * bit;
			var turnOff = cnt * bit;
			if (dp[0][i + 1] != Integer.MIN_VALUE) dp[0][i] = dp[0][i + 1] + Math.max(turnOff, turnOn);
			if ((K & bit) != 0) {
				dp[0][i] = Math.max(dp[0][i], dp[1][i + 1] + turnOff);
				dp[1][i] = dp[1][i + 1] + turnOn;
			} else {
				dp[1][i] = dp[1][i + 1] + turnOff;
			}
		}

		System.out.println(Math.max(dp[0][0], dp[1][0]));
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}