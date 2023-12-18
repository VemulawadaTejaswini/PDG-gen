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
		String[] ss = new String[3];
		int[] beg = new int[3];
		int[] sz = new int[3];

		Arrays.fill(beg, 0);
		for (int i=0; i<3; ++i) {
			ss[i] = in.next();
			sz[i] = ss[i].length();
		}

		int cur = 0;

		while (beg[cur] < sz[cur]) {
			int nxt = getId(ss[cur].charAt(beg[cur]));
			beg[cur]++;
			cur = nxt;
		}

		char ans = (char)(cur + 'A');
		
		out.println(ans);
	}

	private int getId(char ch) {
		return ch - 'a';
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
