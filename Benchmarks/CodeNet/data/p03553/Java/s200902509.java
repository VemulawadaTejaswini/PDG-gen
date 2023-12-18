
import java.util.Arrays;

public class Main {

	private static int[] primes = sieveAtkin(200000);
	private static void solve() {
		int n = ni();
		long[] a = nal(n);
		long[] sum = new long[101];
		
		for (int i = 1; i <= 100; i ++) {
			for (int j = 1; j <= n; j ++) {
				if (j % i == 0) {
					sum[i] += a[j - 1];
				}
			}
		}
		
		long t = Arrays.stream(a).sum();
		long ret = t;
		for (int i = 1; i <= 100; i ++) {
			int[][] f = factor(i, primes);
			int s = f.length;
			long now = 0;
			for (int j = 1; j < (1 << s); j ++) {
				int m = Integer.bitCount(j);
				long v = 0;
				for (int k = 0; k < s; k ++) {
					if (((j >> k) & 1) != 0) {
						v += sum[f[k][0]];
					}
				}
				now += v * (m % 2 == 1 ? 1 : -1);
			}
			
			ret = Math.max(ret, t - now);
		}
		System.out.println(ret);
	}

	public static int[][] factor(int n, int[] primes)
	{
		int[][] ret = new int[9][2];
		int rp = 0;
		for(int p : primes){
			if(p * p > n)break;
			int i;
			for(i = 0;n % p == 0;n /= p, i++);
			if(i > 0){
				ret[rp][0] = p;
				ret[rp][1] = i;
				rp++;
			}
		}
		if(n != 1){
			ret[rp][0] = n;
			ret[rp][1] = 1;
			rp++;
		}
		return Arrays.copyOf(ret, rp);
	}
	
	public static int[] sieveAtkin(int size) {
		boolean[] isPrime = new boolean[size + 1];
		int sqrtN = (int) Math.sqrt(size);
		int n;
		for (int x = 1; x <= sqrtN; ++x) {
			for (int y = 1; y <= sqrtN; ++y) {
				n = 4 * x * x + y * y;
				if (n <= size && (n % 12 == 1 || n % 12 == 5)) {
					isPrime[n] = !isPrime[n];
				}
				n = 3 * x * x + y * y;
				if (n <= size && n % 12 == 7) {
					isPrime[n] = !isPrime[n];
				}
				n = 3 * x * x - y * y;
				if (x > y && n <= size && n % 12 == 11) {
					isPrime[n] = !isPrime[n];
				}
			}
		}

		for (n = 5; n <= sqrtN; ++n) {
			if (isPrime[n]) {
				for (int k = n * n; k <= size; k += n * n) {
					isPrime[k] = false;
				}
			}
		}
		isPrime[2] = isPrime[3] = true;
		
		int[] ret = new int[size];
		int count = 0;
		for (int i = 1; i < size; i ++) {
			if (isPrime[i]) {
				ret[count ++] = i;
			}
		}
		return Arrays.copyOf(ret, count);
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
