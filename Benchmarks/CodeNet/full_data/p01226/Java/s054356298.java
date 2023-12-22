import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj2103/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aoj2103/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}



	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- >0) {
			solve();
			if (T > 0)
				System.out.println();
		}
	}

	int R, C;
	char[][] table;
	boolean isin(int r, int c) {
		return 0 <= r && r < R && 0 <= c && c < C;
	}
	boolean canmove(int r, int c) {
		return isin(r,c) && table[r][c] == '.';
	}

	void solve() {
		R = sc.nextInt();
		C = sc.nextInt();
		table = new char[R][C];

		for (int r = 0; r < R; r++) {
			table[r] = sc.next().toCharArray();
		}

		int x = -1, y = -1;
		for (int r = 0; r < R; r++)
			for (int c = 0; c < C; c++)
				if (table[r][c] == '^' || table[r][c] == 'v' || table[r][c] == '<' || table[r][c] == '>') {
					x = r;
					y = c;
				}


		String dirs = ">^<v";
		int[] dr = {0, -1, 0, 1};
		int[] dc = {1, 0, -1, 0};
		int M = sc.nextInt();
		char[] cmd = sc.next().toCharArray();
		for (int i = 0; i < cmd.length; i++) {
			if (cmd[i] == 'S') {
				int d = dirs.indexOf(table[x][y]);
				int tx = x + dr[d];
				int ty = y + dc[d];
				while (isin(tx, ty)) {
					if (table[tx][ty] == '*') {
						table[tx][ty] = '.';
						break;
					}
					if (table[tx][ty] == '#')
						break;
					tx += dr[d];
					ty += dc[d];
				}
			}
			if (cmd[i] == 'U') {
				table[x][y] = '^';
				if (canmove(x - 1, y)) {
					table[x][y] = '.';
					table[x-1][y] = '^';
					x--;
				}
			}
			if (cmd[i] == 'D') {
				table[x][y] = 'v';
				if (canmove(x + 1, y)) {
					table[x][y] = '.';
					table[x+1][y] = 'v';
					x++;
				}

			}
			if (cmd[i] == 'L') {
				table[x][y] = '<';
				if (canmove(x, y-1)) {
					table[x][y] = '.';
					table[x][y-1] = '<';
					y--;
				}

			}
			if (cmd[i] == 'R') {
				table[x][y] = '>';
				if (canmove(x, y+1)) {
					table[x][y] = '.';
					table[x][y+1] = '>';
					y++;
				}
			}
		}
		for (int i = 0; i < R; i++){
			for (int j = 0; j < C; j++)
				System.out.print(table[i][j]);
			System.out.println();
		}
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}