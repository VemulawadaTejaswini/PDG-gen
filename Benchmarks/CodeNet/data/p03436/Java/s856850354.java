//幅優先探索　最短でいったぬる
//https://qiita.com/drken/items/996d80bcae64649a6580
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;
public class Main {
	static int maze[][] ; //短いものを入れておく
	static char c[][];
	static int H;
	static int N;
	static int W;
	static int sy;
	static int sx;
	static int gx;
	static int gy;
	static int dy[] = {0, 1, 0, -1};
	static int dx[] = {1, 0, -1, 0};
	static int box;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		
		box = 0;
		c = new char[H][W];
		gx = W-1;
		gy = H-1;
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = s.charAt(j);
				if(s.charAt(j)=='#') {
					
					box++;
				}
			}
		}
		if(BFS() == 0) {
			System.out.println(-1);
		}else {
			System.out.println(H*W - box - BFS()-1);
		}
	}
	
	public static int BFS() {
		int maze[][] = new int[H][W];
		Queue<Integer> queue_x = new ArrayDeque<>();
		Queue<Integer> queue_y = new ArrayDeque<>();
		
		queue_x.add(sx);
		queue_y.add(sy);
	
		int ans = 0;
		box = 0;
	
		while(queue_x.size() != 0 && queue_y.size() != 0) {
		//キューの先頭を取り出す。
			int x = queue_x.poll();
			int y = queue_y.poll();
			// a上下左右に移動した場合、どうなるか
			for (int k = 0; k < 4; k++) {
					int xx = x + dx[k];
					int yy = y + dy[k];
					
					if (xx >= 0 && xx < W && yy >= 0 && yy < H) {
								
						if (c[yy][xx]=='.' && maze[yy][xx] == 0) {
								maze[yy][xx] = maze[y][x] + 1;
								queue_x.add(xx);
								queue_y.add(yy);
						}
					}
			}
		}
		return maze[gy][gx];		
	
	}
}
	

	


