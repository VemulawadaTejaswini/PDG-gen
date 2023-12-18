import java.io.*;
import java.util.*;

public class Main {

	static long m = (long) (1e9 + 7);

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int a[] = { scn.nextInt(), scn.nextInt() };
		int a2[] = { scn.nextInt(), scn.nextInt() };

		int c1 = a2[0] / a[1] + (a2[0] % a[1] != 0 ? 1 : 0);
		int c2 = a[0] / a2[1] + (a[0] % a2[1] != 0 ? 1 : 0);

		if (c1 <= c2)
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