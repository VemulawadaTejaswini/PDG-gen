import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	int UNUSED = 1 << 60;

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0)
				break;
			char[][] table = new char[H][W];
			memo = new int[H][W][H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					for (int k = 0; k < H; k++) {
						for (int l = 0; l < W; l++) {
							memo[i][j][k][l] = UNUSED;
						}
					}
				}
			}
			p = new ArrayList[58];
			for (int i = 0; i < 58; i++) {
				p[i] = new ArrayList<>();
			}
			for (int i = 0; i < H; i++) {
				table[i] = sc.next().toCharArray();
				for (int j = 0; j < W; j++) {
					if (table[i][j] == '.' || table[i][j] == '#')
						continue;
					p[table[i][j] - 'A'].add(new Coordinate(j, i));
				}
			}
			int d = rec(0, 0, table, W - 1, H - 1);
			System.out.println(d < 0 ? -1 : d);
		}
	}

	ArrayList<Coordinate>[] p;

	class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	int[][][][] memo;
	int H, W;

	int rec(int curX, int curY, char[][] table, int toX, int toY) {
		// System.out.println(curX + " " + curY + " " + toX + " " + toY + " " +
		// H + " " + W);
		if (curY < 0 || curX < 0 || curY >= H || curX >= W || toY < curY || toX < curX || table[curY][curX] == '#')
			return -(1 << 30);
		if (curY == toY && curX == toX) {
			return 0;
		}
		if (memo[curY][curX][toY][toX] != UNUSED) {
			return memo[curY][curX][toY][toX];
		}
		int ret = -(1 << 30);
		for (int i = 0; i < 2; i++) {
			ret = Math.max(ret, rec(curX + i, curY + (i ^ 1), table, toX, toY));
		}
		if (table[curY][curX] == '.')
			return ret;
		if (isLowerCase(table[curY][curX])) {
			for (Coordinate P : p[String.valueOf(table[curY][curX]).toUpperCase().charAt(0) - 'A']) {
				if (P.x < curX || P.y < curY)
					continue;
				if ((P.x == curX && P.y == curY + 1) || (P.y == curY && P.x == curX + 1)) {
					ret = Math.max(ret, rec(P.x, P.y, table, toX, toY) + 1);
				} else {
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							ret = Math.max(ret, rec(curX + i, curY + (i ^ 1), table, P.x - j, P.y - (j ^ 1))
									+ rec(P.x, P.y, table, toX, toY) + 1);
						}
					}
				}
			}
		}
		memo[curY][curX][toY][toX] = ret;
		return ret;
	}

	boolean isLowerCase(char c) {
		if (String.valueOf(c).toLowerCase().charAt(0) - c == 0) {
			return true;
		} else {
			return false;
		}
	}
}