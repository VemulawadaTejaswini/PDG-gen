import java.io.*;
import java.util.*;

public class Main {
	static class InputReader {
		BufferedReader reader;
		StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens())
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		InputReader f = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = f.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = f.nextInt();
		}
		
		Arrays.sort(A);
		
		boolean[] bad = new boolean[N];
		int ans = N;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (bad[j]) continue;
				
				if (A[j] % A[i] == 0) {
					bad[j] = true;
					ans--;
				}
			}
		}
		
		if (N >= 2 && A[0] == A[1]) {
			ans--;
		}
		
		out.println(ans);
		
		f.close();
		out.close();
	}
}