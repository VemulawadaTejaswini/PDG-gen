

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	static long expo(long base, long exp) {
		long t = 1L;
		while (exp > 0) {
			if (exp % 2 != 0)
				t = (t * base);

			base = (base * base);
			exp /= 2;
		}
		return t;
	}

	static int calcAngle(double h, double m) {

		if (h == 12)
			h = 0;
		if (m == 60)
			m = 0;

		int hour_angle = (int) (0.5 * (h * 60 + m));
		int minute_angle = (int) (6 * m);

		int angle = Math.abs(hour_angle - minute_angle);

		angle = Math.min(360 - angle, angle);

		return angle;
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double ans = 0.0, angle = 0.0;
		
		/*if(m % 5 == 0 && h + (m / 5) == 12) {
			System.out.println((double)(a + b) + "00000000000000000000");
			return;
		}*/
		
		angle = calcAngle((double) h, (double) m);
		
		ans = (double)(a * a + b * b) - (double)((2 * a * b) * Math.cos((angle * Math.PI)/ 180.0));
		System.out.println(Math.sqrt(ans));

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