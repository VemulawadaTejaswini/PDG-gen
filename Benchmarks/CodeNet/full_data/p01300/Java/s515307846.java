import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		solver();

	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			char[] c = sc.next().toCharArray();
			if (c.length == 1 && c[0] == '0')
				break;

			int[] dp = new int[c.length];
			int[] num = new int[c.length];
			Arrays.fill(dp, -1);

			long ans = 0;
			for (int i = 0; i < c.length; i++) {
				int mod = (c[i] - '0') % 11;
				int d = 0;
				if (c[i] - '0' != 0) {
					for (int j = i; j < c.length - 1; j++) {
						d = mod * 10 + (c[j + 1] - '0');
						if (d % 11 != 0) {
							mod = d % 11;
						} else if (d % 11 == 0) {
							dp[i] = j + 1;
							num[i]++;
							ans++;
							if (j + 2 < c.length && c[j + 2] - '0' == 0) {
								mod = d % 11;
							} else {
								break;
							}
						}
					}
				}
			}
			for (int i = 0; i < c.length - 1; i++) {
				if (dp[i] != -1 && (c[i] - '0' != 0)) {
					if (dp[i] + 1 >= c.length)
						continue;
					int p = dp[i] + 1;
					int d = dp[p];
					while (d != -1) {
						ans += 1 * num[p];
						if (dp[d] == -1 || (dp[d] + 1 >= c.length)) {
							break;
						} else {
							p = dp[d] + 1;
							d = dp[p];
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException {
			try {
				if (it == null || !it.hasNext())
					it = Arrays.asList(br.readLine().split(" ")).iterator();
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

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}