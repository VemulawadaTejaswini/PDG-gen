import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		double[][] truck = new double[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				truck[i][j] = file.nextDouble();
			}
		}
		double ans = 0.0;
		int[][] instruc = {{1, 1, 1}, {1, 1, 2}, {-1, -1, 1}, {-1, -1, 2}, {1, -1, 1}, {-1, 1, 1}, {1, -1, 2}, {-1, 1, 2}};
		for (int j = 0; j < instruc.length; j++) {
			double curX = 0.0;
			double curY = 0.0;
			for (int i = 0; i < n; i++) {
				boolean x = truck[i][0] > 0 == instruc[j][0] > 0;
				boolean y = truck[i][1] > 0 == instruc[j][1] > 0;
				int cnt = (x ? 1 : 0) + (y ? 1 : 0);
				if (cnt >= instruc[j][2]) {
					curX += truck[i][0];
					curY += truck[i][1];
				}
			}
			ans = Math.max(ans, Math.sqrt(curX * curX + curY * curY));
		}
		System.out.println(ans);
	}

	public static class FastIO {
		BufferedReader br;
		StringTokenizer st;

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static long pow(long n, long p, long mod) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n % mod;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2, mod);
			return (temp * temp) % mod;
		} else {
			long temp = pow(n, (p - 1) / 2, mod);
			temp = (temp * temp) % mod;
			return (temp * n) % mod;

		}
	}

	public static long pow(long n, long p) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2);
			return (temp * temp);
		} else {
			long temp = pow(n, (p - 1) / 2);
			temp = (temp * temp);
			return (temp * n);

		}
	}

	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		else
			return gcd(y % x, x);
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
