import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String g;
	static String[] a, b;
	static final int INF = 999;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			a = new String[N];
			b = new String[N];
			for (int i = 0; i < N; ++i) {
				a[i] = sc.next();
				b[i] = sc.next();
			}
			String s = sc.next();
			g = sc.next();
			int ans = solve(s);
			System.out.println(ans == INF ? -1 : ans);
		}
	}

	static int solve(String cur) {
		if (cur.length() == g.length()) {
			return cur.equals(g) ? 0 : INF;
		}
		if (cur.length() > g.length()) return INF;
		int ret = INF;
		for (int i = 0; i < a.length; ++i) {
			StringBuilder sb = new StringBuilder();
			int pos = 0;
			boolean changed = false;
			while (true) {
				int next = cur.indexOf(a[i], pos);
				if (next == -1) {
					for (int j = pos; j < cur.length(); ++j) {
						sb.append(cur.charAt(j));
					}
					break;
				} else {
					for (int j = pos; j < next; ++j) {
						sb.append(cur.charAt(j));
					}
					sb.append(b[i]);
					pos = next + a[i].length();
					changed = true;
				}
			}
			if (changed) {
				ret = Math.min(ret, solve(sb.toString()) + 1);
			}
		}
		return ret;
	}
}