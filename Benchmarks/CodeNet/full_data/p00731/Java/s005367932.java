import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	// ??§?¨????????´?????????????????????????
	class Pair {
		int cost, y, x, lr;
		Pair(int c, int y, int x, int lr) {
			this.cost = c;
			this.y = y;
			this.x = x;
			this.lr = lr;
		}
	}
	
	static final int INF = Integer.MAX_VALUE;
	static final int LEFT  = 0;
	static final int RIGHT = 1;
	
	static char[][] map;
	static int w;
	static int h;

	static int[] right_y = {-2, -1, 0, 1, 2, -1, 0, 1, 0};
	static int[] right_x = { 1,  1, 1, 1, 1,  2, 2, 2, 3};
	static int[] left_y =  { 0, -1,  0,  1, -2, -1,  0,  1,  2};
	static int[] left_x =  {-3, -2, -2, -2, -1, -1, -1, -1, -1};
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			w = scan.nextInt();
			h = scan.nextInt();
			if (w + h == 0)
				break;
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					map[i][j] = scan.next().charAt(0);
			}
			
			System.out.println(solve());
		}
	}
	
	int solve() {
		// ??????????????¨?????????
		int[][][] dp = new int[h][w][2];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] != 'S') {
					dp[i][j][0] = INF;
					dp[i][j][1] = INF;
				} else {
					dp[i][j][0] = 0;
					dp[i][j][1] = 0;
				}
			}
		}
		
		/** ????????\??£?????????????¢????
		System.out.printf("w = %d, h = %d\n", w, h);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++)
				System.out.print(map[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (dp[i][j][0] == INF) {
					System.out.print("F ");
				} else {
					System.out.print(dp[i][j][0] + " ");
				}
			}
			System.out.println();
		}
		*/
		
		Queue<Pair> que = new PriorityQueue<Pair>(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.cost - o2.cost;
			}
		});
		for (int j = 0; j < w; j++) {
			if (map[h - 1][j] == 'S') {
				que.add(new Pair(0, h - 1,j, LEFT));
				que.add(new Pair(0, h - 1,j, RIGHT));
			}
		}
		
		while(!que.isEmpty()) {
			Pair pair = que.poll();
			if (map[pair.y][pair.x] == 'T')
				return pair.cost;
			
//			if (dp[pair.y][pair.x][pair.lr] < pair.cost)
//				continue;
			int[] move_h, move_w;
			if (pair.lr == RIGHT) {
				move_h = right_y;
				move_w = right_x;
			} else {
				move_h = left_y;
				move_w = left_x;
			}
			
			for (int j = 0; j < 9; j++) {
				int my = pair.y + move_h[j];
				int mx = pair.x + move_w[j];
				if (my < 0 || mx < 0 || my >= h || mx >= w)
					continue;
				if (map[my][mx] == 'X' || map[my][mx] == 'S')
					continue;
				
				if (map[my][mx] == 'T') {
					dp[my][mx][pair.lr] = pair.cost;
					que.add(new Pair(pair.cost, my, mx, 1 - pair.lr));
					continue;
				}
				int cost = pair.cost + (int)(map[my][mx] - '0');
				if (cost <= dp[my][mx][pair.lr]) {
					dp[my][mx][pair.lr] = cost;
					que.add(new Pair(cost, my , mx, 1 - pair.lr));
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}