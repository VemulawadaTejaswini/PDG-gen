import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	class Pair {
		int x, y;
		char d[][];
		Pair() {
			d	= new char[h][w];
		}
		Pair(Pair pair) {
			d	= new char[h][w];
			x = pair.x;
			y = pair.y;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					d[i][j] = pair.d[i][j];
				}
			}
		}
	}
	
	final int MAX = 0xFFFF;
	final int VAL_1 = 0xFFFE;
	int w, h;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) break;

			Pair pair = new Pair();
			
			int gy = 0, gx = 0;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String str = scan.next();
					pair.d[i][j] = MAX;
					if (str.charAt(0) == '1') {
						pair.d[i][j] = VAL_1;
					} else if (str.charAt(0) == '2') {
						pair.y = i;
						pair.x = j;
						pair.d[i][j] = 0;
					} else if (str.charAt(0) == '3') {
						gy = i;
						gx = j;
					}
				}
			}
			
			Queue<Pair> que = new ArrayDeque<Pair>();
			que.add(pair);
			while (!que.isEmpty()) {
				Pair p = que.poll();
				
				if (p.y == gy && p.x == gx) {
					System.out.println((int)(p.d[p.y][p.x]));
					break;
				}
				
				if (p.d[p.y][p.x] == 10) {
					if (que.isEmpty()) {
						System.out.println(-1);
						break;
					}
					continue;
				}
				
				int x, y;
				
				x = p.x;
				while (x + 1 < w && p.d[p.y][x + 1] != VAL_1) x++;
				if (x != p.x && x + 1 < w && p.d[p.y][x + 1] == VAL_1) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x + 1] = 0;
					p_copy.d[p.y][x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				} else if (p.d[p.y][x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = p.y;
					p_copy.x = x;
					que.add(p_copy);
				}

				x = p.x;
				while (x - 1 >= 0 && p.d[p.y][x - 1] != VAL_1) x--;
				if (x != p.x && x - 1 >= 0 && p.d[p.y][x - 1] == VAL_1) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x - 1] = 0;
					p_copy.d[p.y][x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				} else if (p.d[p.y][x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				}

				y = p.y;
				while (y + 1 < h && p.d[y + 1][p.x] != VAL_1) y++;
				if (y != p.y && y + 1 < h && p.d[y + 1][p.x] == VAL_1) {
					Pair p_copy = new Pair(p);
					p_copy.d[y + 1][p.x] = 0;
					p_copy.d[y][p.x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = y; p_copy.x = p.x;
					que.add(p_copy);
				} else if (p.d[y][p.x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[y][p.x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = y;
					p_copy.x = p.x;
					que.add(p_copy);
				}
				
				y = p.y;
				while (y - 1 >= 0 && p.d[y - 1][p.x] != VAL_1) y--;
				if (y != p.y && y - 1 >= 0 && p.d[y - 1][p.x] == VAL_1) {
					Pair p_copy = new Pair(p);
					p_copy.d[y - 1][p.x] = 0;
					p_copy.d[y][p.x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = y; p_copy.x = p.x;
					que.add(p_copy);
				} else if (p.d[y][p.x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[y][p.x] = (char)(p.d[p.y][p.x] + 1);
					p_copy.y = y; p_copy.x = p.x;
					que.add(p_copy);
				}

				if (que.isEmpty()) {
					System.out.println(-1);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}