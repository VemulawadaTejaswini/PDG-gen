import java.io.*;
import java.util.*;

public class Main {

	static int m = 1000000007;

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong(), k = scn.nextLong();
		System.out.println(Math.min(n % k, k - n % k));
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