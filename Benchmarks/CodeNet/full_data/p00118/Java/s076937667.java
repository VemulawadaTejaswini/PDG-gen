import java.util.*;
import static java.util.Arrays.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int w, h;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static char[][] field = new char[102][102];
	
	public static void main(String[] args) {
		for(int i = 0; i < 12; i++) 
			fill(field[i], ' ');
		while(read()) 
			System.out.println(solve());
		
	}
	
	static boolean read() {
		h = sc.nextInt(); w = sc.nextInt();
		if(h == 0)
			return false;
		
		for(int i = 1; i <= h; i++) {
			String line = sc.next();
			for(int j = 1; j <= w; j++) {
				field[i][j] = line.charAt(j - 1);
			}
		}
		return true;
	}
	
	static int solve() {
		int ret = 0;
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				if(field[i][j] != ' ') {
					ret++;
					rec(j, i, field[i][j]);
				}
			}
		}
		
		return ret;
	}
	
	static void rec(int x, int y, char c) {
		for(int k = 0; k < 4; k++) {
			int nx = x + dx[k], ny = y + dy[k];
			if(field[ny][nx] == c) {
				field[ny][nx] = ' ';
				rec(nx, ny, c);
			}
		}
	}
}