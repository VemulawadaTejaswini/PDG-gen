import java.util.Scanner;

public class Main {

	static int n;
	static int[][] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[2][n];
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int ans = dfs(0, 0);
		System.out.println(ans);
	}

	public static int dfs(int x, int y) {
		int ret = 0;
		if(x == 0 && y == 0) {
			ret += a[x][y];
		}
		if(x == 1 && y == n - 1) {
			ret = 0;
		}
		if(0 <= x + 1 && x + 1 < 2 && 0 <= y && y < n && 0 <= x && x < 2 && 0 <= y + 1 && y + 1 < n) {
			ret += Math.max(dfs(x + 1, y) + a[x + 1][y], dfs(x, y + 1) + a[x][y + 1]);
		} else if(0 <= x + 1 && x + 1 < 2 && 0 <= y && y < n) {
			ret += dfs(x + 1, y) + a[x + 1][y];
		} else if(0 <= x && x < 2 && 0 <= y + 1 && y + 1 < n) {
			ret += dfs(x, y + 1) + a[x][y + 1];
		} else {
			ret = 0;
		}
		return ret;
	}

}
