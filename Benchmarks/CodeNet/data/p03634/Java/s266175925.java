import java.util.*;

public class Main {

	class State implements Comparable<State>{
		int now;
		long cost;
		public State(int now, long cost) {
			this.now = now;
			this.cost = cost;
		}
		public int compareTo(State o) {
			if(this.cost > o.cost) return 1;
			if(this.cost < o.cost) return -1;
			return 0;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long [][] pass = new long[n][n];
			for(int i = 0; i < n;i++){
				Arrays.fill(pass[i], Long.MAX_VALUE);
			}
			
			for(int i =0; i < n-1; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1; 
				int c = sc.nextInt();
				pass[a][b] = c;
				pass[b][a] = c;
			}
			int q = sc.nextInt();
			int start = sc.nextInt() -1;
			
			PriorityQueue<State> open = new PriorityQueue<>();
			open.add(new State(start, 0));
			long [] close = new long[n];
			Arrays.fill(close, Long.MAX_VALUE);
			close[start] = 0;
			
			boolean [] used = new boolean[n];
			used[start] = true;
			int count = 1;
			
			while(!open.isEmpty()){
				State current = open.poll();
				if(!used[current.now]){
					used[current.now] = true;
					count++;
					if(count == n){
						break;
					}
				}
				
				for(int i = 0; i < n;i++){
					if(current.now == i)continue;
					if(pass[current.now][i] == Long.MAX_VALUE ) continue;
					long nextcost = current.cost + pass[current.now][i];
					if(close[i] < nextcost) continue;
					close[i] = nextcost;
					open.add(new State(i, nextcost));
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < q; i++){
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				long res = close[x] + close[y];
				sb.append(res+"\n");
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
