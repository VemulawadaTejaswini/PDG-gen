import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	boolean go(String s, char c) {
		int lowVal = Integer.MAX_VALUE;
		int lowIdx = 0;
		int prevVal = 0;
		
		int pref = 0;
		
		for (int i = 0; i < s.length(); i++) {
			pref += (s.charAt(i) == c ? 1 : -1);
			if (pref > lowVal) {
				out.println((lowIdx + 1) + " " + (i + 1));
				return true;
			}
			if (prevVal < lowVal) {
				lowVal = prevVal;
				lowIdx = i;
			}
			prevVal = pref;
		}
		
		return false;
	}

	void solve() throws IOException {
		String s = nextToken();
		for (char c = 'a'; c <= 'z'; c++) {
			if (go(s, c)) {
				return;
			}
		}
		out.println("-1 -1");
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