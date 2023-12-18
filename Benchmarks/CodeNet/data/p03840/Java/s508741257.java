import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	long go(long a, long b, long c) {
		if (a < 0 || b < 0 || c < 0) {
			return Long.MIN_VALUE;
		}
		
		return a + b + c - (a & 1) - (b & 1) - (c & 1);
	}

	void solve() throws IOException {
		long i = nextLong();
		long o = nextLong();
		long t = nextLong();
		long j = nextLong();
		long l = nextLong();
		long s = nextLong();
		long z = nextLong();
		
		long ans = o + Math.max(go(i, j, l), go(i - 1, j - 1, l - 1) + 3);
		
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