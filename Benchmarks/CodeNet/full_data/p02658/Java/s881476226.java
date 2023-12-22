

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();

		long ar[] = new long[n];
		boolean zero = false;
		
		BigInteger ans = new BigInteger("1");

		for (int i = 0; i < n; i++) {

			ar[i] = sc.nextLong();
			if (ar[i] == 0)
				zero = true;
		}

		if (zero) {
			pr.println("0");
			pr.close();
			return;
		}

		for (int i = 0; i < n; i++) {

			long a = ar[i];

			if (a == 0) {

				ans = BigInteger.ZERO;
				break;
			}

			ans = ans.multiply(new BigInteger(Long.toString(a)));
			
			if(ans.compareTo(new BigInteger("1000000000000000000")) > 0) {
				
				ans = new BigInteger("-1");
				break;
			}
		}

		pr.println(ans);

		pr.close();
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
