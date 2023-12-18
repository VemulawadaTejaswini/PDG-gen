import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem ThanhYeuThu = new Problem();
		ThanhYeuThu.solve();
	}
	static class Problem {
		public void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			String c[] = new String[n];
			for (int i = 0; i < n; i++) c[i] = sc.next();
			int DP[][] = new int[n][m];
			int module = (int)1e9 + 7;
			if (c[0].charAt(0) == '#') {
				System.out.print(0);
				System.exit(0);
			}
			DP[0][0] = 1;
			for (int i = 1; i < m; i++) {
				if (c[0].charAt(i) == '#') break;
				DP[0][i] = 1;
			}
			for (int i = 1; i < n; i++) {
				if (c[i].charAt(0) == '#') break;
				DP[i][0] = 1;
			}
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < m; j++) {
					if (c[i].charAt(j) == '#') {
						DP[i][j] = 0;
						continue;
					}
					DP[i][j] = DP[i - 1][j] + DP[i][j - 1];
					if (DP[i][j] >= module) DP[i][j] -= module;
				}
			}
			System.out.print(DP[n - 1][m - 1]);
		}
	}

}
