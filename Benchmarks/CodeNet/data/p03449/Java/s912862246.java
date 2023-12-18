import java.util.Scanner;

public class Main {

	static int max = -1;
	static int[][] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[2][n];
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		dfs(0, 0, a[0][0], n);
		System.out.println(max);
	}

	public static void dfs(int x, int y, int sum, int n) {
		if(x == 1 && y == n - 1) {
			max = Math.max(max, sum);
			return;
		}
		if(0 <= x + 1 && x + 1 < 2 && 0 <= y && y < n) {
			dfs(x + 1, y, sum + a[x + 1][y], n);
		}
		if(0 <= x && x < 2 && 0 <= y + 1 && y + 1 < n) {
			dfs(x, y + 1, sum + a[x][y + 1], n);
		}
	}

}
