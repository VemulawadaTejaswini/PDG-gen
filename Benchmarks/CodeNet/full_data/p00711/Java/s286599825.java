import java.awt.Point;
import java.util.Scanner;

/**
 * 
 * AOJ - 1130 Red and Black
 * 
 * @author yuichirw
 *
 */
public class Main {

	static int w,h,sx,sy;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
	static String[] field;
	static boolean[][] visited;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		while(read()) {
			visited = new boolean[h][w];
			System.out.println(dfs(sx, sy));
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
	
	static int dfs(int x, int y) {
		if(!inField(x, y) || field[y].charAt(x) == '#' || visited[y][x] == true) {
			return 0;
		}
		
		visited[y][x] = true;
		int ret = 1;
		
		for(int i = 0; i < 4; i++) {
			ret += dfs(x + dx[i], y + dy[i]);
		}
		return ret;
	}
	
	static boolean inField(int x, int y) {
		if(x >= 0 && x < w && y >= 0 && y < h) {
			return true;
		} else {
			return false;
		}
	}
}