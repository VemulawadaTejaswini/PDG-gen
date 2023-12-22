import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	static int INF = 2 << 27;
	static int[] vx = {1,0,-1,0};
	static int[] vy = {0,1,0,-1};
	static int[] vd = {0,1,2,3};
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if(W == 0 && H == 0) break;
			int[][] map = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int[] cost = new int[4];
			for(int i = 0; i < 4; i++) {
				cost[i] = sc.nextInt();
			}
			int[][][] memo = new int[H][W][4];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++)
				Arrays.fill(memo[i][j], 2 << 28);
			}
			PriorityQueue<Data> q = new PriorityQueue<Data>();
			q.add(new Data(0,0,0,0));
			while(!q.isEmpty()) {
				Data p = q.poll();
				int h = p.h;
				int w = p.w;
				if(memo[h][w][p.dir%4] <= p.cost) continue;
				memo[h][w][p.dir%4] = p.cost;
				for(int i = 0; i < 4; i++) {
					int td = (p.dir + vd[i]) % 4;
					int th = h + vy[td];
					int tw = w + vx[td];
					if(th < 0 || tw < 0 || th >= H || tw >= W) continue;
					if(map[h][w] == i) {
						q.add(new Data(th,tw,td,p.cost));
					}
					else {
						q.add(new Data(th,tw,td,p.cost + cost[i]));
					}
				}
			}
			int MIN = 2 << 28;
			for(int k = 0; k < 4; k++) MIN = Math.min(MIN, memo[H-1][W-1][k]);

			System.out.println(MIN);
			
		}
	}
	static class Data implements Comparable<Data> {
		
		int h;
		int w;
		int dir;
		int cost;
		Data(int a, int b, int c, int e) {
			h = a;
			w = b;
			dir = c;
			cost = e;
		}
		@Override
		public int compareTo(Data o) {
			return this.cost - o.cost;
		}
	}
}