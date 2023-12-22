
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0)
				break;
			char[][] map = new char[a][b];
			for (int i = 0; i < a; i++) {
				map[i] = scanner.next().toCharArray();
			}
			int count = 0;
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (map[i][j] != '-') {
						count++;
						solve(map[i][j], map, i, j);
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void solve(char c, char[][] map, int i, int j) {
		int[] x = { -1, 0, 0, 1 };
		int[] y = { 0, -1, 1, 0 };
		solve(c, map, x, y, i, j);
	}

	private static void solve(char c, char[][] map, int[] xp, int[] yp, int y,
			int x) {
		if (y < 0 || map.length <= y || x < 0 || map[0].length <= x
				|| map[y][x] != c) {
			return;
		}
		map[y][x] = '-';
		for (int i = 0; i < yp.length; i++) {
			int py = y + yp[i];
			int xy = x + xp[i];
			solve(c, map, xp, yp, py, xy);
		}
	}
}