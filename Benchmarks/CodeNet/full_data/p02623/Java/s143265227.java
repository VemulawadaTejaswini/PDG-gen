import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();

		long a_books[] = new long[N];
		for (int i = 0; i < N; i++) {
			a_books[i] = sc.nextLong();
		}
		long b_books[] = new long[M];
		for (int i = 0; i < M; i++) {
			b_books[i] = sc.nextLong();
		}

		long total = 0;
		int i=0, j=0;
		while (i < N && total + a_books[i] <= K) {
			total += a_books[i];
			i++;
		}
		while (j < M && total + b_books[j] <= K) {
			total += b_books[j];
			j++;
		}

		int ans = i + j;
		i--;
		for (; i >= 0; i--) {
			total -= a_books[i];
			while (j < M && total + b_books[j] <= K) {
				total += b_books[j];
				j++;
			}
			if (ans <= i + j) {
				ans = i + j;
			}
		}

		System.out.println(ans);
	}

	private static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
