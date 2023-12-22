
import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
			int C = sc.nextInt();
			int R = sc.nextInt();
			if (R == 0) break;
			int[][] a = new int[R][C];
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					char c = sc.next().charAt(0);
					a[i][j] = "RGB".indexOf(c);
				}
			}
			
			int res = 0;
			for (;;) {
				boolean change = false;
				loop:
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (a[0][0] != a[i][j]) {
							fill(a, 0, 0, a[0][0], a[i][j]);
							res++;
							change = true;
							break loop;
						}
					}
				}
				if (!change) break;
			}
			System.out.println(res);
		}
	}
		
	void fill(int[][] a, int r, int c, int base, int v) {
		if (0 <= r && r < a.length && 0 <= c && c < a[0].length) {
			if (a[r][c] == base) {
				a[r][c] = v;
				fill(a, r + 1, c, base, v);
				fill(a, r - 1, c, base, v);
				fill(a, r, c + 1, base, v);
				fill(a, r, c - 1, base, v);
			}
		}
	}
}