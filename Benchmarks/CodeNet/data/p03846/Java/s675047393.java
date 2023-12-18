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
		int n = in.nextInt(), x;
		int[] c = new int[n];

		Arrays.fill(c, 0);
		for (int i=0; i<n; ++i)	{
			x = in.nextInt();
			++c[x];
		}

		for (int i=0; i<n; ++i) {
			x = Math.abs(n-1-i-i);
			--c[x];
		}

		for (int i=0; i<n; ++i) {
			if (c[i] != 0) {
				out.println(0);
				return ;
			}
		}

		int m = n / 2;
		int ans = 1;
		int mod = (int)(1e9+7);

		for (int i=0; i<m; ++i) {
			ans = (ans + ans) % mod;
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

