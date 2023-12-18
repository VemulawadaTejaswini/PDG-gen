import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static final long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		char first = arr[0];
		int minOdd = Integer.MAX_VALUE;
		int idx = 0;
		while (idx < M) {
			int cantFirst = 0;
			while (idx < M && arr[idx] == first) {
				cantFirst++;
				idx++;
			}
			if (idx < M) {
				if (cantFirst % 2 == 0) cantFirst++;
				minOdd = Math.min(minOdd, cantFirst);
				while (idx < M && arr[idx] != first) {
					idx++;
				}
			}
		}
		long ans = 0;
		if (minOdd == Integer.MAX_VALUE) {
			long[][][] table = new long[2][2][N-1];
			
			table[0][1][0] = table[1][0][0] = table[0][0][0] = 1;
			for (int size = 1; size < N - 1; size++) {
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						table[i][j][size] = table[0][j][size-1];
						if (i != 1) {
							table[i][j][size] += table[1][j][size-1];
							table[i][j][size] %= MOD;
						}
					}
				}
			}
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) if (i != 1 || j != 1) {
					ans += table[i][j][N - 2];
					ans %= MOD;
				}
			}
		} else if (N % 2 == 0) {
			int maxStep = (minOdd + 1) / 2;
			int tot = N / 2;
			long[] table = new long[tot + 1];
			long[] acum = new long[tot + 1];
			table[0] = 1;
			acum[0] = 1;
			for (int i = 1; i < tot; i++) {
				table[i] = acum[i - 1] - (i - maxStep - 1 >= 0 ? acum[i - maxStep - 1] : 0);
				acum[i] = (acum[i - 1] + table[i]) % MOD;
			}
			for (int i = 1; i <= tot && i <= maxStep; i++) {
				ans += table[tot - i] * 2 * i;
				ans %= MOD;
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
