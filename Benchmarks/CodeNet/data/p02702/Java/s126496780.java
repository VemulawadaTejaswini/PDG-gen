import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static long inf = (long) 1e18 + 1;
	static int[] col;
	static int n, m;
	static ArrayList<Integer>[] ad;
	static long[][][] memo;
	static HashSet<Integer> h;
	static int[] a;
	static Integer[][] g;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		HashMap<Integer, Integer> hm = new HashMap<>();
		long ans = 0;
		hm.put(0, 1);
		String s = sc.nextLine();
		int[] pos = new int[s.length() + 1];
		pos[0] = 1;
		for (int i = 1; i < s.length() + 1; i++)
			pos[i] = 10 * pos[i - 1] % 2019;
		int v=0;
		sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		int b=1;
		for (int i = 0; i < s.length(); i++) {
			v = (v+(Integer.parseInt(sb.charAt(i) + ""))*b) % 2019;
		//	System.out.println(v);
			ans += hm.getOrDefault(v, 0);
			hm.put(v, hm.getOrDefault(v, 0) + 1);
			b=b*10%2019;
		}
		System.out.println(ans);
		out.flush();
	}

	static long modPow(long a, long e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
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