import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		boolean[][] memo = new boolean[h][w];
		ArrayDeque<Pos> deque = new ArrayDeque<>();
		int ans = 0;
		int bcnt, wcnt;
		int[] dh = { 1, -1, 0, 0 };
		int[] dw = { 0, 0, 1, -1 };
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!memo[i][j]) {
					memo[i][j] = true;
					deque.add(new Pos(i, j));
					bcnt = 0;
					wcnt = 0;
					if (map[i][j] == '.') {
						wcnt++;
					} else {
						bcnt++;
					}
					while (!deque.isEmpty()) {
						Pos pos = deque.poll();
						for (int k = 0; k < 4; k++) {
							int hh = dh[k] + pos.h;
							int ww = dw[k] + pos.w;
							if (hh >= 0 && hh < h && ww >= 0 && ww < w
									&& map[pos.h][pos.w] != map[hh][ww] && !memo[hh][ww]) {
								memo[hh][ww] = true;
								if (map[hh][ww] == '.') {
									wcnt++;
								} else {
									bcnt++;
								}
								deque.add(new Pos(hh, ww));
							}
						}
					}
					ans += wcnt * bcnt;
				}
			}
		}
		System.out.println(ans);
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
