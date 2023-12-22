
import static java.util.Arrays.deepToString;

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
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			boolean[][] t = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					t[i][j] = s.charAt(j) == '1';
				}
			}
			int ans = 0;
			ans = Math.max(ans, countRow(t));
			ans = Math.max(ans, countSkew(t));
			t = rot90(t);
			ans = Math.max(ans, countRow(t));
			ans = Math.max(ans, countSkew(t));
			System.out.println(ans);
		}
	}
	
	int countRow(boolean[][] t) {
		int n = t.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			int here = 0;
			for (int j = 0; j < n; j++) {
				if (t[i][j]) {
					here++;
					res = Math.max(res, here);
				} else {
					here = 0;
				}
			}
		}
		return res;
	}
	int countSkew(boolean[][] t) {
		int n = t.length;
		int res = 0;
		for (int s = -(n-1); s <= (n-1); s++) {
			int i = -Math.min(-s, 0);
			int j = -Math.min(s, 0);
			int here = 0;
			while (0 <= i && i < n && 0 <= j && j < n) {
				if (t[i][j]) {
					here++;
					res = Math.max(res, here);
				} else {
					here = 0;
				}
				
				i++;
				j++;
			}
		}
		return res;
	}
	boolean[][] rot90(boolean[][] t) {
		int n = t.length;
		boolean[][] v = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) 
				v[i][j] = t[j][n - 1 - i]; 
		}
		return v;
	}
}