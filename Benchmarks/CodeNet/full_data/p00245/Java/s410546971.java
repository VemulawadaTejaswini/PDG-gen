
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			char[][] data = new char[h][w];
			int sx = -1;
			int sy = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					data[i][j] = scanner.next().charAt(0);
					if (data[i][j] == 'P') {
						sy = i;
						sx = j;
						data[i][j] = '.';
					}
				}
			}
			int n = scanner.nextInt();
			int maxT = 0;
			Map<Integer, Goods> map = new HashMap<Integer, Main.Goods>();
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				int d = scanner.nextInt();
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				map.put(num, new Goods(i, d, start, end));
				maxT = Math.max(maxT, end);
			}

			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.offer(new State(sx, sy, 0, 0, 0));
			int ans = 0;
			int[][][] bits = new int[maxT + 1][h][w];
			while (!open.isEmpty()) {
				State now = open.poll();
				ans = Math.max(ans, now.value);
				if (now.step >= maxT)
					continue;
				if (now.bit == (1 << n) - 1)
					break;
				for (int i = 0; i < 4; i++) {
					int nx = now.x + vx[i];
					int ny = now.y + vy[i];
					if (!isOK(nx, ny))
						continue;
					if (data[ny][nx] != '.')
						continue;
					int nextstep = now.step + 1;
					int nextbit = now.bit;
					int nextvalue = now.value;

					for (int j = 0; j < 4; j++) {
						int nnx = nx + vx[j];
						int nny = ny + vy[j];
						if (!isOK(nnx, nny))
							continue;
						if (data[nny][nnx] != '.') {
							Goods g = map.get(data[nny][nnx] - '0');
							if (g.start <= nextstep && nextstep < g.end) {
								if ((nextbit & (1 << g.num)) > 0)
									continue;
								nextbit = nextbit | (1 << g.num);
								nextvalue += g.d;

							}
						}

					}
					if (nextbit != 0
							&& (bits[nextstep][ny][nx] | nextbit) == bits[nextstep][ny][nx])
						continue;
					bits[nextstep][ny][nx] = nextbit;
					open.offer(new State(nx, ny, nextstep, nextbit, nextvalue));
				}

			}
			System.out.println(ans);

		}
	}

	private boolean isOK(int x, int y) {
		if (0 <= x && x < w && 0 <= y && y < h)
			return true;
		return false;
	}

	int w, h;
	int[] vx = { 0, -1, 1, 0 };
	int[] vy = { -1, 0, 0, 1 };

	class State implements Comparable<State> {
		int x, y, step, bit, value;

		public State(int x, int y, int step, int bit, int value) {
			super();
			this.x = x;
			this.y = y;
			this.step = step;
			this.bit = bit;
			this.value = value;
		}

		@Override
		public String toString() {
			return "State [x=" + x + ", y=" + y + ", step=" + step + ", bit="
					+ bit + ", value=" + value + "]";
		}

		@Override
		public int compareTo(State o) {
			return o.value - this.value;
		}

	}

	class Goods {
		int num, d, start, end;

		public Goods(int num, int d, int start, int end) {
			super();
			this.num = num;
			this.d = d;
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "Goods [num=" + num + ", d=" + d + ", start=" + start
					+ ", end=" + end + "]";
		}

	}
}