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
		int[] t = new int[N + 1];
		int[] x = new int[N + 1];
		int[] y = new int[N + 1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		String ans = "Yes";
		
		for(int i = 0; i < N; i++) {
			t[i] = in.nextInt();
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			int dif_t = Math.abs(t[i] - t[i - 1]);
			int dif_x = Math.abs(x[i] - x[i - 1]);
			int dif_y = Math.abs(y[i] - y[i - 1]);
			
			if(dif_t >= dif_x + dif_y && (dif_t - dif_x + dif_y) % 2 == 0) {
				
			}else{
				ans = "No";
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

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
