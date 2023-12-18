import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		int k = nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		
		long[] prefPos = new long[n + 1];
		long[] suffPos = new long[n + 1];
		
		long[] pref = new long[n + 1];
		
		for (int i = 0; i < n; i++) {
			prefPos[i + 1] = prefPos[i] + Math.max(a[i], 0);
			pref[i + 1] = pref[i] + a[i];
		}
		
		for (int i = n - 1; i >= 0; i--) {
			suffPos[i] = suffPos[i + 1] + Math.max(a[i], 0); 
		}
		
		long ans = 0;
		
		for (int pos = 0; pos + k <= n; pos++) {
			
			long here = Math.max(pref[pos + k] - pref[pos], 0);
			
			here += prefPos[pos];
			here += suffPos[pos + k];
			
			ans = Math.max(ans, here);
		}
		
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