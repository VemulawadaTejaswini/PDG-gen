
import java.util.*;
import static java.lang.System.*;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(in);
	int h, w, c;
	int[] order = new int[5];
	int max;
	int[][] p;
	int[][] q;
	
	int calc() {
		int ans = 0;
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		int x, y;
		boolean[][] check = new boolean[h][w]; 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < h; j++)
				Arrays.fill(check[j], false);
			qx.add(0); qy.add(0);
			check[0][0] = true;
			int color = q[0][0];
			while(!qx.isEmpty()) {
				x = qx.poll();
				y = qy.poll();
				q[x][y] = order[i];
				for (int j = 0; j < 4; j++) {
					if (x+dx[j] >= 0 &&
						x+dx[j] < h &&
						y+dy[j] >= 0 &&
						y+dy[j] < w &&
						!check[x+dx[j]][y+dy[j]] &&
						q[x+dx[j]][y+dy[j]] == color) {
						check[x+dx[j]][y+dy[j]] = true;
						qx.add(x+dx[j]);
						qy.add(y+dy[j]);
					}
				}
			}
		}
		
		for (int j = 0; j < h; j++)
			Arrays.fill(check[j], false);
		qx.add(0); qy.add(0);
		check[0][0] = true;
		while(!qx.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			ans++;
			for (int j = 0; j < 4; j++) {
				if (x+dx[j] >= 0 &&
					x+dx[j] < h &&
					y+dy[j] >= 0 &&
					y+dy[j] < w &&
					!check[x+dx[j]][y+dy[j]] &&
					q[x+dx[j]][y+dy[j]] == order[4]) {
					check[x+dx[j]][y+dy[j]] = true;
					qx.add(x+dx[j]);
					qy.add(y+dy[j]);
				}
			}
		}
		return ans;
	}
	
	void copy() {
		for (int i = 0; i < h; i++)
			 for (int j = 0; j < w; j++)
				 q[i][j] = p[i][j];
			
	}
	
	void recursion(int d) {
		 if (d == 4) {
			 copy();
			 max = Math.max(calc(), max);
		 } else {
			 for (int i = 1; i <= 6; i++) {
				 order[d] = i;
				 recursion(d+1);
			 }
		 }
		
	}
	
	void run() {
		while(true) {
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			if (h == 0 && w == 0 && c == 0)
				break;
			p = new int[h][w];
			q = new int[h][w];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					p[i][j] = sc.nextInt();
			
			max = 0;
			order[4] = c;
			recursion(0);
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}