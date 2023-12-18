import java.io.*;
import java.util.*;

public class Main {
	static int[] prefixFunction(char[] s) {
		int n = s.length, pi[] = new int[n];
		for (int i = 1, j = 0; i < n; ++i) {
			while (j > 0 && s[i] != s[j])
				j = pi[j - 1];
			if (s[i] == s[j])
				++j;
			pi[i] = j;
		}
		return pi;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		String S=sc.next();
		String tmp = S;
		char []t=sc.next().toCharArray();
		int n = tmp.length();
		tmp = tmp + "#" + new String(t);
		int []pi = prefixFunction(tmp.toCharArray());
	
		boolean ok=2*n<pi.length;
		for (int i = n + n; i < pi.length; i++) {
			if (pi[i] != n) {
				ok=false;
			}
		}
		
		char[] s = (S+S).toCharArray();
		
		tmp = new String(t) + "#" + new String(s);
		pi = prefixFunction(tmp.toCharArray());
		n = t.length;
		int curr = 0, ans = 0;
		for (int i = n + 1; i < pi.length;) {
			if (pi[i] == n) {
				curr++;
				i += n;
			} else {
				i++;
				curr = 0;
			}

			ans = Math.max(ans, curr);
		}
		
		out.println(ok ? -1 : ans);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}