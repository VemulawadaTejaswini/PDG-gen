import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long ans = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 5 != 0)
				ans += i;
		}
		System.out.println(ans);
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