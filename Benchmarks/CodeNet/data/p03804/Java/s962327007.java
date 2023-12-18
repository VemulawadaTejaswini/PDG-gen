import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int N = in.nextInt();
			int M = in.nextInt();
			String[] A = new String[N];
			for(int i = 0; i < N; i++) {
				A[i] = in.next();
			}
			String[] B = new String[M];
			for(int i = 0; i < M; i++) {
				B[i] = in.next();
			}
			String ans = "No";
			for(int i = 0; i < N; i++) {
				for(int j = 0; j + M < N; j++) {
					int count = 0;
					int h = 0;
					for(int k = 0; k < M; k++) {
//						out.println(B[k]);
						if(A[h].substring(j, j + M).equals(B[k])) {
							count++;
//							out.println(count);
						} else {
							break;
						}
						h++;
						if(count == M) {
							ans = "Yes";
							break;
						}
					}
					
				}
			}
			out.println(ans);
		}
	}

	static class InputReader {
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

		public char nextChar() {
			return next().charAt(0);
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
