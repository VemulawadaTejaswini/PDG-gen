import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}

	static class Task {
		static int MAX = 1000000001;
		
		int N, K;
		int[] W;

		void solve(InputReader in, PrintWriter out) {
			N = in.nextInt();
			K = in.nextInt();
			W = in.nextIntArray(N);

			int ans = Integer.MAX_VALUE;
			int low = 0, high = MAX, mid;
			while (low < high - 1) {
				mid = (low + high) / 2;
				
				int k = 1;
				int p = mid;
				int cur = 0;
				
				for (int i = 0; i < N; ++i) {
					if (p < W[i]) {
						k = Integer.MAX_VALUE;
						break;
					}
					cur += W[i];
					if (cur > p) {
						k++;
						cur = W[i];
					}
				}
				
				if (k > K) {
					low = mid;
				} else {
					high = mid;
					ans = Math.min(ans, p);
				}
			}
			
			out.println(ans);
		}
	}

	static class InputReader {
		BufferedReader reader;
		StringTokenizer tokenizer;

		InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = nextInt();
			}
			return arr;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = nextLong();
			}
			return arr;
		}
	}
}

