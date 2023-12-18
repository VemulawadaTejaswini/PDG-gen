import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int aFrom = sc.nextInt();
		int bFrom = sc.nextInt();
		int aTo = aFrom;
		int bTo = bFrom;
		char[] S = sc.next().toCharArray(), T = sc.next().toCharArray();
		boolean wins = false;
		for (int i = 0; i < N && !wins; i++) {
			if (S[i] == 'U') {
				aFrom--;
				if (aFrom < 1) wins = true;
			} else if (S[i] == 'D') {
				aTo++;
				if (aTo > H) wins = true;
			}
			if (T[i] == 'U') {
				aTo = Math.max(1, aTo - 1);
			} else if (T[i] == 'D') {
				aFrom = Math.min(H, aFrom + 1);
			}
			if (S[i] == 'L') {
				bFrom--;
				if (bFrom < 1) wins = true;
			} else if (S[i] == 'R') {
				bTo++;
				if (bTo > W) wins = true;
			}
			if (T[i] == 'L') {
				bTo = Math.max(1, bTo - 1);
			} else if (T[i] == 'R') {
				bFrom = Math.min(W, bFrom + 1);
			}
		}
		out.println(wins ? "NO" : "YES");
		
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
