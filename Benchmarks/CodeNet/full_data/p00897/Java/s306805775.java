import java.util.*;

public class Main{
	class Edge{
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		
	}
	
	class State implements Comparable<State>{
		int now, tank, cost;

		public State(int now, int tank, int cost) {
			this.now = now;
			this.tank = tank;
			this.cost = cost;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int tank = sc.nextInt();
			if((m|n|tank) ==0) break;
			tank *= 10;
			ArrayList<ArrayList<Edge>> es = new ArrayList<ArrayList<Main.Edge>>();
			HashMap<String, Integer> table = new HashMap<String, Integer>();
			String start = sc.next();
			String end = sc.next();
			int startind = -1, endind = -1;
			if(table.containsKey(start)){
				startind = table.get(start);
			}
			else{
				startind = table.size();
				table.put(start, table.size());
			}
			if(table.containsKey(endind)){
				endind= table.get(end);
			}
			else{
				endind = table.size();
				table.put(end, table.size());
			}
			
			for(int i = 0; i < m; i++){
				String s = sc.next();
				String t = sc.next();
				int cost = sc.nextInt();
				int inds = -1, indt = -1;
				if(table.containsKey(s)){
					inds = table.get(s);
				}
				else{
					inds = table.size();
					table.put(s, table.size());
				}
				if(table.containsKey(t)){
					indt = table.get(t);
				}
				else{
					indt = table.size();
					table.put(t, table.size());
				}
				while(es.size()<= inds){
					es.add(new ArrayList<Main.Edge>());
				}
				while(es.size()<= indt){
					es.add(new ArrayList<Main.Edge>());
				}
				es.get(inds).add(new Edge(inds, indt, cost));
				es.get(indt).add(new Edge(indt, inds, cost));
			}
			int v = es.size();
			
			HashSet<Integer> gas = new HashSet<Integer>();
			for(int i = 0; i < n; i++){
				int ind = table.get(sc.next());
				gas.add(ind);
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(startind, tank, 0));
			int [][] close = new int[v][tank + 1];
			int INF = 1 << 24;
			for(int i = 0; i < v; i++){
				Arrays.fill(close[i], INF);
			}
			close[startind][tank] = 0;
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == endind){
					ans = now.cost;
					break;
				}
				
				for(int i = 0; i < es.get(now.now).size(); i++){
					int to = es.get(now.now).get(i).to;
					int cost = es.get(now.now).get(i).cost;
					int nextcost = now.cost + cost;
					int nexttank = now.tank - cost;
					if(nexttank < 0){
						continue;
					}
					if(gas.contains(to)){
						nexttank = tank;
					}
					
					if(close[to][nexttank] <= nextcost) continue;
					open.add(new State(to, nexttank, nextcost));
					close[to][nexttank] = nextcost;
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