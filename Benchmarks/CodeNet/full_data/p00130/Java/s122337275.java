
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
 		for (int testcase = sc.nextInt(); testcase-->0;) {
			char[] s = sc.next().toCharArray();
			char[] ans = new char[1024];
			int p = 512, i = 0;
			ans[p] = s[i++];
			int minp = p, maxp = p;
			for (; i < s.length; i++) {
				if (s[i] == '-') p++; else p--;
				i += 2;
				ans[p] = s[i];
				minp = Math.min(minp, p);
				maxp = Math.max(maxp, p);
			}
			System.out.println(new String(Arrays.copyOfRange(ans, minp, maxp + 1)));
		}
	}
}