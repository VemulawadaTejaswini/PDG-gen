import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
		int[][] map = new int[h][w];
		boolean[][] reached = new boolean[h][w];
		int sx, sy;
		sx = sy = 0;
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				switch(s.charAt(j)) {
				case 'S':
					map[i][j] = 0;
					sx = i; sy = j;
					break;
				case '.':
					map[i][j] = 0;
					break;
				case 'X':
					map[i][j] = -1;
					break;
				default:
					map[i][j] = Integer.parseInt(""+s.charAt(j));
					break;
				}
			}
		}
		
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		Queue<Integer> count = new LinkedList<Integer>();
		int res = 0;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		I:for (int i = 1; i <= n; i++) {
			qx.add(sx);
			qy.add(sy);
			count.add(0);
			for (boolean[] r : reached)
				Arrays.fill(r, false);
			reached[sx][sy] = true;
			while (!qx.isEmpty()) {
				int x = qx.poll(), y = qy.poll(), c = count.poll();
				if (map[x][y] == i) {
					res += c;
					qx.removeAll(qx); qy.removeAll(qy); count.removeAll(count);
					sx = x; sy = y;
					continue I;
				}
				for (int j = 0; j < 4; j++) {
					int X = x + dx[j], Y = y + dy[j];
					if (X >= 0 && Y >= 0 && X < h && Y < w &&
							map[X][Y] >= 0 && !reached[X][Y]) {
						qx.add(X); qy.add(Y); count.add(c+1);
						reached[X][Y] = true;
					}
				}
			}
		}
		out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}