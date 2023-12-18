import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;
	
	int[] p;
	
	int get(int v) {
		return p[v] == v ? v : (p[v] = get(p[v]));
	}
	
	void unite(int a, int b) {
		a = get(a);
		b = get(b);
		
		if (a != b) {
			if (((a + b) & 1) == 1) {
				p[a] = b;
			} else {
				p[b] = a;
			}
		}
	}

	void solve() throws IOException {
		int n = nextInt();
		int m = nextInt();
		
		p = new int[n + m];
		
		for (int i = 0; i < n + m; i++) {
			p[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			int k = nextInt();
			for (int j = 0; j < k; j++) {
				int lang = nextInt() - 1 + n;
				
				unite(i, lang);
				
			}
		}
		
		int who0 = get(0);
		for (int i = 0; i < n; i++) {
			if (get(i) != who0) {
				out.println("NO");
				return;
			} 
		}
		
		out.println("YES");
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