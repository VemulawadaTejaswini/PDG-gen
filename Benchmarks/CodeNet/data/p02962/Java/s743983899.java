import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		s = s + s;
		while (s.length() < 2 * t.length()) {
			s = s + s;
		}
		int[] dp1 = Arrays.copyOfRange(zalgo(t + s), t.length(), t.length() + s.length());
		int n = s.length();
		int[] dp2 = new int[n];
		int ans = 0;
		for (int i = n - 1; i >= 0; --i) {
			dp2[i] = (i + t.length() < dp2.length ? dp2[i + t.length()] : 0) + (dp1[i] >= t.length() ? 1 : 0);
			ans = Math.max(ans, dp2[i]);
		}
		if (ans * t.length() >= n / 2) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

	int[] zalgo(String s) {
		int n = s.length();
		int[] ret = new int[n];
		ret[0] = n;
		int i = 1, j = 0;
		while (i < n) {
			while (i + j < n && s.charAt(j) == s.charAt(i + j))
				++j;
			ret[i] = j;
			if (j == 0) {
				++i;
				continue;
			}
			int k = 1;
			while (i + k < n && k + ret[k] < j) {
				ret[i + k] = ret[k];
				++k;
			}
			i += k;
			j -= k;
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}