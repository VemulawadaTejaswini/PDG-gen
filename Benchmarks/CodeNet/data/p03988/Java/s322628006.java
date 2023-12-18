import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	String solve(int n, int[] cnt){
		
		int diam = n - 1;
		while (cnt[diam] == 0) {
			diam--;
		}
		
		if (cnt[diam] == 1) {
			return "Impossible";
		}
		
		if (diam == 1) {
			return (n == 2 ? "Possible" : "Impossible");
		}
		
		int cant = (diam - 1) / 2;
		for (int i = 1; i <= cant; i++) {
			if (cnt[i] != 0) {
				return ("Impossible");
			}
		}
		
		if (diam % 2 == 0) {
			if (cnt[diam / 2] != 1) {
				return ("Impossible");
			}
			for (int i = diam / 2 + 1; i <= diam; i++) {
				if (cnt[i] < 2) {
					return ("Impossible");
				}
			}
		} else {
			if (cnt[diam / 2 + 1] != 2) {
				return "Impossible";
			}
			for (int i = diam / 2 + 2; i <= diam; i++) {
				if (cnt[i] < 2) {
					return ("Impossible");
				}
			}
		}
		
		return "Possible";
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		int n = nextInt();
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			int x = nextInt();
			cnt[x]++;
		}
		out.println(solve(n, cnt));
		
//		int n = 5;
//		
//		for (int c1 = 0; c1 <= n; c1++)
//			for (int c2 = 0; c1 + c2 <= n; c2++)
//				for (int c3 = 0; c1 + c2 + c3 <= n; c3++) {
//					
//					int[] tmp = {0, c1, c2, c3, n - c1 - c2 - c3};
//					if (solve(n, tmp).equals("Possible")) {
//						System.err.println(Arrays.toString(tmp));
//					}
//					
//				}
		
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