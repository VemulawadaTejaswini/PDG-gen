import java.util.*;

public class Main {
	int INF = 1 << 24;
	
	class State implements Comparable<State>{
		int now,cost, time;

		public State(int now, int cost, int time) {
			this.now = now;
			this.cost = cost;
			this.time = time;
		}

		@Override
		public int compareTo(State o) {
			return this.cost - o.cost;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int k = sc.nextInt();
			int s = sc.nextInt();
			int g = sc.nextInt();
			if((n|m|l|k|s|g) == 0) break;
			
			ArrayList<Integer> hos = new ArrayList<Integer>();
			hos.add(s);hos.add(g);
			for(int i = 0; i < l; i++){
				hos.add(sc.nextInt());
			}
			int [][] pass = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
			}
			for(int i = 0; i < k; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int cost = sc.nextInt();
				pass[x][y] = cost;
				pass[y][x] = cost;
			}
			
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int K = 0; K < n; K++){
						pass[i][K] = Math.min(pass[i][K], pass[i][j] + pass[j][K]);
					}
				}
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(s, 0, m));
			int [][] close = new int[n][m+1];
			for(int i = 0; i < n; i++){
				Arrays.fill(close[i], INF);
			}
			
			for(int i = 0; i < m+1; i++){
				close[s][i] = 0;
			}
			int ans = INF;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.now == g){
					ans = now.cost;
					break;
				}
				
				for(int to: hos){
					if(pass[now.now][to] == INF) continue;
					if(pass[now.now][to] > m) continue;
					int value = pass[now.now][to] - now.time;
					int nexttime = 0;
					if(value < 0){
						value = 0;
						nexttime = now.time - pass[now.now][to];
					}
					int nextcost = now.cost + pass[now.now][to] + value;
					if(close[to][nexttime] <= nextcost) continue;
					open.add(new State(to, nextcost, nexttime));
				}
			}
			System.out.println(ans == INF ? "Help!" : ans);
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}