

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {

		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		long a[] = new long[n];
		long b[] = new long[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextLong();

		for (int i = 0; i < m; i++)
			b[i] = sc.nextLong();

		int count = 0;
		long cost = 0;

		Stack<Long> s1 = new Stack<>();
		Stack<Long> s2 = new Stack<>();

		for (int i = n - 1; i >= 0; i--)
			s1.push(a[i]);

		for (int i = m - 1; i >= 0; i--)
			s2.push(b[i]);

		while (cost < k && !s1.isEmpty() && !s2.isEmpty()) {

			long x = s1.peek();
			long y = s2.peek();
			 
			if (x <= y) {

				cost += x;

				if (cost > k)
					break;

				count++;
				s1.pop();
			} else {

				cost += y;

				if (cost > k)
					break;

				count++;
				s2.pop();
			}
			//System.out.println(x + " " + y + " " + cost);
		}

		if (s1.isEmpty() && !s2.isEmpty() && cost < k) {

			while (cost < k && !s2.isEmpty()) {

				cost += s2.pop();
				if (cost > k)
					break;
				count++;
			}
		}

		else if (s2.isEmpty() && !s1.isEmpty() && cost < k) {

			while (cost < k && !s1.isEmpty()) {

				cost += s1.pop();
				if (cost > k)
					break;
				count++;
			}
		}
		pr.print(count /*+ " " + cost*/);
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
