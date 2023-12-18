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
		long a = (long)(in.nextInt()), b = (long)(in.nextInt());

		// out.println(a + " " + b);
		for (int i=1; i<n; ++i) {
			int c = in.nextInt(), d = in.nextInt(), e = c + d;
			long s = a + b;

			long per = (long)(Math.ceil(s / e));
			long na = -1, nb = -1;

			while (!(na>=a && nb>=b)) {
				na = per * c;
				nb = per * d;
				++per;
			}

			a = na;
			b = nb;

			// out.println(a + " " + b);
		}

		long ans = a + b;
		out.println(ans);
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

}