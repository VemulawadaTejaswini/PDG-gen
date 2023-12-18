import java.util.*;
import java.io.*;

public class Main {

	long mod = 1000000007;
	int MAX = 600000;
	long[] fact = new long[MAX];

	void precalc() {
		fact[0] = 1;
		for (int i = 1; i < MAX; i++) {
			fact[i] = fact[i - 1] * i % mod;
		}
	}

	class BIT {
		int[] tree;

		public BIT(int n) {
			tree = new int[n];
		}

		int get(int pos) {
			int res = 0;
			while (pos >= 0) {
				res += tree[pos];
				pos = (pos & (pos + 1)) - 1;
			}
			return res;
		}

		void add(int pos, int val) {
			while (pos < tree.length) {
				tree[pos] += val;
				pos |= pos + 1;
			}
		}
	}

	void solve() {
		precalc();
		int n = in.nextInt();
		int[] p = new int[n];
		TreeSet<Integer> free = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			free.add(i);
		}
		for (int i = 0; i < n; i++) {
			p[i] = in.nextInt() - 1;
			free.remove(p[i]);
		}

		int[] all = new int[free.size()];
		int numFree = 0;
		for (int i : free) {
			all[numFree++] = i;
		}

		long result = 0;

		BIT tree = new BIT(n);

		long sumEmpty = 0;
		int tmp = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (p[i] == -1) {
				sumEmpty = (sumEmpty + fact[n - i - 1] * tmp) % mod;
				tmp++;
			}
		}

		if (numFree >= 2) {
			result = 1L * numFree * (numFree - 1) / 2 % mod * sumEmpty % mod * fact[numFree - 2] % mod;
		}
		
		int freePlaces = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (p[i] != -1) {
				int cnt = tree.get(p[i]);
				{
					long add = 1L * cnt * fact[n - i - 1] % mod * fact[numFree] % mod;
					result = (result + add) % mod;
				}
				if (numFree > 0) {
					long add = 1L * findLess(all, p[i]) * freePlaces % mod * fact[n - i - 1] % mod * fact[numFree - 1]
							% mod;
					result = (result + add) % mod;
				}
				tree.add(p[i], 1);
			} else {
				freePlaces++;
			}
		}
		Arrays.fill(tree.tree, 0);
		freePlaces = 0;
		long sumFacts = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] == -1) {
				freePlaces++;
				sumFacts = (sumFacts + fact[n - i - 1]) % mod;
				continue;
			}
			if (numFree > 0) {
			long add = 1L * (numFree - findLess(all, p[i])) * sumFacts % mod * fact[numFree - 1] % mod;
			result = (result + add) % mod;
			}
		}
		out.println((result + fact[numFree]) % mod);
	}

	int findLess(int[] a, int i) {
		int pos = Arrays.binarySearch(a, i);
		return -pos - 1;
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
