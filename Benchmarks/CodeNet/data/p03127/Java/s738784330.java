import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static long inf = (long) 1e18 + 1;
	static int[] col;
	static int n, m;
	static ArrayList<pair>[] ad;
	static long[][][] memo;
	static HashSet<Integer> h;
	static int[] a;
	static char[][][] g;
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n=sc.nextInt();
	//	int []a=sc.nextArrInt(n);
		int d=0;
		for(int i=0;i<n;i++)
			d=gcd(d, sc.nextInt());
		System.out.println(d);
		out.flush();
	}
	static int gcd(int a, int b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	static class pair implements Comparable<pair> {
		long to;
		long number;

		pair(long t, long n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			if (to == o.to)
				return Long.compare(number, o.number);
			return Long.compare(to, o.to);
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

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}