import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {
		solve(ni());
	}

	private void solve(int n) throws IOException {
		int[][] a = new int[n][];
		int[] b = new int[2 * n];
		for (int i = 0; i < n; i++) {
			a[i] = nia(2);
			b[2 * i] = a[i][0];
			b[2 * i + 1] = a[i][1];
		}
		Arrays.sort(b);
		int m = b[n];
		long ans = 0;
		for (int[] seg : a) {
			if (m >= seg[0] && m <= seg[1])
				continue;
			if (seg[0] > m)
				ans += seg[0] - m;
			else if (seg[1] < m)
				ans += -seg[1] + m;
		}
//		Helper.tr(m, ans);
		out.println(ans);

	}

	String ns() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " ");
		}
		return tok.nextToken();
	}

	int ni() throws IOException {
		return Integer.parseInt(ns());
	}

	long nl() throws IOException {
		return Long.parseLong(ns());
	}

	double nd() throws IOException {
		return Double.parseDouble(ns());
	}

	String[] nsa(int n) throws IOException {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = ns();
		}
		return res;
	}

	int[] nia(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = ni();
		}
		return res;
	}

	long[] nla(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = nl();
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}
}