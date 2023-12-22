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
		long first = sc.nextLong();
		long second = sc.nextLong();
		long xor = 0;
		for (int i = 2; i < N; i++) {
			xor ^= sc.nextLong();
		}
		long total = first + second;
		long ans = -1;
		if (total >= xor) {
			long dif = total - xor;
			long dupMask = dif >> 1;
			if (dif % 2 == 0 && (dupMask & xor) == 0 && dupMask <= first) {
				long finalFirst = dupMask;
				while (xor > 0) {
					long bit = Long.highestOneBit(xor);
					if ((finalFirst | bit) <= first) {
						finalFirst |= bit;
					}
					xor ^= bit;
				}
				if (finalFirst > 0) {
					ans = first - finalFirst;
				}
			}
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
