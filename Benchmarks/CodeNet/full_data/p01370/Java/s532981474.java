import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 },
				{ -1, -1 } };
		while (true) {
			int t = nextInt();
			if (t == 0) {
				break;
			}

			int n = nextInt();
			int[][] xy = new int[n][2];
			for (int i = 0; i < n; i++) {
				xy[i][0] = nextInt();
				xy[i][1] = nextInt();
			}
			int sx = nextInt();
			int sy = nextInt();

			int[][] map = new int[121][121];
			for (int i = 0; i < n; i++) {
				int x = xy[i][0];
				int y = xy[i][1];
				map[x + 60][y + 60] = -1;// 障害物は負の数にしておく
			}

			Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
			int sum = 1;
			Integer[] start = { sx + 60, sy + 60 };
			deque.add(start);
			map[sx + 60][sy + 60] = 1;
			while (deque.size() > 0) {
				Integer[] poll = deque.poll();
				if (map[poll[0]][poll[1]] > t) {
					continue;
				}
				for (int i = 0; i < dir.length; i++) {
					if (poll[0] + dir[i][0] >= 0
							&& poll[1] + dir[i][1] >= 0
							&& map[poll[0] + dir[i][0]][poll[1] + dir[i][1]] == 0) {
						map[poll[0] + dir[i][0]][poll[1] + dir[i][1]] = map[poll[0]][poll[1]] + 1;
						Integer[] add = { poll[0] + dir[i][0],
								poll[1] + dir[i][1] };
						deque.add(add);
						sum++;
					}
				}
			}
			System.out.println(sum);

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}