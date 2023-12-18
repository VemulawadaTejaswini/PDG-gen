import java.io.*;
import java.util.*;

public class Main {

	static int n, INF = (int) 1e9, a[][], memo[][];

	static int dp(int msk, int idx, int last) {
		if (idx == n)
			return 0;
		if (memo[last][msk] != -1)
			return memo[last][msk];
		int ans = INF;
		for (int put = 0; put < n; put++) {
			if ((msk & 1 << put) != 0)
				continue;
			int all = (1 << (put + 1)) - 1;
			int newPos = put + Integer.bitCount(msk&~all);
//			for (int j = put + 1; j < n; j++)
//				if ((msk & 1 << j) > 0)
//					newPos++;

			int val = a[put][Math.abs(put - idx) % 2];
			if (val >= last) {
				ans = Math.min(ans, dp(msk | 1 << put, idx + 1, val) + Math.abs(newPos - idx));
			}

		}
		return memo[last][msk] = ans;

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		a = new int[n][2];
		memo = new int[51][1 << n];
		for (int[] x : memo)
			Arrays.fill(x, -1);
		for (int j = 0; j < 2; j++)
			for (int i = 0; i < n; i++)
				a[i][j] = sc.nextInt();
		int ans=dp(0,0,0);
		out.println(ans>=INF?-1:ans);

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