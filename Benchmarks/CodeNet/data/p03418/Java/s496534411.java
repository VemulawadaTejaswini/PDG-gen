import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		long N = sc.nextLong();
		long K = sc.nextLong();
		long res = 0;
		if(K == 0) {
			System.out.println(N*N); return;
		}
		for(long b = K+1; b <= N; b++) {
			res += (N/b) * (b-K);
			res += Math.max(0, (N%b)-K+1);
		}
		System.out.println(res);
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
 
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
 
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
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
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
 
	}
}