import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	ArrayList<Integer>[] g;

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[][] ne = new int[s.length()][26];
		for (int i = 0; i < ne.length; ++i)
			for (int j = 0; j < 26; ++j)
				ne[i][j] = Integer.MAX_VALUE / 3;
		int n = s.length();
		for (int i = n - 1; i >= 0; --i) {
			for (int j = 0; j < 26; ++j) {
				if (i + 1 < n)
					ne[i][j] = Math.min(ne[i][j], ne[i + 1][j] + 1);
			}
			ne[i][s.charAt(i) - 'a'] = 0;
		}
		long cur = 0;
		for (int i = 0; i < t.length(); ++i) {
			if (ne[(int) (cur % n)][t.charAt(i) - 'a'] == Integer.MAX_VALUE / 3)
				cur = cur + (n - cur % n);
			if (ne[(int) (cur % n)][t.charAt(i) - 'a'] == Integer.MAX_VALUE / 3) {
				System.out.println(-1);
				return;
			}
			cur = cur + 1 + ne[(int) (cur % n)][t.charAt(i) - 'a'];
		}
		System.out.println(cur);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}