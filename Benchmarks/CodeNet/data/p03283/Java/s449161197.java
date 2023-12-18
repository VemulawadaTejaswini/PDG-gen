import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {
		int n = ni();
		int m = ni();
		int q = ni();
		int[][] a = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int s = ni();
			int e = ni();
			a[s][e]++;
		}
//		Helper.tr(a);
		for (int i = 1; i <= n; i++)
			for (int j = i; j <= n; j++) {
				a[i][j] += a[i][j - 1];
			}
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				a[j][i] += a[j-1][i];
			}
//		Helper.tr(a);
		for (int i = 1; i <= q; i++) {
			int s = ni();
			int e = ni();
			out.println(a[e][e]-a[s-1][e]-a[e][s-1]+a[s-1][s-1]);
		}
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