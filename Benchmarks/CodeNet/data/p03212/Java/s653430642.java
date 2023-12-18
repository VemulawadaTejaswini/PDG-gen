import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;
import java.util.*;

public class Main {

	static int n = 0;
	static Set<Long> set = new HashSet<>();

	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		n = in.nextInt();
		dfs(0);
		int ans = 0;
		for (Long a : set) {
			String x = String.valueOf(a);
			if (x.contains("3") && x.contains("5") && x.contains("7")) {
				++ans;
			}
		}
		out.println(ans);
		out.flush();
		out.close();

	}

	static void dfs(long x) {
		if (x > n) {
			return;
		}
		if (x != 0) {
			set.add(x);
		}
		dfs(x * 10 + 3);
		dfs(x * 10 + 5);
		dfs(x * 10 + 7);
	}

	static class FastReader {
		StringTokenizer st;
		BufferedReader br;

		public FastReader(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public FastReader(FileReader fileReader) {
			br = new BufferedReader(fileReader);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}