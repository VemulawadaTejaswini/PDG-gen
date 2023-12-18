

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class D {
	static long N = 1000000007;

	static long exponentiation(long base, long exp) {
		long t = 1L;
		while (exp > 0) {
			if (exp % 2 != 0)
				t = (t * base) % N;

			base = (base * base) % N;
			exp /= 2;
		}
		return t % N;
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		long x = 0;
		
		if(b - 1 > n)
			x = n;
		else
			x = b - 1;
		
		long ans = (long)(Math.floorDiv((a * x) , b));
		System.out.println(ans);
		
		
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
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
}