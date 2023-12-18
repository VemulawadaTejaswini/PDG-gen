import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static final int MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] S = new int[N], T = new int[M];
		for (int i = 0; i < N; i++) {
			S[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			T[i] = sc.nextInt();
		}
		int[][][] table = new int[2][N+1][M+1]; // 0 no restriction, 1 must use first of S
		Arrays.fill(table[0][N], 1);
		for (int i = 0; i < N; i++) {
			table[0][i][M] = 1;
		}
		for (int i = N - 1; i >= 0; i--) {
			for (int j = M - 1; j >= 0; j--) {
				table[1][i][j] = table[1][i][j+1];
				if (S[i] == T[j]) {
					table[1][i][j] += table[0][i+1][j+1];
					table[1][i][j] %= MOD;
				}
				table[0][i][j] = (table[1][i][j] + table[0][i+1][j]) % MOD;
			}
		}
		out.println(table[0][0][0]);
		
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
