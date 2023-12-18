
import java.io.*;
import java.util.*;

public class Main{

	static int g[][];
	static int l = 0;
	static int ans = 0;

	// smallest even number
	static int Grundy(int x) {
		if (x <= 0)
			return 0;
		int res = 1;
		while (x % 2 == 0) {
			x >>= 1;
			res <<= 1;
		}
		return res;
	}

	public static void Solve(int v, int h) {
		//System.out.println(v);
		if (v == -1) {
			if (l >= h)
				ans ^= Grundy(l - h + 1);
			return;
		}
		if (g[v][0] == -1 && g[v][1] == -1)
			return;
		Solve(g[v][0], h + 1);
		Solve(g[v][1], h + 1);
	}

	public static void main(String args[]) throws Exception {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int N = (int) 2E5 + 2;
		g = new int[N][2];
		int n = sc.nextInt();
		l = sc.nextInt();
		for (int i = 0; i < N; i++) {
			g[i][1] = g[i][0] = -1;
		}
		int m = 1;
		for (int i = 0; i < n; i++) {
			char arr[] = sc.next().toCharArray();
			int v = 0;
			for (int j = 0; j < arr.length; j++) {
				if (g[v][arr[i] - '0'] == -1)
					g[v][arr[i] - '0'] = m++;
				v = g[v][arr[i] - '0'];
			}
		}
		Solve(0, 0);
		if (ans != 0)
			System.out.println("Alice");
		else
			System.out.println("Bob");

		out.close();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
