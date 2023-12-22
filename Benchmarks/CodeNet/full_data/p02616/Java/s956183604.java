import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Long> pos = new ArrayList<>(), neg = new ArrayList<>();
		int zeroes = 0;
		for (int i = 0; i < N; i++) {
			long tmp = sc.nextLong();
			if (tmp > 0) pos.add(tmp);
			else if (tmp == 0) zeroes++;
			else neg.add(-tmp);
		}
		Collections.sort(pos);
		Collections.sort(neg);
		boolean canPos = 2 * (neg.size() / 2) + pos.size() >= K && (pos.size() >= 1 || K % 2 == 0);
		long ans;
		if (canPos) {
			ans = 1;
			int p = pos.size() - 1, n = neg.size() - 1;
			if (K%2 == 1) {
				ans *= pos.get(p);
				ans %= MOD;
				p--;
				K--;
			}
			while (K > 0) {
				long tmpP = p >= 1 ? pos.get(p) * pos.get(p - 1) : -1;
				long tmpN = n >= 1 ? neg.get(n) * neg.get(n - 1) : -1;
				if (tmpP > tmpN) {
					ans *= pos.get(p);
					ans %= MOD;
					p--;
					ans *= pos.get(p);
					ans %= MOD;
					p--;
				} else {
					ans *= neg.get(n);
					ans %= MOD;
					n--;
					ans *= neg.get(n);
					ans %= MOD;
					n--;
				}
				K-=2;
			}
		} else if (zeroes > 0) {
			ans = 0;
		} else {
			ans = 1;
			int p = 0, n = 0;
			while (K > 0) {
				if (n >= neg.size() || p < pos.size() && pos.get(p) < neg.get(n)) {
					ans *= pos.get(p);
					ans %= MOD;
					p++;
				} else {
					ans *= neg.get(n);
					ans %= MOD;
					n++;
				}
				K--;
			}
			ans = MOD-ans;
			ans %= MOD;
		}
		out.println(ans);
		
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
