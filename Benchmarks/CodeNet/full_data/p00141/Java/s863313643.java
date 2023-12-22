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
	public void run() {
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			if (i > 0) System.out.println();
			solve(sc.nextInt());
		}
	}
	
	void solve(int n) {
		char[][] t = new char[n][n];
		for (int i = 0; i < n; i++) Arrays.fill(t[i], '.');
		
		int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		
		int r = n - 1;
		int c = 0;
		
		t[r][c] = '#';
		int d = 0;
		int miss = 0;
		for (; miss < 4;) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			int nnr = r + 2 * dr[d];
			int nnc = c + 2 * dc[d];
			if (isin(nr, nc, n) &&
				t[nr][nc] != '#' && 
				(!isin(nnr, nnc, n) || t[nnr][nnc] != '#') &&
				t[nr + dr[(d+1)&3]][nc+dc[(d+1)&3]] != '#' ) {
				r = nr;
				c = nc;
				t[r][c] = '#';
				miss = 0;
			} else {
				d = (d + 1) & 3;
				miss++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(new String(t[i]));
		}
		
	}
	boolean isin(int r, int c, int n) {
		return 0 <= r && r < n && 0 <= c && c < n;
	}
}