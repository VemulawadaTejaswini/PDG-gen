import java.util.*;
import java.awt.Point;

public class Main {
	static int w,h,sx,sy;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
	static String[] field;
	static boolean[][] visited;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
	
	static boolean read() {
		w = sc.nextInt(); h = sc.nextInt();
		if(w == 0 && h == 0) {
			return false;
		}
		field = new String[h];
		
		for(int i = 0; i < h; i++) {
			field[i] = sc.next();
			int tmp = field[i].indexOf('@');
			if(tmp != -1) {
				sy = i; sx = tmp;
			}
		}
		return true;
	}
	
	static int solve() {
		visited = new boolean[h][w];
		Queue<Point> que = new LinkedList<Point>();
		Point s = new Point(sx, sy);
		
		que.add(s);
		visited[sy][sx] = true;
		int ans = 1;
		while(!que.isEmpty()) {
			Point p = que.poll();
			for(int i = 0; i < 4; i++) {
				Point next = new Point(p.x + dx[i], p.y + dy[i]);
				if(!inField(next) || field[next.y].charAt(next.x) == '#' || visited[next.y][next.x] == true) {
					continue;
				} else {
					que.add(next);
					visited[next.y][next.x] = true;
					ans++;
				}
			}
		}
		return ans;
	}
	
	static boolean inField(Point p) {
		if(p.x >= 0 && p.x < w && p.y >= 0 && p.y < h) {
			return true;
		} else {
			return false;
		}
	}
}