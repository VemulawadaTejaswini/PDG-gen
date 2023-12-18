import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		double x = 0.006;
		int ans = 0;
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int y = in.nextInt();
			 double r = t - y * x;
			double b = 0;
			// out.println(r);
			if (r < 0 && a < 0) {
				b = Math.abs(a - r);
			} else if (a < 0 && r > 0) {
				b = Math.abs(Math.abs(a) + r);
			} else if (a > 0 && r < 0) {
				b = Math.abs(a + Math.abs(r));
			} else {
				b = Math.abs(a - r);
			}
			if (b < min) {
				
				min = b;
				ans = i + 1;
			}
		}
		out.println(ans);

		out.flush();
		out.close();

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