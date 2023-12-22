import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	static class State implements Comparable<State>{
		int x;
		int y;
		int cost;
		public State(int a , int b , int c) {
			x = a;
			y = b;
			cost = c;
		}
		@Override
		public int compareTo(State o) {
			return cost - o.cost;
		}
	}

	static int solve(int map[][], int vis[][], int SX , int SY, int EX, int EY){
		State sp = new State(SX, SY, 0);
		vis[SY][SX] = 0;
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(sp);
		while(!q.isEmpty()){
			State cp = q.poll();
			if(cp.x == EX && cp.y == EY){
				return vis[cp.y][cp.x];
			}
			for(int dx = -2 ; dx <= 2 ; ++dx){
				int nx = cp.x + dx;
				if(nx < 0 || nx >= vis[0].length){
					continue;
				}
				for(int dy = -2 ; dy <= 2 ; ++dy){
					int ny = cp.y + dy;
					if(ny < 0 || ny >= vis.length){
						continue;
					}
					if(map[ny][nx] == 1){
						continue;
					}
					int D = Math.abs(dx) + Math.abs(dy);
					if(D == 0){
						continue;
					}
					int c = D == 1 ? 0 : 1;
					if(vis[ny][nx] == -1 || cp.cost + c < vis[ny][nx]){
						vis[ny][nx] = cp.cost + c;
						q.add(new State(nx , ny , cp.cost + c));
					}
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int SY = sc.nextInt() - 1;
		int SX = sc.nextInt() - 1;
		int EY = sc.nextInt() - 1;
		int EX = sc.nextInt() - 1;
		int vis[][] = new int[H][W];
		int map[][] = new int[H][W];
		for(int i = 0 ; i < H ; ++i){
			Arrays.fill(vis[i], -1);
			String S = sc.next();
			for(int j = 0 ; j < W ; ++j){
				char c = S.charAt(j);
				if(c == '#'){
					map[i][j] = 1;
				}
			}
		}
		System.out.println(solve(map, vis, SX, SY, EX, EY));
	}
}
