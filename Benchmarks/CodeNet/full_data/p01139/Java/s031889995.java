import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	boolean[][] check;
	boolean[][] checkall;
	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, -1, 0, 1};
	int w, h;
	int[][] map;
	
	int countb, countw;
	
	void calc(int n, int x, int y) {
		if (n == 1) countb++;
		else if (n == -1) countw++;
		for (int i = 0; i < 4; i++) {
			if (x+dx[i] >= 0 && x+dx[i] < h &&
				y+dy[i] >= 0 && y+dy[i] < w &&
				!checkall[x+dx[i]][y+dy[i]]) {
				if (map[x+dx[i]][y+dy[i]] == 0) {
					checkall[x+dx[i]][y+dy[i]] = true;
					calc(n, x+dx[i], y+dy[i]);
				}
			}
		}
	}
	
	
	boolean isB(int x, int y) {
		boolean flag = false;
		for (int i = 0; i < 4; i++) {
			if (x+dx[i] >= 0 && x+dx[i] < h &&
				y+dy[i] >= 0 && y+dy[i] < w &&
				!check[x+dx[i]][y+dy[i]]) {
				check[x+dx[i]][y+dy[i]] = true;
				if (map[x+dx[i]][y+dy[i]] == 1) return true;
				if (map[x+dx[i]][y+dy[i]] == 0) flag = flag || isB(x+dx[i], y+dy[i]);
			}
		}
		return flag;
	}
	
	boolean isW(int x, int y) {
		boolean flag = false;
		for (int i = 0; i < 4; i++) {
			if (x+dx[i] >= 0 && x+dx[i] < h &&
				y+dy[i] >= 0 && y+dy[i] < w &&
				!check[x+dx[i]][y+dy[i]]) {
				check[x+dx[i]][y+dy[i]] = true;
				if (map[x+dx[i]][y+dy[i]] == -1) return true;
				if (map[x+dx[i]][y+dy[i]] == 0) flag = flag || isW(x+dx[i], y+dy[i]);
			}
		}
		return flag;
	}
	
	void run() {
		while (true) {
			w = sc.nextInt(); h = sc.nextInt();
			sc.nextLine();
			if (w == 0) break;
			map = new int[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < w; j++) {
					if (s.charAt(j) == '.')
						map[i][j] = 0;
					else if (s.charAt(j) == 'B')
						map[i][j] = 1;
					else
						map[i][j] = -1;
				}
			}
			
			
			check = new boolean[h][w];
			checkall = new boolean[h][w];
			countb = countw = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++){
					if (!checkall[i][j] && map[i][j] == 0) {	
						boolean b, w;
						for (int k = 0; k < h; k++) Arrays.fill(check[k], false);
						check[i][j] = true;
						b = isB(i, j);
						for (int k = 0; k < h; k++) Arrays.fill(check[k], false);
						check[i][j] = true;
						w = isW(i, j);
						checkall[i][j] = true;
						if (b && !w) {
							calc(1, i, j);
						} else if (!b && w) {
							calc(-1, i, j);
						} else {
							calc(0, i, j);
						}
					}
				}
			}
			
			out.printf("%d %d\n", countb, countw);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}