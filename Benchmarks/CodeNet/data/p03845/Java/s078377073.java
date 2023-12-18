import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(in, out);
		out.close();
	}
}

class TaskA {

	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt();
		int[] a = new int[n+1];
		int s = 0;

		for (int i=1; i<=n; ++i) {
			a[i] = in.nextInt();
			s += a[i];
		}

		int m = in.nextInt(), idx, x;
		int ans;

		for (int i=0; i<m; ++i) {
			idx = in.nextInt();
			x = in.nextInt();
			ans = s + x - a[idx];
			out.println(ans);
		}
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
		while (tokenizer==null || !tokenizer.hasMoreTokens()) {
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
