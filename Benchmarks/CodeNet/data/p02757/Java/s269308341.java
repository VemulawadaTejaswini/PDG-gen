import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 998244353;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] a = sc.nextLine().toCharArray();
		long ans = 0;
		if (k == 2 || k == 5) {
			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt("" + a[i]);
				if (x % k == 0)
					ans += (long) (i + 1);
			}
		} else {
			HashMap<Integer, Long> h = new HashMap<>();
			int sum = 0;
			h.put(0, 1l);
			int te=1;
			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt("" + a[i]);
				sum += x*te;
				te=te*10;
				te%=k;
				sum %= k;
                ans+=h.getOrDefault(sum, 0l);
                h.put(sum, 1l+h.getOrDefault(sum, 0l));
			}
		}
		out.print(ans);
		out.flush();
	}

	static class pair implements Comparable<pair> {
		int to;
		int number;

		pair(int t, int n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			return to - o.to;
		}

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