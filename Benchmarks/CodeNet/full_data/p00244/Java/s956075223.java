import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	class State implements Comparable<State>{
		int pos, cost, tick;

		public State(int pos, int cost, int tick) {
			this.pos = pos;
			this.cost = cost;
			this.tick = tick;
		}

		@Override
		public int compareTo(State arg0) {
			return this.cost - arg0.cost;
		}
	}
	private void doit(){
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			int [][] pass = new int[n][n];
			int INF = 1 << 24;
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() -1;
				int b = sc.nextInt() -1;
				int cost = sc.nextInt();
				pass[a][b] = cost;
				pass[b][a] = cost;
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(0, 0, 1));
			int [][] close = new int[n][2];
			for(int i = 0; i < n; i++){
				Arrays.fill(close[i], INF);
			}
			close[0][1] = 0;
			int ans = 1 << 24;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.pos == n-1){
					ans = now.cost;
					break;
				}
				for(int i = 0; i < n; i++){
					if(i == now.pos) continue;
					if(pass[now.pos][i] == INF) continue;
					int nextcost = now.cost + pass[now.pos][i];
					if(close[i][now.tick] > nextcost){
						open.add(new State(i, nextcost, now.tick));
						close[i][now.tick] = nextcost;
					}
					
					if(now.tick == 0) continue;
					for(int j = 0; j < n; j++){
						if(j == now.pos || j == i) continue;
						if(pass[i][j] == INF) continue;
						if(close[j][0] <= now.cost) continue;
						open.add(new State(j, now.cost, 0));
						close[j][0] = now.cost;
					}
				}
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}