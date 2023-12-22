import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[][] map;
	static int[] DY = new int[] { 1, 0, -1, 0 };
	static int[] DX = new int[] { 0, 1, 0, -1 };

	public static void main(String[] args) {
		while (true) {
			int W = sc.nextInt();
			if (W == 0) break;
			int H = sc.nextInt();
			map = new int[H + 2][W + 2];
			int sx = 0;
			int sy = 0;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					int s = sc.nextInt();
					if (s == 2) {
						sx = j + 1;
						sy = i + 1;
						s = 1;
					}
					map[i + 1][j + 1] = s;
				}
			}
			boolean[][][] visited = new boolean[H + 2][W + 2][7];
			ArrayList<State> cur = new ArrayList<State>();
			cur.add(new State(sx, sy, 6));
			visited[sy][sx][6] = true;
			int ans = -1;
			int t = 1;
			BFS: while (!cur.isEmpty()) {
				ArrayList<State> next = new ArrayList<State>();
				for (State st : cur) {
					if (st.h <= 1) continue;
					for (int i = 0; i < 4; ++i) {
						int nx = st.x + DX[i];
						int ny = st.y + DY[i];
						if (map[ny][nx] == 3) {
							ans = t;
							break BFS;
						}
						if (map[ny][nx] == 0) continue;
						int nh = (map[ny][nx] == 4 ? 6 : st.h - 1);
						if (visited[ny][nx][nh]) continue;
						visited[ny][nx][nh] = true;
						next.add(new State(nx, ny, nh));
					}
				}
				cur = next;
				++t;
			}
			System.out.println(ans);
		}
	}

	static class State {
		int x, y, h;

		State(int x, int y, int h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}
	}

}