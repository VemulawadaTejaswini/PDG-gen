import java.util.BitSet;
import java.util.Scanner;

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

		int[][] cost = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				boolean to = table[i].get(j);
				if (j == 0 && i == 0) {
					cost[i][j] = !to ? 1 : 0;
				} else if (j == 0) {
					cost[i][j] = cost[i - 1][j] + (!to && table[i - 1].get(j) ? 1 : 0);
				} else if (i == 0) {
					cost[i][j] = cost[i][j - 1] + (!to && table[i].get(j - 1) ? 1 : 0);
				} else {
					cost[i][j] = Math.min(cost[i - 1][j] + (!to && table[i - 1].get(j) ? 1 : 0),
							cost[i][j - 1] + (!to && table[i].get(j - 1) ? 1 : 0));
				}
			}
		}
		System.out.println(cost[H - 1][W - 1]);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}