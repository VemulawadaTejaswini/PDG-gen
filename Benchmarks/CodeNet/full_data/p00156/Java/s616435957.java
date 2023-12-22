import java.io.*;
import java.util.*;
public class Main {
	static int n;
	static int m;
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 && m == 0) break;
			map = new char[m][];
			for(int i = 0; i < m; i++) {
				map[i] = sc.next().toCharArray();
			}
			int gx = 0;
			int gy = 0;
			IN:for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(map[i][j] == '&') {
						gx = j;
						gy = i;
						break IN;
					}
				}
			}
			
			solv(gy,gx);
			
			int min = Integer.MAX_VALUE;
			
			for(int j = 0; j < n; j++) {
					min = Math.min(costMap[0][j], min);
					min = Math.min(costMap[m-1][j], min);
			}
			for(int j = 0; j < m; j++) {
				min = Math.min(costMap[j][0], min);
				min = Math.min(costMap[j][n-1], min);
			}
			System.out.println(min);
			
		}
	}
	
	static class Data {
		int x;
		int y;
		int c;
		
		Data(int d, int e, int f) {
			y = d;
			x = e;
			c = f;
		}
	}
	
	static int[] vx = new int[] {1,0,-1,0};
	static int[] vy = new int[] {0,1,0,-1};
	static ArrayDeque<Data> queue = new ArrayDeque<Data>();
	static int[][] costMap = new int[m][n];
	
	
	static void solv(int gy, int gx) {
		costMap = new int[m][n];
		costMap[gy][gx] = 0;
		
		for(int i = 0; i < m; i++) {
			Arrays.fill(costMap[i], 2 << 27);
		}
		queue.addLast(new Data(gy,gx,0));
		while(!queue.isEmpty()) {
			BFS(queue.pollFirst());
		}
	}
	
	static void BFS(Data a) {
		if(!rangeCheck(a.y,a.x)) return;
		if(costMap[a.y][a.x] <= a.c) return;
		costMap[a.y][a.x] = a.c;
		for(int i = 0; i < 4; i++) {
			if(!rangeCheck(a.y+ vy[i],a.x+ vx[i])) continue;
			if(map[a.y][a.x] == '.' && map[a.y + vy[i]][a.x + vx[i]] == '#') {
				queue.addLast(new Data(a.y + vy[i],a.x + vx[i], a.c+1));
			}
			else {
				queue.addLast(new Data(a.y + vy[i],a.x + vx[i], a.c));
			}
		}
	}
	
	static boolean rangeCheck(int a, int b) {
		if(a < 0 || b < 0 || a >= m || b >= n) return false;
		return true;
	}
	
		
}