
import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		int t = sc.nextInt();
		for (int ttt = 0; ttt < t; ttt++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int[] a = solve(from, to);
			System.out.print(a[0]);
			for (int i = 1; i < a.length; i++) System.out.print(" " + a[i]);
			System.out.println();
		}
	}
	
	int[] solve(int from, int to) {
		int[] st = {
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 3, 2, 1,
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 3, 2, 1,};

		ArrayList<Integer> ans = null;
		for (int i = 0; i < st.length / 2; i++) {
			if (st[i] == from) {
				ArrayList<Integer> cur = new ArrayList<Integer>();
				int x = i;
				while (st[x] != to) {
					cur.add(st[x]);
					x++;
				}
				cur.add(to);
				if (ans == null || ans.size() > cur.size()) {
					ans = cur;
				}
			}
		}
		return toIntArray(ans);
	}
	public static <T> int[] toIntArray(Collection<T> src) {
		int[] res = new int[src.size()];
		int p = 0;
		for (T x : src) res[p++] = (Integer)x;
		return res;
	}
}