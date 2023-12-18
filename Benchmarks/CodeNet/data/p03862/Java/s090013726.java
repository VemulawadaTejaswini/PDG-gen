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
			int x = in.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = in.nextInt();
			}
			int[] total = new int[N - 1];
			for(int i = 0; i < total.length; i++) {
				total[i] = a[i] + a[i + 1];
			}
			int index = 0;
			long count = 0;
			while(index != total.length - 1 || total[total.length - 1] > x) {
				if(total[index] > x) {
					int tmp;
					total[index] -= tmp = total[index] - x;
					if(index != total.length - 1) {
						total[index + 1] -= tmp;	
					}
					count += tmp;
				} else if(index != total.length - 1){	
					index++;
				}
			}
			out.println(count);
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
