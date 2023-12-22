import java.util.*;
import java.io.*;

public class Main {

	static final int mod = 998244353;
	static long base;
	static long modInv;

	public static long dp(int idx, int rem, long[][] dp, int[] a) {
		if (rem < 0)
			return 0;
		if (rem == 0) {
			return base;
		}
		if (idx == a.length)
			return 0;
		if (dp[idx][rem] != -1)
			return dp[idx][rem];
		return dp[idx][rem] = (dp(idx + 1, rem, dp, a) + modInv * dp(idx + 1, rem - a[idx], dp, a)) % mod;

	}

	public static long modpow(int a, int e) {
		if (e == 0)
			return 1;
		long p = modpow(a, e / 2);
		if (e % 2 == 0)
			return (p * p) % mod;
		else
			return a * p % mod * p % mod;
	}

	public static long modInv(int a) {
		return modpow(a, mod - 2) % mod;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] a = sc.nextIntArr(n);
		long[][] dp = new long[n][s + 1];
		for (long[] x : dp)
			Arrays.fill(x, -1);
		base = modpow(2, a.length);
		modInv = modInv(2);
		pw.println(dp(0, s, dp, a));
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
