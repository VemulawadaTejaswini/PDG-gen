import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static final int MOD = 998244353;

	static long add(long x, long y) {
		x += y;
		if (x >= MOD) return x - MOD;
		return x;
	}

	static long sub(long x, long y) {
		x -= y;
		if (x < 0) return x + MOD;
		return x;
	}

	static long mult(long x, long y) {
		return (x * y) % MOD;
	}

	static long mult(long x, long y, long z) {
		return mult(x,  mult(y, z));
	}

	static long pow(long base, long exp) {
		if (exp == 0) return 1;
		if ((exp & 1) == 1) return mult(base, pow(base, exp - 1));
		return pow(mult(base, base), exp / 2);
	}

	static long inverse(long x) {
		return pow(x, MOD - 2);
	}

	static long[] getPots(long base, int max) {
		long[] ret = new long[max + 1];
		ret[0] = 1;
		for (int i = 1; i <= max; i++) {
			ret[i] = mult(ret[i-1], base);
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] vals = new int[N];
		for (int i = 0; i < N; i++) {
			vals[i] = sc.nextInt();
		}
		int ans = 0;
		long[] pots = getPots(2, N);
		long[][] sums = new long[N + 1][S+1];
		sums[0][0] = pots[N];
		long inv2 = inverse(2);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= S; j++) {
				sums[i+1][j] = sums[i][j];
			}
			for (int j = 0; j + vals[i] <= S; j++) {
				sums[i + 1][j + vals[i]] = add(sums[i + 1][j + vals[i]], mult(sums[i][j], inv2));
			}
		}

		out.println(sums[N][S]);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
