import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, k;
	static long mod = 998244353;
	static int[][] memo, val;
	static String s;
	static HashSet<Integer> nodes;
	static ArrayList<Integer>[] ad, tree;
	static boolean[] vis, taken;
	static int[] a;
	static TreeSet<Long> al;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		long n = sc.nextLong();
		int ans = 2;
		long k = n - 1;
		for (long i = 2; i <= Math.sqrt(k); i++) {
			if (k % i != 0)
				continue;
			if (i == k / i)
				ans++;
			else
				ans += 2;
		}

		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i != 0)
				continue;
			if (i == n / i) {
				long nn = n;
				while (nn % i == 0)
					nn /= i;
				if(nn==1)
					ans++;
				else if(nn>i) {
					if(nn%i==1)
						ans++;
				}
			} else {
				long nn = n;
				while (nn % i == 0)
					nn /= i;
				if(nn==1)
					ans++;
				else if(nn>i) {
					if(nn%i==1)
						ans++;
				}
				long j=n/i;
				nn = n;
				while (nn % j == 0)
					nn /= j;
				if(nn==1)
					ans++;
				else if(nn>j) {
					if(nn%j==1)
						ans++;
				}
		//		System.out.println(i);
			}
		}

		System.out.println(ans);
		out.flush();
	}

	static long num;
	static int[] si;
	static ArrayList<Integer> primes;

	static long phi(long N) {
		long ans = N;
		int idx = 0, p = primes.get(0);
		while (p * p <= N) {
			if (N % p == 0)
				ans -= ans / p;
			while (N % p == 0)
				N /= p;
			p = primes.get(++idx);
		}

		if (N != 1)
			ans -= ans / N;
		return ans;
	}

	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);
		}
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class pair implements Comparable<pair> {
		int to;
		int number;

		pair(int n, int t) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			return number - o.number;
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