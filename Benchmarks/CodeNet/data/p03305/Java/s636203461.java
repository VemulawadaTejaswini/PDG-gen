import java.math.BigInteger;
import java.util.*;

public class Main {
	int INF = 1 << 30;
	
	class State implements Comparable<State>{
		int now, cost;
		public State(int now, int cost) {
			this.now = now;
			this.cost = cost;
		}
		public int compareTo(State o) {
			return this.cost - o.cost;
		}
		@Override
		public String toString() {
			return "State [now=" + now + ", cost=" + cost + "]";
		}
		
	}
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt() -1;
			int t = sc.nextInt() -1;
			int [][] pass1 = new int[n][n];
			int [][] pass2 = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass1[i], INF);
				pass1[i][i] = 0;
				Arrays.fill(pass2[i], INF);
				pass2[i][i] = 0;
			}
			
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				int d = sc.nextInt();
				pass1[a][b] = c;
				pass1[b][a] = c;
				pass2[a][b] = d;
				pass2[b][a] = d;
			}
			
			PriorityQueue<State> open = new PriorityQueue<>();
			int [] close1 = new int[n];
			Arrays.fill(close1, INF);
			close1[s] = 0;
			open.add(new State(s, 0));
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == t){
					break;
				}
				for(int i = 0; i < n; i++){
					int next = pass1[now.now][i];
					if(next == INF) continue;
					int nextcost = now.cost + pass1[now.now][i];
					if(nextcost >= close1[i]) continue;
					close1[i] = nextcost;
					open.add(new State(i, nextcost));
				}
			}
//			debug(close1);
			
			PriorityQueue<State> open2 = new PriorityQueue<>();
			int [] close2 = new int[n];
			Arrays.fill(close2, INF);
			close2[t] = 0;
			open.add(new State(t, 0));
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == s){
					break;
				}
				for(int i = 0; i < n; i++){
					int next = pass2[now.now][i];
					if(next == INF) continue;
					int nextcost = now.cost + pass2[now.now][i];
					if(nextcost >= close2[i]) continue;
					close2[i] = nextcost;
					open.add(new State(i, nextcost));
				}
			}
//			debug(close2);
			
			ArrayList<Long> list = new ArrayList<>();
			int min = INF;
			for(int i = n-1; i >= 0; i--){
				int now = close1[i] + close2[i];
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
