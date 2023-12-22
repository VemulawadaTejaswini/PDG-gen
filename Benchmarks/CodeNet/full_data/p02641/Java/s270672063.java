import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		if (N == 0) {
			System.out.println(X);
		}
		else {
			int[] numbers = new int[N];
			for (int i=0; i < N; i++) {
				numbers[i] = sc.nextInt();
			}

			int min = -1;
			for (int j=X; j >= 0; j--) {
				boolean found = false;
				for (int i=0; i < N; i++) {
					if (numbers[i] == j) {
						found = true;
						break;
					}
				}
				if (!found) {
					min = j;
					break;
				}
			}

			int max = -1;
			for (int j=X+1; j <= 101; j++) {
				boolean found = false;
				for (int i=0; i < N; i++) {
					if (numbers[i] == j) {
						found = true;
						break;
					}
				}
				if (!found) {
					max = j;
					break;
				}
			}

			if (max == -1 && min != -1) {
				System.out.println(min);
			}
			else if (min == -1 && max != -1) {
				System.out.println(max);
			}
			else {
				if ((X-min) <= (max-X)) {
					System.out.println(min);
				}
				else {
					System.out.println(max);
				}
			}
		}
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
