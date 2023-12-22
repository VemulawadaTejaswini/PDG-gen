import java.util.*;
import java.math.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			if(m == 0 && n == 0) break;
			
			boolean[][] map = new boolean[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					map[i][j] = (sc.nextInt() == 1)?true:false;
				}
			}
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(!map[i][j]) continue;
					map[i][j] = false;
					max = Math.max(dfs(new Data(map,i,j,1)),max);
					map[i][j] = true;
				}
			}
			System.out.println(max);
		}
	}
	static int[] vx = new int[] {1,0,-1,0};
	static int[] vy = new int[] {0,1,0,-1};
	static int dfs(Data a) {
		Data tmp = a;
		int max = tmp.sum;
		for(int i = 0; i < 4; i++) {
			int ty = tmp.y + vy[i];
			int tx = tmp.x + vx[i];
			if(!rcheck(ty,tx,tmp.map.length,tmp.map[0].length) || !tmp.map[ty][tx]) continue;
			tmp.map[ty][tx] = false;
			max = Math.max(dfs(new Data(tmp.map,ty,tx,tmp.sum+1)),max);
			tmp.map[ty][tx] = true;
		}
		return max;
	}
	
	
	static boolean rcheck(int y, int x, int my, int mx) {
		if(y < 0 || x < 0 || y >= my || x >= mx) return false;
		return true;
	}
	
	
	static class Data {
		boolean[][] map;
		int y;
		int x;
		int sum;
		Data(boolean[][] a, int b, int c, int d) {
			map = a;
			y = b;
			x = c;
			sum = d;
		}
	}
	
}