
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	char[][] map;
	char[] dir = {'<', '^', '>', 'v'};
	P player;
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int c=0;;c++) {
			h = sc.nextInt();
			w = sc.nextInt();
			map = new char[h+2][w+2];
			for(char[] a: map) fill(a, '#');
			
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) {
					map[i][j] = str.charAt(j-1);
					if(map[i][j] == '<' ) {
						map[i][j] = '.';
						player = new P(j, i, 0);
					}
					else if( map[i][j] == '>' ) {
						map[i][j] = '.';
						player = new P(j, i, 2);
					}
					else if( map[i][j] == '^' ) {
						map[i][j] = '.';
						player = new P(j, i, 1);
					}
					else if( map[i][j] == 'v' ) {
						map[i][j] = '.';
						player = new P(j, i, 3);
					}
				}
			}
			
			int n = sc.nextInt();
			String ops = sc.next();
			for(int op=0;op<n;op++) {
				int nx = player.x, ny = player.y;
				switch (ops.charAt(op)) {
				case 'S':
					for(int i=1;;i++) {
						int x = player.x+dx[player.d]*i;
						int y = player.y+dy[player.d]*i;
						if(map[y][x] == '*') {
							map[y][x] = '.';
							break;
						}
						if(map[y][x] == '#') break;
					}
					break;
				case 'L':
					nx = player.x + dx[0];
					ny = player.y + dy[0];
					player.d = 0;
					break;
				case 'U':
					nx = player.x + dx[1];
					ny = player.y + dy[1];
					player.d = 1;
					break;
				case 'R':
					nx = player.x + dx[2];
					ny = player.y + dy[2];
					player.d = 2;
					break;
				case 'D':
					nx = player.x + dx[3];
					ny = player.y + dy[3];
					player.d = 3;
					break;
				}
				if(map[ny][nx] != '*' && map[ny][nx] != '#' &&
				   map[ny][nx] != '-') {
					player.x = nx;
					player.y = ny;
				}
			}
			
			map[player.y][player.x] = dir[player.d];
			for(int i=1;i<=h;i++) {
				for(int j=1;j<=w;j++)
					System.out.print(map[i][j]);
				System.out.println();
			}
			if(c < t-1) System.out.println();
			else break;
		}
	}
	
	class P {
		int x, y, d;
		P(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}