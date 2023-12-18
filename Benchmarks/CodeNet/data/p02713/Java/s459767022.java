import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		long ans = 0;
		for (int i = 1; i <= k; i++)
			for (int j = 1; j <= k; j++)
				for (int p = 1; p <= k; p++)
					ans += gcd(gcd(i, j), p);
		System.out.println(ans);
	}
 
	public static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
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