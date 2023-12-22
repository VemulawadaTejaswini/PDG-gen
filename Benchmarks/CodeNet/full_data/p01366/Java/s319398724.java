import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//1610 start
	int INF = 1 << 24;
	
	class State implements Comparable<State>{
		int now, dis, cost;

		public State(int now, int dis, int cost) {
			this.now = now;
			this.dis = dis;
			this.cost = cost;
		}


		public int compareTo(State o) {
			if(this.dis < o.dis) return -1;
			if(this.dis > o.dis) return 1;
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost)return 1;
			return 0;
		}


		@Override
		public String toString() {
			return "State [now=" + now + ", dis=" + dis + ", cost=" + cost
					+ "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0)break;
			int [][] dis = new int[n][n];
			int [][] cost = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(dis[i], INF);
				Arrays.fill(cost[i], INF);
			}
			for(int i = 0; i < m; i++){
				int from = sc.nextInt()-1;
				int to = sc.nextInt()-1;
				int d = sc.nextInt();
				int c = sc.nextInt();
				dis[from][to] = d;
				dis[to][from] = d;
				cost[from][to] = c;
				cost[to][from] = c;
			}
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(0, 0, 0));
			int [] close = new int[n];
			Arrays.fill(close, INF);
			close[0] = 0;
			int ans = 0;
			boolean [] vi = new boolean[n];
			int count = 1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(vi[now.now]) continue;
				vi[now.now] = true;
				ans += now.cost;
				if(count == n) break;
				count++;
				
				for(int i = 0; i < n; i++){
					if(dis[now.now][i] == INF ) continue;
					int nextdis = now.dis + dis[now.now][i];
					if(vi[i])continue;
					if(close[i] >= nextdis){
						open.add(new State(i, nextdis,cost[now.now][i]));
						close[i] = nextdis;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}