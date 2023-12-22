import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	int UNUSED = 1 << 60;

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
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
					p[table[i][j] - 'A'].add(new Coordinate(j, i));
				}
			}
			System.out.println(rec(0, 0, table, W - 1, H - 1));
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

	int rec(int curX, int curY, char[][] table, int toX, int toY) {
		if (table[curY][curX] == '#' || toY < curY || toX < curX)
			return -1;
		if (curY == toY && curX == toX) {
			return 0;
		}
		if (memo[curY][curX][curY][curX] != UNUSED) {
			return memo[curX][curX][curY][curX];
		}
		int ret = 0;
		for (int i = 0; i < 2; i++) {
			ret = Math.max(ret, rec(curX + i, curY + i ^ 1, table, toX, toY));
		}
		if (isLowerCase(table[curY][curX])) {
			for (Coordinate P : p[String.valueOf(table[curY][curX]).toUpperCase().charAt(0)]) {
				if ((P.x == curX && P.y == curY + 1) || (P.y == curY && P.x == curX + 1)) {
					ret = Math.max(ret, rec(P.x, P.y, table, toX, toY) + 1);
				} else {
					for (int i = 0; i < 2; i++) {
						for (int j = 0; j < 2; j++) {
							ret = Math.max(ret, rec(P.x + i, P.y + i ^ 1, table, toX - i, toY - i ^ 1));
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