import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		C_ExamAndWizard solver = new C_ExamAndWizard();
		solver.solve(1, in, out);
		out.close();
	}

	static class C_ExamAndWizard {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			Exam[] e = new Exam[n];
			for (int i = 0; i < n; i++) {
				e[i] = new Exam();
				e[i].a = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				e[i].b = in.nextInt();
				e[i].d = e[i].a - e[i].b;
			}

			Arrays.sort(e);
			int ans = 0;
			long need = 0;
			for (int i = 0; i < n; i++) {
				if (e[i].d < 0) {
					++ans;
					need -= e[i].d;
				}
			}
			for (int i = n - 1; i >= 0; i--) {
				if (e[i].d > 0 && need > 0) {
					++ans;
					need -= e[i].d;
				}
			}
			out.println(need > 0 ? -1 : ans);
		}

		class Exam implements Comparable<Exam> {
			int a;
			int b;
			int d;

			public int compareTo(Exam o) {
				if (d != o.d) {
					return d < o.d ? -1 : 1;
				}
				return 0;
			}

		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

