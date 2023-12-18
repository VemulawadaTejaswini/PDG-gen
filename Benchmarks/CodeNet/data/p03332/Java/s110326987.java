import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static final long MOD = 998244353;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long K = sc.nextLong();
		long[] fact = new long[N+1], inv = new long[N+1];
		fact[0] = 1;
		for (int i = 1; i <= N; i++) {
			fact[i] = (fact[i-1] * i) % MOD;
		}
		inv[N] = inv(fact[N]);
		for (int i = N - 1; i >= 0; i--) {
			inv[i] = (inv[i + 1] * (i + 1)) % MOD;
		}
		long ans = 0;
		long sumX = 0;
		for (int x = 0; x <= N && sumX <= K; x++, sumX += A) {
			long rem = K - sumX;
			if (rem % B == 0) {
				long y = rem / B;
				if (y <= N) {
					long tmp1 = (fact[N] * inv[x]) % MOD;
					tmp1 = (tmp1 * inv[N - x]) % MOD;
					long tmp2 = (fact[N] * inv[(int)y]) % MOD;
					tmp2 = (tmp2 * inv[N - (int)y]) % MOD;
					ans += (tmp1 * tmp2) % MOD;
				}
			}
		}
		ans %= MOD;
		out.println(ans);
		
		out.flush();
	}
	
	static long inv(long n) {
		return exp(n, MOD - 2);
	}
	
	static long exp(long b, long e) {
		if (e == 0) return 1;
		long tmp = exp(b, e / 2);
		tmp = (tmp * tmp) % MOD;
		if (e % 2 == 1) {
			tmp = (tmp * b) % MOD;
		}
		return tmp;
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
