import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 998244353;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int al = (int)  Math.ceil((a) / 0.08);
		int ar = (int) Math.ceil((a + 1) / 0.08)-1;
		int bl = (int)  Math.ceil((b) / 0.1);
		int br = (int) Math.ceil((b + 1) / 0.1)-1;
	//	System.out.println(al + " " + ar + " " + bl + " " + br);
		int ans=0;
		if (bl < al)
			ans = al;
		else
			ans = bl;
		if (ans > br || ans > ar) {
			System.out.println(-1);
			return;
		}
		out.println(ans);
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

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}