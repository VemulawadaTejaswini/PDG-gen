
import java.util.Arrays;
import java.util.BitSet;

public class Main {

	static int n;
	static int[] a;

	private static void solve() {
		BitSet b = new BitSet();
		for (int i = 0; i < 64; i ++) {
			b.set(i);
		}
		int n = ni();
		int[] a = na(n);

		BitSet one = new BitSet();
		BitSet two = new BitSet();
		one.set(0);

		for (int v : a) {
			BitSet s = shift(one, v);
			BitSet sa = (BitSet)s.clone();
			sa.and(one);
			one.or(s);

			two.or(shift(two, v));
			two.or(sa);
		}

		one.or(two);
		int ret = 0;
		int sum = Arrays.stream(a).sum();
		if (sum % 2 == 1) {
			for (int i = (sum + 1) / 2;; i++) {
				if (one.get(i)) {
					ret = i;
					break;
				}
			}
		} else {
			if (two.get(sum / 2)) {
				ret = sum / 2;
			} else {
				for (int i = sum / 2 + 1;; i++) {
					if (one.get(i)) {
						ret = i;
						break;
					}
				}
			}
		}
		System.out.println(ret);
	}

	public static BitSet shift(BitSet bits, int n) {
		int d = n / 64;
		n = n % 64;
	    long[] org = bits.toLongArray();
	    if (org.length == 0) {
	    	return BitSet.valueOf(org);
	    }
        long[] words = new long[org.length + d + 1];
        words[words.length - 1] = org[words.length - d - 2] >>> (64 - n);
	    for (int i = words.length - 2; i > d; i--) {
	        words[i] = org[i - d] << n;
	        words[i] |= org[i - d - 1] >>> (64 - n);
	    }
	    words[d] = org[0] << n;
	    return BitSet.valueOf(words);
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				String debug = args.length > 0 ? args[0] : null;
				if (debug != null) {
					try {
						is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
				reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
				solve();
				out.flush();
				tr((System.currentTimeMillis() - start) + "ms");
			}
		}, "", 64000000).start();
	}

	private static java.io.InputStream is = System.in;
	private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
	private static java.util.StringTokenizer tokenizer = null;
	private static java.io.BufferedReader reader;

	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new java.util.StringTokenizer(reader.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	private static double nd() {
		return Double.parseDouble(next());
	}

	private static long nl() {
		return Long.parseLong(next());
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private static char[] ns() {
		return next().toCharArray();
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private static int[][] ntable(int n, int m) {
		int[][] table = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[i][j] = ni();
			}
		}
		return table;
	}

	private static int[][] nlist(int n, int m) {
		int[][] table = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[j][i] = ni();
			}
		}
		return table;
	}

	private static int ni() {
		return Integer.parseInt(next());
	}

	private static void tr(Object... o) {
		if (is != System.in)
			System.out.println(java.util.Arrays.deepToString(o));
	}
}
