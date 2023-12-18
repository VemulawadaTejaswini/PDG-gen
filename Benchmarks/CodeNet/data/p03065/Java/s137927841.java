import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long[] pol = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			pol[N-i] = sc.nextInt();
		}
		long p0 = Math.abs(pol[0]);
		for (long prime = 2; prime * prime <= p0 ; prime++) {
			if (p0 % prime == 0) {
				if (divides(pol.clone(), (int)prime)) out.println(prime);
			}
			while (p0 % prime == 0) p0 /= prime;
		}
		if (p0 > 1 && divides(pol.clone(), (int)p0)) out.println(p0);
		
		out.flush();
	}
	
	static boolean divides(long[] pol, int p) {
		int n = pol.length - 1;
		while (n >= p-1) {
			pol[n - p + 1] += pol[n];
			pol[n] = 0;
			n--;
		}
		for (int i = 0; i < p && i < pol.length; i++) {
			if (pol[i] % p != 0) return false;
		}
		return true;
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
