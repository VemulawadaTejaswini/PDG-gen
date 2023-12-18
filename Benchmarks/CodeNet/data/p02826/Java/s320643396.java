import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int MOD, N;
	static int[][] table;
	
	static int calc(int pos, int rem) {
		if (pos == N) return rem;
		int ret = table[pos][rem];
		if (ret != -1) return ret;
		ret = 0;
		int factor = Math.min(pos, N + 1 - pos);
		for (int i = 0; i < rem ; i+= factor) {
			ret += calc(pos + 1, rem - i);
			ret %= MOD;
		}
		return table[pos][rem]=ret;
	}
	
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		MOD = sc.nextInt();
		
		table = new int[N + 1][N + 1];
		for (int rem = 0; rem < N + 1 ; rem++) {
			table[N][rem] = rem;
		}
		for (int pos = N - 1; pos >= 1; pos--) {
			for (int rem = 0; rem < N + 1; rem++) {
				int factor = Math.min(pos, N + 1 - pos);
				for (int i = 0; i < rem ; i+= factor) {
					table[pos][rem] += table[pos + 1][rem - i];
					table[pos][rem] %= MOD;
				}
			}
		}
		out.println(calc(1, N));
		
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
