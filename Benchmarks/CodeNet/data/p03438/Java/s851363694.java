import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		InputReader r = new InputReader(System.in);
		int n = r.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < b.length; i++) {
			a[i] = r.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = r.nextInt();
		}
		int first = 0, second = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] < b[i]) {
				int diff = b[i] - a[i];
				if (diff % 2 == 0)
					first += ((b[i] - a[i]) / 2);
				else {
					first += ((b[i] - a[i] + 1) / 2);
					second++;
				}
			} else if (a[i] > b[i]) {
				int diff = a[i] - b[i];
				second += diff;
			}
		}
		if (second > first)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

	static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public InputReader(FileReader stream) {
			reader = new BufferedReader(stream);
			tokenizer = null;
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
