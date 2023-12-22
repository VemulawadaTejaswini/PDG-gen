
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int dfs(int zx, int zy, boolean map[][], int gx, int gy, int depth,String debug) {
		int[] ddx = { 1, 0, -1, 0 };
		int[] ddy = { 0, 1, 0, -1 };
		int ret = Integer.MAX_VALUE;
		if(depth == 11){
			return Integer.MAX_VALUE;
		}
		for (int i = 0; i < 4; i++) {
			int x = zx;
			int y = zy;
			int dx = ddx[i];
			int dy = ddy[i];
			boolean b = false;
			if(map[y+dy][x+dx]){
				continue;
			}
			for (; !map[y][x];) {
				x += dx;
				y += dy;
				if (x == gx && y == gy) {

					ret = depth;
					b = true;
					break;
				}
			}
			if (b) {
				continue;
			}
			if (y == 0 || y == map.length - 1) {
				continue;
			}
			if (x == 0 || x == map[0].length - 1) {
				continue;
			}
			map[y][x] = false;
			ret = Math.min(dfs(x- dx, y - dy, map, gx , gy, depth + 1 , debug+"["+dx+","+dy+"]"), ret);
			map[y][x] = true;
		}
		return ret;
	}

	void run() {
		/*
		 * 6 6 1 0 0 2 1 0 1 1 0 0 0 0 0 0 0 0 0 3 0 0 0 0 0 0 1 0 0 0 0 1 0 1 1
		 * 1 1 1
		 */
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h)==0){
				break;
				
			}
			boolean map[][] = new boolean[h + 2][w + 2];
			int start_x = 0;
			int start_y = 0;
			int goal_x = 0;
			int goal_y = 0;
			for (int i = 0; i < h + 2; i++) {
				Arrays.fill(map[i], true);
			}
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					int buf = sc.nextInt();
					map[i][j] = (buf == 1);
					if (buf == 2) {
						start_x = j;
						start_y = i;
					}
					if (buf == 3) {
						goal_x = j;
						goal_y = i;
					}
				}
			}
			String debug = "";
			int z = dfs(start_x, start_y, map, goal_x, goal_y, 1 ,debug);
			if (z == Integer.MAX_VALUE)
				z = -1;
			System.out.println(z);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}