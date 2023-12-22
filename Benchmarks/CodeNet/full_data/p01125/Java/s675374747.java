import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	static boolean solve() {
		int[][] map = new int[21][21];
		int all = 0;
		for (int i = 0; i < N; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[y][x] = 1;
			all++;
		}
		int r = 10;
		int c = 10;
		int collect = 0;
		int M = sc.nextInt();
		for (int i = 0; i < M; ++i) {
			int d = "NESW".indexOf(sc.next());
			int l = sc.nextInt();
			for (int j = 0; j < l; ++j) {
				r += DR[d];
				c += DC[d];
				collect += map[r][c];
				map[r][c] = 0;
			}
		}
		return collect == all;
	}

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			System.out.println(solve() ? "Yes" : "No");
		}
	}
}