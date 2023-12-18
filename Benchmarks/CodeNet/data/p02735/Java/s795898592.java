import java.util.BitSet;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();
	private int H;
	private int W;

	void solve(Scanner sc) {
		this.H = sc.nextInt();
		this.W = sc.nextInt();
		BitSet[] table = new BitSet[H];
		for (int i = 0; i < H; i++) {
			BitSet bits = table[i] = new BitSet(W);
			String S = sc.next();
			char[] chars = S.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				bits.set(j, chars[j] == '.');
			}
		}
		int dfs = dfs(table, 0, 0, true);
		System.out.println(dfs);
	}

	int dfs(BitSet[] table, int x, int y, boolean prev) {
		boolean current = table[y].get(x);
		if (x == W - 1 && y == H - 1) return !current && prev ? 1 : 0;
		int u = y == H - 1 ? Integer.MAX_VALUE : dfs(table, x, y + 1, current);
		int r = x == W - 1 ? Integer.MAX_VALUE : dfs(table, x + 1, y, current);
		return Math.min(u, r) + (!current && prev ? 1 : 0);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}