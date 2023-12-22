import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int W, H;
	int[][] map;
	int[][][] dist;
	int[] cost = new int[4];
	PriorityQueue<State> pq;
	
	int[] vx = {1, 0, -1, 0};
	int[] vy = {0, 1, 0, -1};
	
	class State implements Comparable<State> {
		int x, y, d;
		
		public State(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}

		@Override
		public int compareTo(State s) {
			int d1 = dist[y][x][d], d2 = dist[s.y][s.x][s.d];
			if (d1 < d2) return -1;
			else if (d1 > d2) return 1;
			return 0;
		}
	}
	
	void dijkstra() {
		if (pq.isEmpty()) return;
		State s = pq.poll();
		int cmd = map[s.y][s.x];
		for (int i = 0; i < vx.length; i++) {
			int c = (cmd == i) ? 0 : cost[i];
			int dir = (s.d + i) % 4;
			int nx = s.x + vx[dir], ny = s.y + vy[dir];
			if (nx >= 0 && nx < W && ny >= 0 && ny < H) {
				if (dist[ny][nx][dir] > dist[s.y][s.x][s.d] + c) {
					dist[ny][nx][dir] = dist[s.y][s.x][s.d] + c;
					pq.add(new State(nx, ny, dir));
				}
			}
		}
		
		dijkstra();
	}
	
	public void run() {
		while (true) {
			W = in.nextInt();
			H = in.nextInt();
			if ((W|H) == 0) break;
			map = new int[H][W];
			dist = new int[H][W][4];
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = in.nextInt();
					Arrays.fill(dist[i][j], Integer.MAX_VALUE);
				}
			}
			
			for (int i = 0; i < 4; i++) 
				cost[i] = in.nextInt();
			
			pq = new PriorityQueue<State>();
			dist[0][0][0] = 0;
			pq.add(new State(0, 0, 0));
			
			dijkstra();
			
			System.out.println(Math.min(dist[H-1][W-1][0], dist[H-1][W-1][1]));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}