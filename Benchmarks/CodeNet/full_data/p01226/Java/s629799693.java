import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 2103
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W, N;
	static char[][] cs = new char[22][22];
	static int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};
	public static void main(String[] args) {
		int TC = sc.nextInt();
		for (int tc = 0; tc < TC; tc++) {
			if (tc != 0) System.out.println();
			H = sc.nextInt(); W = sc.nextInt();
			int x = 0, y = 0, d = 0;
			for (int i = 0; i < 22; i++) fill(cs[i], '#');
			for (int i = 1; i <= H; i++) {
				String s = sc.next();
				for (int j = 1; j <= W; j++) {
					char c = s.charAt(j - 1);
					cs[i][j] = c;
					if (c == '<' || c == '^' || c == 'v' || c == '>') { 
						x = j; y = i;
						switch (c) {
						case '^':
							d = 0;
							break;
						case '>':
							d = 1;
							break;
						case 'v':
							d = 2;
							break;
						case '<' :
							d = 3;
						}
					}
				}
			}
			
			N = sc.nextInt();
			String op = sc.next();
			for (int i = 0; i < N; i++) {
				char c = op.charAt(i);
				if (c == 'S') {
					int nx = x, ny = y;
					while (true) {
						nx += dx[d];
						ny += dy[d];
						char cc = cs[ny][nx]; 
						if (cc == '#') {
							break;
						} else if (cc == '*') {
							cs[ny][nx] = '.';
							break;
						}
					}
				} else {
					switch (c) {
					case 'U':
						d = 0;
						cs[y][x] = '^';
						break;
					case 'R':
						d = 1;
						cs[y][x] = '>';
						break;
					case 'D':
						d = 2;
						cs[y][x] = 'v';
						break;
					case 'L':
						d = 3;
						cs[y][x] = '<';
						break;
					}
					
					int nx = x + dx[d], ny = y + dy[d];
					if (cs[ny][nx] == '.') {
						cs[ny][nx] = cs[y][x];
						cs[y][x] = '.';
						x = nx; 
						y = ny;
					}
				}
			}
			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					System.out.print(cs[i][j]);
				}
				System.out.println();
			}
		}
	}	
}