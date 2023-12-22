import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), M = sc.nextInt();

		int[][] grid = new int[N+2][N+2];

		// 右下の配置
		for (int i = 0 ; i < M ; i++) {
			int a = sc.nextInt(), b= sc.nextInt(), x = sc.nextInt();
			if (grid[a+x][b] < x+1) grid[a+x][b] = x+1;
		}

		// 上方向への展開
		for (int x = N ; x > 0 ; x--) {
			for (int y = 1 ; y <= x ; y++) {
				grid[x][y] = Math.max(grid[x][y], grid[x][y-1]-1);
			}
		}

		// 左方向への展開
		long count = 0;
		for (int y = 1 ; y <= N ; y++) {
			for (int x = N-1 ; x >= y ; x--) {
				if (grid[x+1][y] != 0) { // 右隣がゼロではない
					grid[x][y] = Math.max(grid[x][y], grid[x+1][y]-1);
					count++;
				}
			}
		}

		/*for (int y = N ; y > 0 ; y--) {
			for (int x = 1 ; x <= N ; x++) {
				System.out.print(grid[x][y]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");*/

		System.out.println(count);

	}
}