import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		FastScanner scanner = new FastScanner(System.in);
		int n = (int) scanner.nextInt();
		int[] firstCards = scanner.nextIntArray(2);
		int[] cards = scanner.nextIntArray(n);
		int lastCard = cards[n-1];
		Arrays.sort(cards);
		int[] candidates = new int[4];
		candidates[0]=Math.abs(lastCard - cards[0]);
		candidates[1]=Math.abs(lastCard - cards[n-1]);
		candidates[2]=Math.abs(lastCard - firstCards[0]);
		candidates[3]=Math.abs(lastCard - firstCards[1]);
		Arrays.sort(candidates);
		PrintWriter printWriter = new PrintWriter(System.out);
//		printWriter.println(Arrays.toString(firstCards));
//		printWriter.println(Arrays.toString(cards));
//		printWriter.println(Arrays.toString(candidates));
		printWriter.println(candidates[3]);
		printWriter.close();
	}

	static class FastScanner {
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

		public String nextLine() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					return reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			return tokenizer.nextToken("\n");
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public long nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = (int) nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}
}