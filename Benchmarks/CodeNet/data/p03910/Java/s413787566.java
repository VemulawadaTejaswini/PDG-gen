import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	boolean can(int max, int sum) {
		long total = (long)max * (max + 1) / 2;
		
		
		boolean ret = sum <= total;
		
		if (ret) {
			
			for (int i = max; i >= 1; i--) {
				if (sum >= i) {
					out.println(i);
					sum -= i;
				}
			}
			
		}
		
		return ret;
	}

	void solve() throws IOException {
		int n = nextInt();
		
		int ans = 1;
		while (true) {
			if (can(ans, n)) {
//				out.println(ans);
				return;
			}
			ans++;
		}
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