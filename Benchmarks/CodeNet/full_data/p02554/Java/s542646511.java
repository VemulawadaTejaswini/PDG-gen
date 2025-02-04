
// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

	static long m = (long) 1e9 + 7;

	public static long power(long x, long y) {

		long res = 1;

		x = x % m;

		if (x == 0)
			return 0;

		while (y > 0) {

			if ((y & 1) == 1)
				res = (res * x) % m;

			y = y >> 1;
			x = (x * x) % m;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {

		FastScanner sc = new FastScanner();
		long n = sc.nextLong();
		if (n <= 1)
			System.out.println(0);

		else 
		{
			long powerOf8 = power(8, n);
			long ans = (power(10, n) - powerOf8 - ((power(9, n) - powerOf8+m)%m * 2)%m + m) % m;

			System.out.println(ans);
		}
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}