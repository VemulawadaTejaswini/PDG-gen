import java.util.*;

public class Main{
	int INF = 1 << 24;
	int [][] cost;
	int w,h;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	class State implements Comparable<State>{
		int nowx, nowy, cost, bit;

		public State(int nowx, int nowy, int cost, int bit) {
			this.nowx = nowx;
			this.nowy = nowy;
			this.cost = cost;
			this.bit = bit;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			w = sc.nextInt();
			h = sc.nextInt();
			char [][] data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			cost = new int[h][w];
			for(int i = 0; i < h; i++){
				Arrays.fill(cost[i], 1);
			}
			int sx = -1, sy = -1, countM = 0;
			HashMap<Integer, Integer> bitmap = new HashMap<Integer, Integer>();
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == 'S'){
						sx = j;
						sy = i;
						data[i][j] = ',';
					}
					if(data[i][j] == '#'){
						set(i, j);
					}
					if(data[i][j] == 'M'){
						bitmap.put(i * h + j, countM++);
					}
				}
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(sx, sy, 0, 0));
			int [][][] close = new int[h][w][1 << countM];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					Arrays.fill(close[i][j], INF);
				}
			}
			close[sy][sx][0] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(data[now.nowy][now.nowx]== 'G' && now.bit == (1 << countM) -1){
					ans = now.cost;
					break;
				}
				for(int i = 0; i < 4; i++){
					int xx = now.nowx + vx[i];
					int yy = now.nowy + vy[i];
					int nextcost = now.cost + cost[now.nowy][now.nowx];
					int nextbit = now.bit;
					if(! isOK(xx, yy))continue;
					if(data[yy][xx] == 'M'){
						int ind = bitmap.get(yy * h + xx);
						nextbit = nextbit | (1 << ind); 
					}
					if(close[yy][xx][nextbit] <= nextcost) continue;
					open.add(new State(xx, yy, nextcost, nextbit));
					close[yy][xx][nextbit] = nextcost;
				}
			}
			System.out.println(ans);
		}
	}

	private void set(int y, int x) {
		cost[y][x] = INF;
		for(int i = -2; i <= 2; i++){
			for(int j = -2; j <= 2; j++){
				int xx = x + j;
				int yy = y + i;
				if(! isOK(xx, yy)) continue;
				int res = Math.max(Math.abs(x - xx), Math.abs(y - yy));
				int dis = 4 - res;
				if(dis == 4) continue;
				cost[yy][xx] = Math.max(cost[yy][xx], dis);
			}
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0 <= yy && yy < h)return true;
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}