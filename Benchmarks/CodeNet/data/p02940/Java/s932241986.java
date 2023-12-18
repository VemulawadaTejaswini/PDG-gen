import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static final long MOD = 998244353;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		char[] vals = sc.next().toCharArray();
		int[][] positions = new int[3][N];
		int[] size = new int[3];
		for (int i = 0; i < 3 * N; i++) {
			int idx = getIndex(vals[i]);
			positions[idx][size[idx]++] = i;
		}
		long ans = 1;
		for (int i = 0; i < N; i++) {
			ans *= i + 1;
			ans %= MOD;
		}
		int current = 0;
		int[] it = new int[3], got = new int[3];
		while (current < N) {
			int min = 0;
			for (int i = 1; i < 3; i++) {
				if (positions[i][current] < positions[min][current]) min = i;
			}
			int first = -1, second = -1;
			for (int j = 0; j < 3; j++) if (j != min) {
				if (first == -1) first = j;
				else second = j;
			}
			int step = 1;
			for (int i = current + 1; i < N; i++) {
				if (positions[min][i] > positions[first][current]) break;
				if (positions[min][i] > positions[second][current]) break;
				step++;
			}
			Arrays.fill(got, 0);
			Arrays.fill(it, current);
			int max = current + step;
			for (int i = 0; i < step; i++) {
				ans *= i + 1;
				ans %= MOD;
			}
			for (int i = 0; i < 2 * step; i++) {
				if (it[first] < max && (it[second] >= max || positions[first][it[first]] < positions[second][it[second]])) {
					it[first]++;
					got[first]++;
				} else {
					it[second]++;
					got[second]++;
				}
				if (got[first] > 0 && got[second] > 0) {
					ans *= Math.max(got[first], got[second]);
					ans %= MOD;
					got[first]--;
					got[second]--;
				}
			}
			current += step;
		}
		out.println(ans);
		
		out.flush();
	}
	
	static int getIndex(char c) {
		return "RGB".indexOf(c);
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
