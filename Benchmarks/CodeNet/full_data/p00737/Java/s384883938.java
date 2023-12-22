import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int H, W;
	static int[] C = new int[4];
	static int[][] map = new int[30][30];
	static boolean read() {
		W = sc.nextInt(); H = sc.nextInt();
		if (W == 0) return false;
		
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				map[i][j] = sc.nextInt();
		
		for (int i = 0; i < 4; i++)
			C[i] = sc.nextInt();
				
		return true;
	}

	static final int INF = 1 << 20;
	static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
	static void solve() {
		int[][][] dist = new int[30][30][4];
		for (int i = 0; i < 30; i++)
			for (int j = 0; j < 30; j++)
				fill(dist[i][j], INF);
		
		PriorityQueue<State> que = new PriorityQueue<State>();
		que.add(new State(0, 0, 0, 0));
		while (!que.isEmpty()) {
			State s = que.poll();
			int x = s.x, y = s.y, c = s.c, d = s.d;
			if (dist[y][x][d] != INF) continue;
			dist[y][x][d] = c;
			
			if (y == H - 1 && x == W - 1) {
				
				System.out.println(c);
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int nd = (d + i) % 4;
				int nx = x + dx[nd], ny = y + dy[nd], nc = c + C[i];
					
				if (i == map[y][x])
					nc -= C[i];
				
				if (check(nx, ny) && dist[ny][nx][nd] > nc) 
					que.add(new State(nx, ny, nd, nc));
			}
		}
	}	
	static boolean check(int x, int y) {
		return (x >= 0 && x < W && y >= 0 && y < H);
	}
}

class State implements Comparable<State> {
	int x, y, c, d;	// ツコツスツト ツ陛サツ古シ
	State(int x, int y, int d, int c) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.d = d;
	}
	
	public int compareTo(State s) {
		return this.c - s.c;
	}
}