import java.util.*;

public class Main {
	static int w, h;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0)
				break;
			Queue<State> queue = new LinkedList<State>();
			int[][] field = new int[h][w];
			int sx = 0, sy = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					int n = sc.nextInt();
					if (n == 2) {
						field[i][j] = 0;
						sx = j;
						sy = i;
						continue;
					}
					field[i][j] = n;
				}
			queue.add(new State(0, field, sx, sy));
			int result = -1;
			while (!queue.isEmpty()) {
				State state = queue.poll();
				if (state.shot >= 10 || result != -1)
					break;
				result = shot(state, queue);
			}
			System.out.println(result);
		}
		sc.close();
	}

	static int shot(State state, Queue<State> queue) {
		int[][] tfield = state.field.clone();
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		for (int i = 0; i < 4; i++) {
			int sx = state.sx;
			int sy = state.sy;
			if (sx + dx[i] < w && sx + dx[i] >= 0 && sy + dy[i] < h
					&& sy + dy[i] >= 0 && tfield[sy + dy[i]][sx + dx[i]] != 1) {
				while (sx + dx[i] < w && sx + dx[i] >= 0 && sy + dy[i] < h
						&& sy + dy[i] >= 0
						&& tfield[sy + dy[i]][sx + dx[i]] == 0) {
					sx += dx[i];
					sy += dy[i];
				}
				if (sx + dx[i] < w && sx + dx[i] >= 0 && sy + dy[i] < h
						&& sy + dy[i] >= 0
						&& tfield[sy + dy[i]][sx + dx[i]] == 3)
					return state.shot + 1;
				if (sx + dx[i] < w && sx + dx[i] >= 0 && sy + dy[i] < h
						&& sy + dy[i] >= 0
						&& tfield[sy + dy[i]][sx + dx[i]] == 1) {
					tfield[sy + dy[i]][sx + dx[i]] = 0;
					queue.add(new State(state.shot + 1, tfield, sx, sy));
				}
			}
		}
		return -1;
	}
}

class State {
	int shot, sx, sy;
	int[][] field;

	State(int s, int[][] f, int x, int y) {
		shot = s;
		field = f.clone();
		sx = x;
		sy = y;
	}
}