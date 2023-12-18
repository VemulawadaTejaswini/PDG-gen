import java.io.*;
import java.util.*;

public class Main {

	static int m = 1000000007;

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		double a[] = new double[n];
		double s = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
			s += a[i];
		}
		double v = s / (4 * m * 1.0);
		int c = 0;
		for (double v1 : a)
			if (v1 >= v)
				c++;
		if (c >= m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static class Scanner {

		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}