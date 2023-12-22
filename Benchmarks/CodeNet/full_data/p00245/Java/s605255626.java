
import java.util.BitSet;
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
			int[][] map = new int[h][w];
			int sy = -1;
			int sx = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					char now = scanner.next().charAt(0);
					if (now == 'P') {
						sy = i;
						sx = j;
						map[i][j] = -1;
					} else if (now == '.')
						map[i][j] = -1;
					else
						map[i][j] = Character.getNumericValue(now);
				}
			}
			int n = scanner.nextInt();
			int maxT = 0;
			Goods[] goods = new Goods[n];
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				int c = scanner.nextInt();
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				goods[num] = new Goods(c, start, end);
				maxT = Math.max(maxT, end);
			}
			PriorityQueue<State> deque = new PriorityQueue<State>();
			deque.offer(new State(sy, sx, 0, 0, new BitSet()));
			boolean[][][][] b = new boolean[maxT + 1][1 << n][h][w];
			int ans = 0;
			while (!deque.isEmpty()) {
				State state = deque.poll();
				ans = Math.max(ans, state.value);
				int y = state.y;
				int x = state.x;
				if (state.step == maxT)
					continue;
				if (state.bitSet.cardinality() == n)
					break;
				for (int[] m : move) {
					int ny = m[0] + y;
					int nx = m[1] + x;
					if (!isOK(ny, nx))
						continue;
					if (map[ny][nx] != -1)
						continue;
					int nextstep = state.step + 1;
					BitSet nextbit = (BitSet) state.bitSet.clone();
					int nextvalue = state.value;
					for (int[] mo : move) {
						int nny = mo[0] + ny;
						int nnx = mo[1] + nx;
						if (!isOK(nny, nnx))
							continue;
						if (map[nny][nnx] == -1)
							continue;
						int num = map[nny][nnx];
						if (goods[num].start <= nextstep
								&& nextstep < goods[num].end) {
							if (nextbit.get(num))
								continue;
							nextbit.set(num);
							;
							nextvalue += goods[num].c;
						}
					}
					int bit = 0;
					for (int i = 0; i < nextbit.length(); i++) {
						if (nextbit.get(i))
							bit |= (1 << i);
					}
					if (b[nextstep][bit][ny][nx])
						continue;
					b[nextstep][bit][ny][nx] = true;
					deque.offer(new State(ny, nx, nextstep, nextvalue, nextbit));

				}
			}
			System.out.println(ans);
		}
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int h, w;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class State implements Comparable<State> {
		int y, x, step, value;
		BitSet bitSet;

		public State(int y, int x, int step, int value, BitSet bitSet) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
			this.value = value;
			this.bitSet = bitSet;
		}

		@Override
		public String toString() {
			return "State [y=" + y + ", x=" + x + ", step=" + step + ", value="
					+ value + ", bitSet=" + bitSet + "]";
		}

		@Override
		public int compareTo(State o) {
			return o.value - this.value;
		}

	}

	class Goods {
		int c, start, end;

		public Goods(int c, int start, int end) {
			super();
			this.c = c;
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "Goods [c=" + c + ", start=" + start + ", end=" + end + "]";
		}

	}
}