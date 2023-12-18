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
		String s = in.next();
		int len = s.length(), n = len - 1;
		char[] buf = s.toCharArray();
		int[] a = new int[len];
		long ans = 0, tmp, sum;

		if (len == 1) {
			out.println(s);
			return ;
		}

		for (int i=0; i<len; ++i)
			a[i] = buf[i] - '0';

		int mst = 1<<n;

		for (int st=0; st<mst; ++st) {
			sum = 0;
			tmp = a[0];
			for (int j=0; j<n; ++j) {
				if ((st & (1<<j)) == 0) {
					// consecutive
					tmp = 10 * tmp + a[j+1];
				} else {
					// there is '+'
			//		out.print(tmp + "+");
					sum += tmp;
					tmp = a[j+1];
				}
			}
			sum += tmp;
			//out.println(tmp + " = " + sum);
			ans += sum;
		}

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

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
