import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

	public static void quickSort(int[] a, int from, int to) {
		if (to - from <= 1) {
			return;
		}
		int i = from;
		int j = to - 1;
		int x = a[from + (new Random()).nextInt(to - from)];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}
		}
		quickSort(a, from, j + 1);
		quickSort(a, j + 1, to);
	}
	
	
	
	public void solve() {
		int n = in.nextInt();
		long x = in.nextLong();
//		long ans = 0;
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new BigInteger("" + in.nextLong());
		}
		BigInteger[] sum = new BigInteger[n + 1];
		sum[0] = BigInteger.ZERO;
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1].add(a[i - 1]);
		}
		BigInteger[] sumf = new BigInteger[n + 1];
		sumf[0] = BigInteger.ZERO;
		sumf[1] = a[0].add(BigInteger.ZERO);
		BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
		for (int i = 2; i < sumf.length; i++) {
			sumf[i] = sumf[i - 1].add(two.multiply(sum[i - 1])).add(a[i - 1]);
		}
//		for (int i = 0; i < sumf.length; i++) {
//			System.out.println(sum[i] + " " + sumf[i]);
//		}
		BigInteger[] dp = new BigInteger[n + 1];
		dp[n] = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			dp[i] = BigInteger.ONE.shiftLeft(80);
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i + 1; j < dp.length; j++) {
				BigInteger th = dp[j].add(new BigInteger(x * (j - i + 1) + ""));
				th = th.add(two.multiply(a[j - 1]));
//				System.out.println(i + " " + j);
//				System.out.println(th);
//				System.out.println();
				th = th.add(two.multiply(sum[j].subtract(sum[i])));
				th = th.add(sumf[j].subtract(sumf[i]));
				th = th.subtract(two.multiply(sum[i]).multiply(new BigInteger(j - i + "")));
				if (th.compareTo(dp[i]) < 0) {
					dp[i] = th;
				}
//				dp[i] = Math.min(dp[i], dp[j] + (j - i + 1) * x + 2 * a[j - 1] + 2 * (sum[j] - sum[i]) + sumf[j] - sumf[i] - 2 * (j - i) * sum[i]);
			}
//			for (int j = 0; j < dp.length; j++) {
//				System.out.println(dp[j]);
//			}
//			System.out.println();
		}
		out.println(dp[0]);
//		ans += a[n - 1];
//		ans += (n + 1) * x;
//		for (int i = 0; i < a.length - 1; i++) {
//			ans += (a[i + 1] - a[i]) * (n - i) * (n - i);
//		}
//		ans += a[0] * (n + 1) * (n + 1);
//		out.println(ans);
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("input.txt"));
				out = new PrintWriter(new File("output.txt"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}