import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Solution sol = new Solution();
		sol.solve(in, out);
		out.close();
	}

	private static class Solution {
		private void solve(InputReader in, PrintWriter out) {
			int N = in.ni();
			int[] a = new int[N];
			for (int i = 0; i < N; ++i) a[i] = in.ni();
			int[] f = new int[100001];
			int s = Arrays.stream(a).sum();
			for (int v : a) f[v] += 1;
			int q = in.ni();
			for (int z = 0; z < q; ++z) {
				int b = in.ni(), c = in.ni();
				s += (c - b) * f[b];
				f[c] += f[b];
				f[b] = 0;
				out.println(s);
			}
		}
	}
	
	private static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		private InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		private String n() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		private int ni() {
			return Integer.parseInt(n());
		}
	}

}
