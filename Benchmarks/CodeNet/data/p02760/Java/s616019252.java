import java.util.*;

import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int[][] g = new int[3][3];
		boolean[][] vis = new boolean[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				g[i][j] = sc.nextInt();
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			for (int k = 0; k < 3; k++)
				for (int j = 0; j < 3; j++)
					if (g[k][j] == x)
						vis[k][j] = true;

		}
		boolean f = false;
		for (int i = 0; i < 3; i++) {
			int c = 0;
			int cc = 0;
			for (int j = 0; j < 3; j++) {
				if (vis[i][j])
					c++;
				if (vis[j][i])
					cc++;
			}
			if (c == 3 || cc == 3)
				f = true;
		}
		int c=0;
		int cc=0;
		for (int i = 0; i < 3; i++) {
                if(vis[i][i])
                	c++;
                if(vis[i][2-i])
                	cc++;
		}
		if (c == 3 || cc == 3)
			f = true;
		if (f)
			out.println("Yes");
		else
			out.println("No");
		out.flush();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}