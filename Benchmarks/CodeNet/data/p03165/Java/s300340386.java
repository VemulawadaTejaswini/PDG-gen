import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
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

	static String[][] dp;
	static ArrayList<Integer>[] m1;
	static ArrayList<Integer>[] m2;
	public static void main(String[] args) {
		Reader r = new Reader();

		String s = r.next();
		String t = r.next();
		dp = new String[s.length() + 1][t.length() + 1];
//		m1 = new ArrayList[26];
//		m2 = new ArrayList[26];
		
		for (int i = 0; i < s.length() + 1; i++) {
			Arrays.fill(dp[i], "");
		}
		
//		for (int j = t.length() - 1; j >= 0; j--) {
//			if (s.charAt(s.length() - 1) == t.charAt(j)) {
//				dp[s.length() - 1][j] += t.charAt(j);
//				for (; j >= 0; j--) {
//					dp[s.length() - 1][j] += t.charAt(j);
//				}
//			}
//		}
		
//		for (int i = 0; i < s.length() + 1; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = t.length() - 1; j >= 0; j--) {
				if (s.charAt(i) == t.charAt(j)) {
					dp[i][j] = s.charAt(i) + dp[i + 1][j + 1];
				} else { 
					if (dp[i + 1][j].length() > dp[i][j + 1].length()) {
						dp[i][j] = dp[i + 1][j];
					} else {
						dp[i][j] = dp[i][j + 1];
					}
				}
			}
		}
//		for (int i = 0; i < s.length() + 1; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		System.out.println(dp[0][0]);
		
//		for (int i = 0; i < 26; i++) {
//			m1[i] = new ArrayList<Integer>();
//			m2[i] = new ArrayList<Integer>();
//		}
//		
//		for (int i = 0; i < s.length(); i++) {
//			Arrays.fill(dp[i], "");
//			
//			m1[s.charAt(i) - 'a'].add(i);
//		}
//		for (int i = 0; i < t.length(); i++) {
//			m2[t.charAt(i) - 'a'].add(i);
//		}
//
//		System.out.println(recur(s, t, 0, 0));
	}

	static String recur (String s, String t, int a, int b) {
		System.out.println(a + " " + b);
		if (a > s.length() - 1 || b > t.length() - 1) {
			return "";
		} else if (dp[a][b].length() > 0) {
			return dp[a][b];
		} else {
			String max = "";

			char c1 = s.charAt(a);
			char c2 = t.charAt(b);

			if (c1 == c2) {
				max = c1 + recur(s, t, a + 1, b + 1);
			} else {
				for (int i = 0; i < m2[c1 - 'a'].size(); i++) {
					if (m2[c1 - 'a'].get(i) > b) {
						max = c1 + recur(s, t, a + 1, m2[c1 - 'a'].get(i) + 1);
						break;
					}
				}
				for (int i = 0; i < m1[c2 - 'a'].size(); i++) {
					if (m1[c2 - 'a'].get(i) > a) {
						String l = c2 + recur(s, t, m1[c2 - 'a'].get(i) + 1, b + 1);
						if (l.length() > max.length()) {
							max = l;
						}
						break;
					}
				}
				
				if (max.length() == 0) {
					max = recur(s, t, a + 1, b + 1);
				}
			}
			
			dp[a][b] = max;
			return max;
		}
	}

}
