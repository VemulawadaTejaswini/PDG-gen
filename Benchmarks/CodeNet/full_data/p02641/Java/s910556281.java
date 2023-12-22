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
		int[] arr = new int[110];
		private void solve(InputReader in, PrintWriter out) {
			int x = in.ni(), n = in.ni();
			if (n == 0) {
				out.println(x);
				return;
			}
			for (int i = 0; i < n; ++i) arr[i] = in.ni();
			Arrays.sort(arr, 0, n);
			int min = arr[0], max = arr[n-1];
			if (x < min) {
				for (int i = 0; i < n; ++i) {
					if (arr[i+1] - arr[i] == 1) continue;
					else {
						out.println(arr[i]+1);
						return;
					}
				}
			}
			if (x >= max) {
				for (int i = n-1; i >=0; --i) {
					if (Math.abs(arr[i+1] - arr[i]) == 1) continue;
					else {
						out.println(arr[i]-1);
						return;
					}
				}
			}
			int leastMinValue = Integer.MAX_VALUE;
			int val = 0;
			for (int i = 0; i < n; ++i) {
				if (arr[i+1]-arr[i] == 1) continue;
				else {
					for (int j = arr[i]+1; j < arr[i+1]; ++i) {
						if (leastMinValue > Math.abs(j - x)) {
							leastMinValue = Math.abs(j - x);
							val = j;
						}
					}
				}
			}
			out.println(val);
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
