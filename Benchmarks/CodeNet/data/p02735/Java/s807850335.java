import java.util.*;

final class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

final class Cost implements Comparable<Cost> {
	Point vertex;
	int cost;

	Cost(Point vertex, int cost) {
		this.vertex = vertex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Cost o) {
		return Comparator.comparingInt((Cost c) -> c.cost).compare(this, o);
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();
	private int H;
	private int W;
	private BitSet[] table;

	void solve(Scanner sc) {
		this.H = sc.nextInt();
		this.W = sc.nextInt();
		table = new BitSet[H];
		for (int i = 0; i < H; i++) {
			BitSet bits = table[i] = new BitSet(W);
			String S = sc.next();
			char[] chars = S.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				bits.set(j, chars[j] == '.');
			}
		}
		System.out.println(dijkstra() + (table[0].get(0) ? 0 : 1));
	}

	int dijkstra() {
		int[][] cost = new int[H][W];
		int[] infs = new int[W];
		Arrays.fill(infs, Integer.MAX_VALUE);
		for (int[] ints : cost) {
			System.arraycopy(infs, 0, ints, 0, W);
		}

		PriorityQueue<Cost> costs = new PriorityQueue<>();
		costs.add(new Cost(new Point(0, 0), 0));

		while (!costs.isEmpty()) {
			Cost c = costs.remove();
			if (c.cost > cost[c.vertex.y][c.vertex.x]) continue;
			boolean from = table[c.vertex.y].get(c.vertex.x);
			down: {
				if (c.vertex.y == H - 1) {
					break down;
				}
				int u = c.cost + (!table[c.vertex.y + 1].get(c.vertex.x) && from ? 1 : 0);
				if (cost[c.vertex.y + 1][c.vertex.x] > u) {
					cost[c.vertex.y + 1][c.vertex.x] = u;
					costs.add(new Cost(new Point(c.vertex.x, c.vertex.y + 1), u));
				}
			}
			right: {
				if (c.vertex.x == W - 1) {
					break right;
				}
				int r = c.cost + (!table[c.vertex.y].get(c.vertex.x + 1) && from ? 1 : 0);
				if (cost[c.vertex.y][c.vertex.x + 1] > r) {
					cost[c.vertex.y][c.vertex.x + 1] = r;
					costs.add(new Cost(new Point(c.vertex.x + 1, c.vertex.y), r));
				}
			}

		}
		return cost[H - 1][W - 1];
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}