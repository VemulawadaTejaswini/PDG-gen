import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int m, n;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static int[][] field = new int[92][92];
	
	public static void main(String[] args) {
		for(int i = 0; i < field.length; i++) 
			fill(field[i], 0);
		
		while(read())
			System.out.println(solve());
	}
	
	static boolean read() {
		m = sc.nextInt(); n = sc.nextInt();
		if(m == 0)
			return false;
		
		for(int i = 1; i <= n; i++) 
			for(int j = 1; j <= m; j++) 
				field[i][j] = sc.nextInt();
		
		return true;
	}
	
	static int solve() {
		int ans = 0;
		for(int i = 1; i <= n; i++) 
			for(int j = 1; j <= m; j++)
				if(field[i][j] == 1)
					ans = max(ans, rec(j, i, 1));
			
		
		return ans;
	}
	
	static int rec(int x, int y, int step) {
		int ret = 0;
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i], ny = y + dy[i];
			if(field[ny][nx] == 1) {
				field[y][x] = 0;
				ret = max(ret, rec(nx, ny, step + 1));
				field[y][x] = 1;
			} else {
				ret = max(ret, step);
			}
		}
		return ret;
	}
}