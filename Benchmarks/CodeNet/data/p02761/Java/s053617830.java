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
		n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt()-1;
			c[i] = sc.nextInt();
		}
	K:	for (int i = 0; i < 1000; i++) {
			String s = "" + i;
			if (s.length() != n)
				continue;
			for(int j=0;j<m;j++)
				if(a[j]>=s.length() || s.charAt(a[j])-'0'!=c[j])
					continue K;
			System.out.println(i);
			return;
		}
		System.out.println(-1);
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