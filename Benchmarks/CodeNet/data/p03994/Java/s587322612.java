import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		InputReader r = new InputReader(System.in);
		char[] arr = r.next().toCharArray();
		int k = r.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 'a') {
				int dist = 'z' - arr[i] + 1;
				if (dist <= k) {
					arr[i] = 'a';
					k -= dist;
				}
			}
		}
		if (k > 0) {
			k %= 26;
			for (int j = 0; j < k; j++)
				if (arr[arr.length - 1] != 'z')
					arr[arr.length - 1]++;
				else
					arr[arr.length - 1] = 'a';
		}
		System.out.println(new String(arr));
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
