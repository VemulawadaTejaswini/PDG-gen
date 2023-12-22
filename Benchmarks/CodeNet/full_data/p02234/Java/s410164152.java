import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.InputMismatchException;


public class Main {
	
	private static int[][] cache;
	private static int[] r;
	private static int[] c;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		r = new int[n];
		c = new int[n];

		for (int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		// 再帰的トップダウン型、履歴管理
		cache = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(cache[i], Integer.MIN_VALUE);
		}

		int ret = mcm(0, n -1);
		
		System.out.println(ret);
		
		sc.close();
	}
	
	private static int mcm(int i, int j) {
		if (cache[i][j] >= 0) {
			return cache[i][j];
		}
		
		if (i == j) {
			cache[i][j] = 0;
			return 0;
		} else {
			int min = Integer.MAX_VALUE;
			for (int k = 0; k < j - i; k++) {
				assert c[i+k] == r[i+k+1];
				min = Math.min(min, mcm(i, i + k) + r[i] * r[i+k+1] * c[j] + mcm(i + k + 1, j));
			}
			cache[i][j] = min;
			return min;
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;

		private Scanner() {
		}

		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}

		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return st.sval;
		}

		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return (int)st.nval;
		}

		void close() {
		}
	}
}