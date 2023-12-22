
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if (w == 0 && h == 0)
				break;
			char[][] map = new char[h + 2][w + 2];
			int gx = -1;
			int gy = -1;
			for (char[] m : map) {
				Arrays.fill(m, '.');
			}
			for (int i = 1; i <= h; i++) {
				char[] c = scanner.next().toCharArray();
				for (int j = 1; j <= w; j++) {
					map[i][j] = c[j - 1];
					if (c[j - 1] == '&') {
						gx = j;
						gy = i;
					}
				}
			}

			int[][] cnt = new int[h + 2][w + 2];
			for (int[] c : cnt) {
				Arrays.fill(c, 1 << 24);
			}
			int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
			Deque<int[]> deque = new ArrayDeque<int[]>();
			deque.offer(new int[] { 0, 0 });
			cnt[0][0] = 0;
			while (!deque.isEmpty()) {
				int[] d = deque.poll();
				int dy = d[0];
				int dx = d[1];
				for (int[] xy : dxy) {
					int py = xy[0] + dy;
					int px = xy[1] + dx;
					int r;
					if (0 <= py && py < h + 2 && 0 <= px && px < w + 2) {
						if (map[dy][dx] == '#' && map[py][px] != '#') {
							r = 1;
						} else {
							r = 0;
						}
						if (cnt[py][px] > cnt[dy][dx] + r) {
							deque.offer(new int[] { py, px });
							cnt[py][px] = cnt[dy][dx] + r;
						}
					}
				}
			}
			System.out.println(cnt[gy][gx]);
		}
	}
}