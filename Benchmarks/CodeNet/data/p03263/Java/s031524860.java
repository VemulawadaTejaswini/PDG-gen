import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] map = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[i][j] = sc.nextInt() % 2 == 1;
			}
		}
		ArrayList list = new ArrayList();
		// 一筆書き
		int cnt = 0;
		while (cnt < h * w) {
			int[] now = getPosition(cnt, w);
			if (map[now[1] - 1][now[0] - 1]) {
				int[] next = getPosition(cnt + 1, w);
				if (next[1] > h) {
					break;
				}
				list.add(now[1] + " " + now[0] + " " + next[1] + " " + next[0]);
				map[now[1] - 1][now[0] - 1] = !map[now[1] - 1][now[0] - 1];
				map[next[1] - 1][next[0] - 1] = !map[next[1] - 1][next[0] - 1];
			}
			cnt++;
		}
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	static int[] getPosition(
			int cnt,
			int w) {
		int y = cnt / w + 1;
		int x = (y % 2 == 0 ? w - cnt % w : cnt % w + 1);
		int[] xy = {
			x,
			y };
		return xy;
	}
}
