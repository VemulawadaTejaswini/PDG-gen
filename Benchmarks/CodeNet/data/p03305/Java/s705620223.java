import java.math.BigInteger;
import java.util.*;

public class Main {
	int INF = 1 << 30;
	
	class State implements Comparable<State>{
		int now;
		long cost;
		public State(int now, long cost) {
			this.now = now;
			this.cost = cost;
		}
		public int compareTo(State o) {
			return (int) (this.cost - o.cost);
		}
		@Override
		public String toString() {
			return "State [now=" + now + ", cost=" + cost + "]";
		}
		
	}
	
	public class Edge implements Comparable<Edge>{
		int from,to, cost;
		public Edge(int from, int to, int cost) {
			this.from = from; this.to = to; this.cost = cost;
		}
		public int compareTo(Edge o) {
			if(this.cost < o.cost)return -1;
			if(this.cost > o.cost)return 1;
			return 0;
		}
		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", cost=" + cost + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt() -1;
			int t = sc.nextInt() -1;
			ArrayList<ArrayList<Edge>>pass1 = new ArrayList<>();
			ArrayList<ArrayList<Edge>>pass2 = new ArrayList<>();
			for(int i = 0; i < n; i++){
				pass1.add(new ArrayList<>());
				pass2.add(new ArrayList<>());
			}
			
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				int d = sc.nextInt();
				pass1.get(a).add(new Edge(a, b, c));
				pass1.get(b).add(new Edge(b, a, c));
				pass2.get(a).add(new Edge(a, b, d));
				pass2.get(b).add(new Edge(b, a, d));
			}
			
			PriorityQueue<State> open = new PriorityQueue<>();
			long [] close1 = new long[n];
			Arrays.fill(close1, INF);
			close1[s] = 0;
			open.add(new State(s, 0));
			while(! open.isEmpty()){
				State now = open.poll();
				for(int i = 0; i < pass1.get(now.now).size(); i++){
					long nextcost = pass1.get(now.now).get(i).cost;
					int nextindx = pass1.get(now.now).get(i).to;
					if(nextcost == INF) continue;
					nextcost = now.cost + nextcost;
					if(nextcost >= close1[nextindx]) continue;
					close1[nextindx] = nextcost;
					open.add(new State(nextindx, nextcost));
				}
			}
//			debug(close1);
			
			PriorityQueue<State> open2 = new PriorityQueue<>();
			long [] close2 = new long[n];
			Arrays.fill(close2, INF);
			close2[t] = 0;
			open2.add(new State(t, 0));
			while(! open2.isEmpty()){
				State now = open2.poll();
				for(int i = 0; i < pass2.get(now.now).size(); i++){
					int next = pass2.get(now.now).get(i).cost;
					int nextTo = pass2.get(now.now).get(i).to;
					if(next == INF) continue;
					long nextcost = now.cost + next;
					if(nextcost >= close2[nextTo]) continue;
					close2[nextTo] = nextcost;
					open2.add(new State(nextTo, nextcost));
				}
			}
//			debug(close2);
			
			ArrayList<Long> list = new ArrayList<>();
			long min = INF;
			for(int i = n-1; i >= 0; i--){
				long now = close1[i] + close2[i];
				min = Math.min(min, now);
//				debug("min", min);
				list.add(1000000000000000L - min);
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = list.size()-1; i >= 0; i--){
				sb.append(list.get(i) + "\n");
			}
			System.out.print(sb.toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
