import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			if (H == 0) {
				sc.close();
				break;
			}
			int W = sc.nextInt();
			long L = sc.nextLong();
			int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };// 北、東、南、西
			char[][] maze = new char[H][];
			for (int i = 0; i < maze.length; i++) {
				maze[i] = sc.next().toCharArray();
			}

			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			int now = 0;
			int d = 0;// 向き N:0, E:1, S:2, W:3
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[i].length; j++) {
					if (maze[i][j] != '#' && maze[i][j] != '.') {
						now = i * 100 + j;
						if (maze[i][j] == 'N') {
							d = 0;
						} else if (maze[i][j] == 'E') {
							d = 1;
						} else if (maze[i][j] == 'S') {
							d = 2;
						} else if (maze[i][j] == 'W') {
							d = 3;
						}
						hashMap.put(now, d);
					}
				}
			}

			while (L > 0) {
				int x = now / 100;
				int y = now - x * 100;
				x += dir[d][0];
				y += dir[d][1];
				if (x < 0 || x >= H || y < 0 || y >= W || maze[x][y] == '#') {
					d = (d + 1) % 4;
					continue;
				}
				now = x * 100 + y;
				L--;
				if (hashMap.get(now) == null) {
					hashMap.put(now, d);
				} else if (hashMap.get(now) != d) {
					hashMap.clear();
					hashMap.put(now, d);
				} else {
					L = L % hashMap.size();
				}
			}

			int x = now / 100;
			int y = now - x * 100;
			char face = '.';
			if (d == 0) {
				face = 'N';
			} else if (d == 1) {
				face = 'E';
			} else if (d == 2) {
				face = 'S';
			} else if (d == 3) {
				face = 'W';
			}

			System.out.println((x + 1) + " " + (y + 1) + " " + face);
		}

	}
}