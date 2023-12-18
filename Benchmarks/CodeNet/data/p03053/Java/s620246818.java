import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		solve(map);
	}

	private static void solve(char[][] map) {
		int cnt = 0;
		int dir[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		while (true) {

			int b = 0;
			char[][] tmp = new char[map.length][map[0].length];
			for (int i = 0; i < map.length; i++) {
				tmp[i] = Arrays.copyOf(map[i], map[i].length);
			}

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					if (map[i][j] == '#') {
						b++;
						for (int k = 0; k < 4; k++) {
							if (i + dir[k][0] >= 0 && i + dir[k][0] < map.length
									&& j + dir[k][1] >= 0 && j + dir[k][1] < map[0].length) {
								tmp[i + dir[k][0]][j + dir[k][1]] = '#';
							}
						}
					}
				}
			}

			if (b == map.length * map[0].length) {
				System.out.println(cnt);
				break;
			} else {
				cnt++;
			}

			for (int i = 0; i < map.length; i++) {
				map[i] = Arrays.copyOf(tmp[i], tmp.length);
			}

		}
	}
}