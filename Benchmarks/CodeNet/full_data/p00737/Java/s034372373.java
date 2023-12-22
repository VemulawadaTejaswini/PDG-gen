

import java.util.*;
public class Main {

	//0135 start
	//0157 cording end
	//dir is 0 = n, 1 = E, 2 = S, 3 = W

	int INF = 1 << 24;
	int [] vx = {0,1,0,-1};
	int [] vy = {-1,0,1,0};
	int w,h;

	class C implements Comparable<C>{
		int x,y,cost, dir;


		public C(int x, int y, int cost, int dir) {
			this.x = x;
			this.y = y;
			this.cost = cost;
			this.dir = dir;
		}

		@Override
		public int compareTo(C o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}

		@Override
		public String toString() {
			return "C [x=" + x + ", y=" + y + ", cost=" + cost + ", dir=" + dir
					+ "]";
		}


	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			int [][] data = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [] option = new int[4];
			for(int i = 0; i < 4; i++){
				option[i] = sc.nextInt();
			}

			PriorityQueue<C> open = new PriorityQueue<Main.C>();
			open.add(new C(0, 0, 0, 1));

			int [][][] close = new int[h][w][4];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					Arrays.fill(close[i][j], INF);
				}
			}
			close[0][0][1] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				C now = open.poll();
				//System.out.println(now);
				if(now.x == w - 1 && now.y == h - 1){
					ans = now.cost;
					break;
				}
				//マップの命令
				int op = data[now.y][now.x];
				if(op != 4){
					int nextdir = (now.dir + op) % 4;
					int xx = now.x + vx[nextdir];
					int yy = now.y + vy[nextdir];
					//System.out.println("dir = " + nextdir + " xx = " + xx + " x = " + now.x + "yy = " + yy + " y = " + now.y);
					if(isOK(xx, yy)){
						int nextcost = now.cost;
						if(close[yy][xx][nextdir] > nextcost){
							open.add(new C(xx, yy, nextcost, nextdir));
							close[yy][xx][nextdir] = nextcost;
						}
					}
				}

				//オプション
				for(int i = 0; i < 4; i++){
					int nextdir = (now.dir + i) % 4;
					int xx = now.x + vx[nextdir];
					int yy = now.y + vy[nextdir];
					//System.out.println("adir = " + nextdir + " xx = " + xx + " x = " + now.x + "yy = " + yy + " y = " + now.y);
					if(! isOK(xx, yy)) continue;
					int nextcost = now.cost + option[i];
					if(close[yy][xx][nextdir] <= nextcost) continue;
					open.add(new C(xx, yy, nextcost, nextdir));
					close[yy][xx][nextdir] = nextcost;
				}
			}
			System.out.println(ans);


		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0<= yy && yy < h){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}