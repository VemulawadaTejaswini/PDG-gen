import java.util.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		BitSet[] table = new BitSet[H];
		for (int i = 0; i < H; i++) {
			BitSet bits = table[i] = new BitSet(W);
			String S = sc.next();
			char[] chars = S.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				bits.set(j, chars[j] == '.');
			}
		}

		Queue<Vector> waiting = new ArrayDeque<>();
		waiting.add(new Vector(0, 0));
		int[] ud = {0, 1};
		int[] lr = {1, 0};
		int[][] cost = new int[H][W];
		int[] infs = new int[W];
		Arrays.fill(infs, Integer.MAX_VALUE / 2);
		for (int[] ints : cost) {
			System.arraycopy(infs, 0, ints, 0, W);
		}
		cost[0][0] = 0;
		while (!waiting.isEmpty()) {
			Vector vector = waiting.remove();
			boolean white = table[vector.y].get(vector.x);
			for (int i = 0; i < 2; i++) {
				Vector next = new Vector(vector.x + lr[i], vector.y + ud[i]);
				if (next.x == W || next.y == H) continue;
				int temp = cost[vector.y][vector.x] + (white && !table[next.y].get(next.x) ? 1 : 0);
				cost[next.y][next.x] = Math.min(cost[next.y][next.x], temp);
				waiting.add(next);
			}
		}
		System.out.println(cost[H - 1][W - 1] + (table[0].get(0) ? 0 : 1));
	}
}

class Vector {
	int x;
	int y;

	Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}