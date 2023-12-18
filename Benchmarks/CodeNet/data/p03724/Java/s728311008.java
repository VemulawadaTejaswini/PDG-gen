import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];

		for (int i = 0; i < M; i++) {
			a[i] = reader.nextInt();
			b[i] = reader.nextInt();
		}

		int[] queryAppearCount = new int[N];

		for (int i = 0; i < M; i++) {
			queryAppearCount[a[i] - 1]++;
			queryAppearCount[b[i] - 1]++;
		}

		String res = "YES";
		for (int i = 0; i < N; i++) {
			if (queryAppearCount[i] % 2 == 1) {
				res = "NO";
				break;
			}
		}

		System.out.println(res);

	}
}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
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
}