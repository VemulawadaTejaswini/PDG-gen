import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[][] col = new int[n][4];
			long[] hash = new long[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++) {
					col[i][j] = in.nextInt();
				}
				hash[i] = calcHashes(col[i])[0];
			}
			{
				Integer[] p = new Integer[n];
				for (int i = 0; i < n; i++) {
					p[i] = i;
				}
				final long[] hh = hash;
				Arrays.sort(p, (a, b) -> (hh[a] < hh[b] ? -1 : (hh[a] > hh[b] ? 1 : 0)));
				int[][] ncol = new int[n][];
				long[] nhash = new long[n];
				for (int i = 0; i < n; i++) {
					ncol[p[i]] = col[i];
					nhash[p[i]] = hash[i];
				}
				col = ncol;
				hash = nhash;
			}
			long ans = 0;
			long[] dp = new long[1 << 4];
			long[] ways = new long[1 << 4];
			for (int front = 0; front < n; front++) {
				int a = col[front][0];
				int b = col[front][1];
				int c = col[front][2];
				int d = col[front][3];
				for (int back = front + 1; back < n; back++) {
					rotLoop:
					for (int rotBack = 0; rotBack < 4; rotBack++) {
						int f = col[back][(rotBack + 0) % 4];
						int e = col[back][(rotBack + 1) % 4];
						int h = col[back][(rotBack + 2) % 4];
						int g = col[back][(rotBack + 3) % 4];
						long[] h1 = calcHashes(a, e, f, b);
						long[] h2 = calcHashes(b, f, g, c);
						long[] h3 = calcHashes(d, c, g, h);
						long[] h4 = calcHashes(e, a, d, h);
						long[][] hs = {h1, h2, h3, h4};
						Arrays.fill(dp, 0);
						dp[0] = 1;
						Set<Long> interesting = new HashSet<>();
						for (int i = 0; i < 4; i++) {
							for (int rot = 0; rot < 4; rot++) {
								interesting.add(hs[i][rot]);
							}
						}
						for (int i = front + 1; i < n; ) {
							if (i == back) {
								i++;
								continue;
							}
							int j = i;
							int k = 0;
							while (j < n && hash[i] == hash[j]) {
								if (j != back) {
									++k;
								}
								++j;
							}

							if (!interesting.contains(hash[i])) {
								i = j;
								continue;
							}

							Arrays.fill(ways, 0);
							ways[0] = 1;
							for (int mask = 1; mask < 1 << 4; mask++) {
								int bit = Integer.numberOfTrailingZeros(mask);
								long w = 0;
								for (int rot = 0; rot < 4; rot++) {
									if (hs[bit][rot] == hash[i]) {
										++w;
									}
								}
								ways[mask] = w * ways[mask ^ (1 << bit)];
							}

							long[] ndp = new long[1 << 4];
							for (int mask = 15; mask >= 0; mask--) {
								if (dp[mask] == 0) {
									continue;
								}
								for (int omask = 15; omask >= 0; omask--) {
									if ((mask & omask) > 0) {
										continue;
									}
									int bc = Integer.bitCount(omask);
									if (bc > k) {
										continue;
									}
									ndp[mask | omask] += dp[mask] * ways[omask] * f(k, bc);
								}
							}
							dp = ndp;

							i = j;
						}
						ans += dp[15];
					}
				}
			}
			out.println(ans);
		}

		private long f(int n, int k) {
			long res = 1;
			for (int i = 0; i < k; i++) {
				res *= n - i;
			}
			return res;
		}

		private long[] calcHashes(int... a) {
			long[] h = new long[4];
			for (int rot = 0; rot < 4; rot++) {
				for (int i = 0; i < 4; i++) {
					h[rot] = 1000 * h[rot] + a[(rot + i) % 4];
				}
			}
			return h;
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

