import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		char[][] map = new char[M][];
		for (int i = 0; i < map.length; i++) {
			map[i] = sc.next().toCharArray();
		}
		sc.close();

		int point = 0;
		while (true) {
			int begin = point;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] != '.') {
						continue;
					}
					PriorityQueue<Tile> tiles = new PriorityQueue<Tile>();

					for (int k = 0; k < dir.length; k++) {
						int l = 1;
						int ti = i + dir[k][0] * l;
						int tj = j + dir[k][1] * l;
						while (ti >= 0 && ti < M && tj >= 0 && tj < N) {
							if (map[ti][tj] != '.') {
								char c = map[ti][tj];
								tiles.add(new Tile(ti, tj, c));
								break;
							}
							l++;
							ti = i + dir[k][0] * l;
							tj = j + dir[k][1] * l;
						}
					}

					while (tiles.size() > 1) {
						Tile t1 = tiles.poll();
						Tile t2 = tiles.poll();
						if (t1.color != t2.color) {
							tiles.add(t2);
							continue;
						}

						map[t1.i][t1.j] = '.';
						map[t2.i][t2.j] = '.';
						point++;
					}
				}
			}

			if (point == begin) {
				break;
			}
		}

		System.out.println(point * 2);

	}
}

class Tile implements Comparable<Tile> {
	int i, j;
	char color;

	public Tile(int i, int j, char color) {
		this.i = i;
		this.j = j;
		this.color = color;
	}

	public int compareTo(Tile o) {
		return this.color - o.color;
	}
}