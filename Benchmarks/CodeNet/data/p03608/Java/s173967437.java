import java.util.Scanner;

public class Main {

	static int ans = Integer.MAX_VALUE;
	static int[] u;
	static int[][] d;
	static int n, m, r;
	static boolean[] used = new boolean[9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt();
		u = new int[r];
		for(int i = 0; i < r; i++) u[i] = sc.nextInt() - 1;
		d = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) d[i][j] = Integer.MAX_VALUE / 10;
			}
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			d[a][b] = d[b][a] = c;
		}
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		dfs(0, "");
		System.out.println(ans);
	}

	static void dfs(int x, String s) {
		if(x == r) {
			int sum = 0;
			for(int i = 0; i < s.length() - 1; i++) {
				int from = Integer.valueOf(String.valueOf(s.charAt(i)));
				int to = Integer.valueOf(String.valueOf(s.charAt(i + 1)));
//				System.out.println(from + " " + to + " " + i + " " + s);
				sum += d[from][to];
			}
			ans = Math.min(sum, ans);
			return;
		}
		// 訪れたい場所を全列挙
		for(int i = 0; i < r; i++) {
			if(!used[i]) {
				used[i] = true;
				dfs(x + 1, s + String.valueOf(u[i]));
				used[i] = false;
			}
		}
	}

}