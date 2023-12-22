

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		StringBuilder ans = new StringBuilder("");
		boolean flag = true;
		for (int i = 0; i < n; i++) {

			if (a < 0 || b < 0 || c < 0) {
				flag = false;
				break;
			}
			String s = sc.next();

			if (s.equals("AB")) {

				if (a > b) {
					b++;
					a--;
					ans.append("B\n");
				} else {
					a++;
					b--;
					ans.append("A\n");
				}
			}

			if (s.equals("BC")) {

				if (b > c) {
					c++;
					b--;
					ans.append("C\n");
				} else {
					b++;
					c--;
					ans.append("B\n");
				}
			}

			if (s.equals("AC")) {

				if (c > a) {
					a++;
					c--;
					ans.append("A\n");
				} else {
					c++;
					a--;
					ans.append("C\n");
				}
			}
			//pr.println(a + " " + b + " " + c);
		}
		if (a < 0 || b < 0 || c < 0)
			flag = false;

		if (!flag)
			pr.println("No");
		else {
			pr.println("Yes");
			pr.println(ans.toString());
		}

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