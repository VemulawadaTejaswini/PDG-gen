import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	class Pair {
		int x, y;
		char map[][];
		int d[][];
		Pair() {
			map = new char[h][w];
			d	= new int[h][w];
		}
		Pair(Pair pair) {
			map = new char[h][w];
			d	= new int[h][w];
			x = pair.x;
			y = pair.y;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = pair.map[i][j];
					d[i][j] = pair.d[i][j];
				}
			}
		}
	}
	
	final int MAX = Integer.MAX_VALUE;
	int w, h;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w == 0 && h == 0) break;

			Pair pair = new Pair();
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String str = scan.next();
					pair.d[i][j] = MAX;
					pair.map[i][j] = str.charAt(0);
					if (pair.map[i][j] == '2') {
						pair.y = i;
						pair.x = j;
						pair.d[i][j] = 0;
					}
				}
			}
			
			Queue<Pair> que = new ArrayDeque<Pair>();
			que.add(pair);
			while (!que.isEmpty()) {
				Pair p = que.poll();
				
				if (p.map[p.y][p.x] == '3') {
					System.out.println(p.d[p.y][p.x]);
					break;
				}
				
				if (p.d[p.y][p.x] >= 10) {
					if (que.isEmpty()) {
						System.out.println(-1);
						break;
					}
					continue;
				}
				
				int x, y;
				
				x = p.x;
				while (x + 1 < w && p.map[p.y][x + 1] != '1') x++;
				if (x != p.x && x + 1 < w && p.map[p.y][x + 1] == '1') {
					Pair p_copy = new Pair(p);
					p_copy.map[p.y][x + 1] = '0';
					p_copy.d[p.y][x] = p.d[p.y][p.x] + 1;
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				} else if (p.d[p.y][x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x] = p.d[p.y][p.x] + 1;
					p_copy.y = p.y;
					p_copy.x = x;
					que.add(p_copy);
				}
				
				x = p.x;
				while (x - 1 >= 0 && p.map[p.y][x - 1] != '1') x--;
				if (x != p.x && x - 1 >= 0 && p.map[p.y][x - 1] == '1') {
					Pair p_copy = new Pair(p);
					p_copy.map[p.y][x - 1] = '0';
					p_copy.d[p.y][x] = p.d[p.y][p.x] + 1;
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				} else if (p.d[p.y][x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[p.y][x] = p.d[p.y][p.x] + 1;
					p_copy.y = p.y; p_copy.x = x;
					que.add(p_copy);
				}

				y = p.y;
				while (y + 1 < h && p.map[y + 1][p.x] != '1') y++;
				if (y != p.y && y + 1 < h && p.map[y + 1][p.x] == '1') {
					Pair p_copy = new Pair(p);
					p_copy.map[y + 1][p.x] = '0';
					p_copy.d[y][p.x] = p.d[p.y][p.x] + 1;
					p_copy.y = y; p_copy.x = p.x;
					que.add(p_copy);
				} else if (p.d[y][p.x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[y][p.x] = p.d[p.y][p.x] + 1;
					p_copy.y = y;
					p_copy.x = p.x;
					que.add(p_copy);
				}
				
				y = p.y;
				while (y - 1 >= 0 && p.map[y - 1][p.x] != '1') y--;
				if (y != p.y && y - 1 >= 0 && p.map[y - 1][p.x] == '1') {
					Pair p_copy = new Pair(p);
					p_copy.map[y - 1][p.x] = '0';
					p_copy.d[y][p.x] = p.d[p.y][p.x] + 1;
					p_copy.y = y; p_copy.x = p.x;
					que.add(p_copy);
				} else if (p.d[y][p.x] == MAX) {
					Pair p_copy = new Pair(p);
					p_copy.d[y][p.x] = p.d[p.y][p.x] + 1;
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