import java.io.*;
import java.util.*;

public class Main {

	static int[] a, b[], memo[], pow[];
	static int MOD = (int) 1e9 + 7;

	static int dp(int idx, int rem) {
		if (idx == a.length)
			return rem == 0 ? 1 : 0;
		if (memo[idx][rem] != -1)
			return memo[idx][rem];
		int ans = 0;
		for (int take = 0; take <= rem; take++) {
			ans += pow[a[idx]][take] * 1L * dp(idx + 1, rem - take) % MOD;
			if (ans >= MOD)
				ans -= MOD;
		}
		return memo[idx][rem] = ans;

	}

	private static int pow(long b, int e) {
		// TODO Auto-generated method stub
		long ans = 1;
		while (e > 0) {
			if (e % 2 == 1)
				ans = ans * b % MOD;
			e >>= 1;
			b = b * b % MOD;
		}
		return (int) ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), C = sc.nextInt();
		a = new int[n];
		memo = new int[n][C + 1];
		pow = new int[401][401];
		for (int b = 1; b <= 400; b++) {
			int curr = 1;
			for (int e = 0; e <= 400; e++) {
				pow[b][e] = curr;
				curr = (int) (curr * 1L * b % MOD);
			}
		}
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			Arrays.fill(memo[i], -1);
		}
		System.out.println(dp(0, C));
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}