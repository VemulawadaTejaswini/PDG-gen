
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {
	public class pair implements Comparable<pair> {
		int wt;
		int val;
		double rat;

		pair(int a, int v) {
			wt = a;
			val = v;
			rat = v / wt;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return (int) (this.rat - o.rat);
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		int dp[][] = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j <= t.length(); j++) {
				if (j == 0 || i == 0) {

				} else {
					if (s.charAt(i - 1) == t.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}
					dp[i][j] = Math.max(dp[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
				}
			}

		}
		StringBuilder sb = new StringBuilder();
		int i = s.length();
		int j = t.length();
		while (i > 0 && j > 0) {
			if (s.charAt(i - 1) == t.charAt(j - 1)) {
				sb.append(s.charAt(i-1));
				i--;
				j--;
			} else if (dp[i][j] == dp[i - 1][j]) {
				i--;
			} else {
				j--;
			}
		}
		System.out.println(sb.reverse());

	}

}