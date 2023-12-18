
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static int sx, sy, gx, gy, h, w;
	static int[][] d;

	// 4 近傍
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};

	static char[][] maze;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		h = in.nextInt();
		w = in.nextInt();

		// d[y][x] := (sx,sy) から (x,y) までの最短距離
		d = new int[h][w];

		// 迷路を表す文字列の配列
		maze = new char[h][w];
		for (int i = 0; i < h; i++) {
			maze[i] = in.next().toCharArray();
		}

		int countw = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (maze[i][j] == '#') {
					countw++;
				}
			}
		}

		// スタート・ゴール
		gx = w-1;
		gy = h-1;
		int ans = bfs();
		System.out.println(h*w-countw-ans-1);

	}

	static int bfs() {

		Deque<P> q = new ArrayDeque<>();

		// 全ての点をINFで初期化
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				d[y][x] = -1;
			}
		}

		// スタート地点をキューに入れて、その点の距離を0にする
		q.push(new P(sx,sy));
		d[sy][sx] = 0;

		while (!q.isEmpty()) {
			P p = q.pop();
			int x = p.first;
			int y = p.second;

			if (x == gx && y == gy) break;
			for (int i = 0; i < 4; i++) {
				int mx = x + dx[i];
				int my = y + dy[i];

				// 範囲外に出たときは次の処理へ
				if( mx < 0 || my < 0 || mx >= w || my >= h ) continue;

				// 移動可能でまだ訪れたことがなければキューに入れる
				if(maze[my][mx] != '#' && d[my][mx] == -1){
					q.push(new P(mx,my));
					d[my][mx] = d[y][x] + 1;
				}
			}
		}
		return d[gy][gx];
	}

	public static class P {
		int first = 0;
		int second = 0;

		public P(int x, int y) {
			first = x;
			second = y;
		}
	}

}
