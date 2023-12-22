import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for(int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		boolean[][] al = new boolean[h][w];
		ArrayDeque<Data> queue = new ArrayDeque<Data>();
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(al[i][j]) continue;
				if(map[i][j] == '.') {
					al[i][j] = true;
					for(int k = 0; k < 8; k++) {
						int ty = i + vy[k];
						int tx = j + vx[k];
						if(ty < 0 || tx < 0 || ty >= h || tx >= w) continue;
						if(al[ty][tx]) continue;
						al[ty][tx] = true;
						if(map[ty][tx] != '.') {
							queue.add(new Data(ty,tx));
						}
					}
				}
			}
		}
		int cou = 0;
		while(!queue.isEmpty()) {
			cou++;
			boolean ok = false;
			ArrayDeque<Data> tmp = new ArrayDeque<Data>();
			ArrayDeque<Data> er  = new ArrayDeque<Data>();
			while(!queue.isEmpty()) {
				Data p = queue.poll();
				int count = 0;
				for(int i = 0; i < 8; i++) {
					int ty = p.y + vy[i];
					int tx = p.x + vx[i];
					if(ty < 0 || tx < 0 || ty >= h || tx >= w) continue;
					if(map[ty][tx] == '.') count++;
				}
				if(count >= map[p.y][p.x] - '0') {
					ok = true;
					er.add(p);
					for(int i = 0; i < 8; i++) {
						int ty = p.y + vy[i];
						int tx = p.x + vx[i];
						if(ty < 0 || tx < 0 || ty >= h || tx >= w) continue;
						if(map[ty][tx] != '.' && !al[ty][tx]) {
							al[ty][tx] = true;
							tmp.add(new Data(ty,tx));
						}
					}
				}
				else {
					tmp.add(p);
				}
			}
			while(!er.isEmpty()) {
				Data p = er.poll();
				map[p.y][p.x] = '.';
			}
			if(!ok) {
				cou-=1;
				break;
			}
			queue.addAll(tmp);
			tmp.clear();
		}
		
		System.out.println(cou);
		
		
		
		
	}
	static int[] vx = {-1,0,1,-1,0,1,-1,0,1};
	static int[] vy = {-1,-1,-1,0,0,0,1,1,1};
	
	static class Data {
		int y;
		int x;
		Data(int a, int b) {
			y = a;
			x = b;
		}
	}
	
}