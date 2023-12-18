import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {






	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		long l = sc.nextLong();
		long t = sc.nextLong();
		long p[] = new long[n];
		long cw[] = new long[n];
		long end[] = new long[n];
		for (int i = 0 ; i < n ; ++i) {
			p[i] = sc.nextInt(); int c = sc.nextInt() - 1;
			cw[i] = c;
			int sign = (c == 0) ? 1 : -1;
			end[i] = (p[i] + t*sign ) % l;
			while (end[i] < 0) end[i] += l;
			end[i] %= l;
		}
		long col = 0;
		if (cw[0] == 0) {
			for (int i = 1 ; i < n ; ++i) {
				if (cw[i] == cw[0]) {
					continue;
				}
				long has = 2 * t;
				long d = p[i] - p[0];
				if (has >= d) {
					++col;
					has -= d;
					col += has / l;
					col %=n;
				}
			}
		} else {
			for (int i = 1 ; i < n ; ++i) {
				if (cw[i] == cw[0]) {
					continue;
				}
				long has = 2 * t;
				long d = l - p[i] + p[0];
				if (has >= d) {
					--col;
					has -= d;
					col -= has / l;
					col %= n;
				}

			}
		}
		Arrays.sort(end);
		while (col < 0) col += n;
		col %= n;
		int pos = (int)(col);
		
		for (int i = pos ; i < n ; ++i) out.print(end[i]+"\n");
		for (int i = 0 ; i < pos ; ++i) out.print(end[i]+"\n");
		out.flush();
		out.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}


}
