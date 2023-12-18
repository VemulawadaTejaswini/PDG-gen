import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '.') {
					solve(i, j, map);
				}
			}
		}
		System.out.println(cnt);
	}

	private static void solve(int i, int j, char[][] map) {
		ArrayDeque<Pos> deque = new ArrayDeque<>();
		Pos pos = new Pos(i, j);
		deque.add(pos);
		int h = map.length;
		int w = map[0].length;
		boolean memo[][] = new boolean[h][w];
		memo[i][j] = true;
		int[] dh = { 1, -1, 0, 0 };
		int[] dw = { 0, 0, 1, -1 };
		int hh, ww;
		while (!deque.isEmpty()) {
			Pos tmp = deque.poll();
			for (int x = 0; x < 4; x++) {
				hh = dh[x] + tmp.h;
				ww = dw[x] + tmp.w;
				if (hh >= 0 && hh < h && ww >= 0 && ww < w) {
					if (map[tmp.h][tmp.w] == '.') {
						if (map[hh][ww] == '#' && !memo[hh][ww]) {
							memo[hh][ww] = true;
							deque.add(new Pos(hh, ww));
							cnt++;
						}
					} else if (map[tmp.h][tmp.w] == '#') {
						if (map[hh][ww] == '.' && !memo[hh][ww]) {
							memo[hh][ww] = true;
							deque.add(new Pos(hh, ww));
						}
					}
				}

			}
		}
	}
}

class Pos {
	int h;
	int w;

	public Pos(int h, int w) {
		this.h = h;
		this.w = w;
	}
}
