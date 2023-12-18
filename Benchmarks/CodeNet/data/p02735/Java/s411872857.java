
import java.util.Scanner;

public class Main {

	static int h,w;
	static char [][] grid;
	static int [][]ans;
	static int INF = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		
		grid = new char [h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		ans = new int [h][w];	
		if(grid[0][0] == '#') {
			ans[0][0]++;
			grid[0][0] = '.';
		}
		if(grid[h-1][w-1] == '#') {
			ans[0][0]++;
			grid[h-1][w-1] = '.';
		}
		
		for(int i = 0 ;i < h ; i++) {
			for(int j = 0 ; j < w ;j++) {
				if(!(i == 0 && j == 0)) {
					ans[i][j] = INF;
				}
			}
		}
		
		dfs(0,0);
		
		System.out.println(ans[h-1][w-1]);
		
		
	}
	
	static void dfs(int y , int x) {
		
		if(y == h-1 && x == w-1) {
		}
		
		int []dx = {0,1};
		int []dy = {1,0};
		
		for(int i = 0 ;i <= 1 ;i++) {
			int py = y + dy[i];
			int px = x + dx[i];
			if(!jdg(py,px)) {
				continue;
			}
			if(grid[py][px] == '#') {
				ans[py][px] = Math.min(ans[py][px], ans[y][x] + 1);
			}
			else {
				ans[py][px] = Math.min(ans[py][px], ans[y][x]);
			}
		//	System.out.println(py+" "+px + " "+ans[py][px]);
			dfs(py,px);
		}
	}
	
	static boolean jdg(int y, int x) {
		if(y < 0 || y >= h) {
			return false;
		}
		if(x < 0 || x >= w) {
			return false;
		}
		
		return true;
	}

}
