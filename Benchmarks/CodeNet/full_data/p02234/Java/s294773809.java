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

		// ボトムアップ型２
		cache = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(cache[i], Integer.MAX_VALUE);
			cache[i][i] = 0;
		}

		for (int j = 1; j < n; j++) {
			for (int i = j - 1; i >= 0; i--) {
				for (int k = 0; k < j - i; k++) {
					cache[i][j] = Math.min(cache[i][j], cache[i][i + k] + r[i] * r[i+k+1] * c[j] + cache[i + k + 1][j]);
				}
			}
		}
		int ret = cache[0][n -1];
		
		System.out.println(ret);
		
		sc.close();
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