import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	int go(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			return Integer.MIN_VALUE;
		}
		
		return a + b + c - (a & 1) - (b & 1) - (c & 1);
	}

	void solve() throws IOException {
		int i = nextInt();
		int o = nextInt();
		int t = nextInt();
		int j = nextInt();
		int l = nextInt();
		int s = nextInt();
		int z = nextInt();
		
		int ans = o + Math.max(go(i, j, l), go(i - 1, j - 1, l - 1) + 1);
		
		out.println(ans);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}