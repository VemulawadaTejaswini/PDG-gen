import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Repeated Subsequences
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("#END")) break;

			int maxLen = 0;
			String L = "";

			for (int i = 1; i < line.length(); i++) {
				//lcs
				String F = line.substring(0, i);
				String R = line.substring(i);

				//if (F.length() < maxLen || R.length() < maxLen) continue;

				int[][] dp = new int[F.length() + 1][R.length() + 1];
				for (int j = 0; j < F.length(); j++) {
					for (int k = 0; k < R.length(); k++) {
						if (F.charAt(j) == R.charAt(k)) {
							dp[j + 1][k + 1] += dp[j][k] + 1;
						} else {
							dp[j + 1][k + 1] = Math.max(dp[j][k + 1], dp[j + 1][k]);
						}
					}
				}
				//longest repeated?
				if (dp[F.length()][R.length()] > maxLen) {
					//
					String s = "";
					StringBuilder sb = new StringBuilder();
					for (int j = 1; j <= R.length(); j++) {
						if (dp[F.length()][j - 1] != dp[F.length()][j]) {
							sb.append(R.charAt(j - 1));
						}
					}
					s = sb.toString();
					//System.out.println(s);
					if (repeated(s)) {
						maxLen = dp[F.length()][R.length()];
						L = s;
					}
				}
			}
			System.out.println(L);
		} //end while
	} //end main

	static boolean repeated(String s) {

		outer:
		for (int i = 1; i <= s.length() / 2; i++) {
			String _s = s.substring(0, i);
			for (int j = i; j < s.length(); j += i) {
				if (!s.startsWith(_s, j)) {
					continue outer;
				}
				return true;
			}
		}
		return false;
	}
}