import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		long[] count = new long[100001];
		int N = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			count[tmp]++;
			sum += tmp;
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			sum -= b * count[b];
			sum += c * count[b];
			count[c] += count[b];
			count[b] = 0;
			out.println(sum);
		}

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
