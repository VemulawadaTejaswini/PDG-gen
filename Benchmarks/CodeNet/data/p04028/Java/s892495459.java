import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();

		char[] s = sc.next().toCharArray();
		int k = s.length;

		if (n > 300) {
			pr.println(0);

			pr.close();
			sc.close();
			return;
		}

		int[][][] dp = new int[n + 2][n + 2][n + 1];
		dp[0][0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int l = j; l <= n; l++) {
					if (l == 0) {
						dp[j][l][i + 1] += dp[j][l][i];
						dp[j][l][i + 1] %= MOD;
						dp[j + 1][l + 1][i + 1] += dp[j][l][i];
						dp[j + 1][l + 1][i + 1] %= MOD;
						dp[j][l + 1][i + 1] += dp[j][l][i];
						dp[j][l + 1][i + 1] %= MOD;
					} else if (j == l) {
						dp[j - 1][l - 1][i + 1] += dp[j][l][i];
						dp[j - 1][l - 1][i + 1] %= MOD;
						dp[j + 1][l + 1][i + 1] += dp[j][l][i];
						dp[j + 1][l + 1][i + 1] %= MOD;
						dp[j][l + 1][i + 1] += dp[j][l][i];
						dp[j][l + 1][i + 1] %= MOD;
					} else {
						dp[j][l - 1][i + 1] += dp[j][l][i];
						dp[j][l - 1][i + 1] %= MOD;
						dp[j][l + 1][i + 1] += dp[j][l][i];
						dp[j][l + 1][i + 1] %= MOD;
						dp[j][l + 1][i + 1] += dp[j][l][i];
						dp[j][l + 1][i + 1] %= MOD;
					}
				}
			}
		}

		pr.println(dp[k][k][n]);

		pr.close();
		sc.close();
	}

	static final int MOD = 1_000_000_007;

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
//					it = Arrays.asList(br.readLine().split(" ")).iterator();
					it = Arrays.asList(br.readLine().split("\\p{javaWhitespace}+")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
