import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//1610 start
	int INF = 1 << 24;
	
	class Edge{
		int from, to, dis, cost;

		public Edge(int from, int to, int dis, int cost) {
			this.from = from;
			this.to = to;
			this.dis = dis;
			this.cost = cost;
		}
		
	}
	
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
			ArrayList<ArrayList<Edge>> data = new ArrayList<ArrayList<Edge>>();
			for(int i = 0; i < n; i++){
				data.add(new ArrayList<Main.Edge>());
			}
			
			for(int i = 0; i < m; i++){
				int from = sc.nextInt()-1;
				int to = sc.nextInt()-1;
				int dis = sc.nextInt();
				int cost = sc.nextInt();
				data.get(from).add(new Edge(from, to, dis, cost));
				data.get(to).add(new Edge(to, from, dis, cost));
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
				
				for(int i = 0; i < data.get(now.now).size(); i++){
					Edge next =data.get(now.now).get(i);
					if(next.dis == INF ) continue;
					int nextdis = now.dis + next.dis;
					if(vi[next.to])continue;
					if(close[next.to] >= nextdis){
						open.add(new State(next.to, nextdis,next.cost));
						close[next.to] = nextdis;
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