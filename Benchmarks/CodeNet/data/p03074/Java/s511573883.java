import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while (true) {
			int n = in.nextInt();
			int k = in.nextInt();
			String s = in.next();
			System.out.println(solve(n, k, s));
			if (!TEST)
				break;
		}
		in.close();
	}

	private static int solve(int n, int k, String s) {
		int[] sv = new int[s.length()];
		int c = 1;
		int si = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1))
				sv[si++] = c;
			c++;
		}
		sv[si] = c;

		int ans = 0;
		if (s.charAt(0) == '0') {
			ans = sv[Math.min(k * 2 - 1, si)];
			for (int i = 0; i <= si; i += 2)
				ans = Math.max(ans, sv[Math.min(i + 2 * k + 1, si)] - sv[i]);
		} else {
			ans = sv[Math.min(k * 2, si)];
			for (int i = 1; i <= si; i += 2)
				ans = Math.max(ans, sv[Math.min(i + 2 * k + 1, si)] - sv[i]);
		}
		return ans;
	}
}
