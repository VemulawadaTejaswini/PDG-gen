import java.util.*;


public class Main {
	
	int h,w, ans;
	char [][] data;
	int [][] used;
	
	int INF =  1<< 29;
	
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
	}
	
	//ダイクストラの状態クラス
		class State implements Comparable<State>{
			int now, cost;
			public State(int now, int cost) {
				this.now = now;
				this.cost = cost;
			}
			public int compareTo(State o) {
				return this.cost - o.cost;
			}
		}
	
	private int dijkstra(int s, int g, ArrayList<ArrayList<Edge>> pass) {
		PriorityQueue<State> open = new PriorityQueue<State>();
		open.add(new State(s, 0));
		int n = pass.size();
		double [] close = new double[n];
		Arrays.fill(close, INF);
		close[s] = 0.0;
		int [] route = new int[n];
		route[s] = -1;
		boolean flg = false;
		while(! open.isEmpty()){
			State now = open.poll();
			if(now.now == g){
				flg = true;
				return now.cost;
			}
			for(int i = 0 ; i < pass.get(now.now).size(); i++){
				Edge nowe = pass.get(now.now).get(i);
				int nextcost = now.cost + nowe.cost;
				if(close[nowe.to] <= nextcost) continue;
				close[nowe.to] = nextcost;
				open.add(new State(nowe.to, nextcost));
				route[nowe.to] = nowe.from;
			}
		}
		return -1;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			h = sc.nextInt();
			w = sc.nextInt();
			data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			int count = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == '.') count++;
				}
			}
			ArrayList<ArrayList<Edge>> edge = new ArrayList<>();
			int [] dy = {-1,0,1,0};
			int [] dx = {0,1,0,-1};
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					ArrayList<Edge> e = new ArrayList<>();
					for(int k = 0; k < 4; k++){
						int xx = j + dx[k];
						int yy = i + dy[k];
						if(!(0<= xx && xx < w && 0<= yy && yy < h)) continue;
						e.add(new Edge(j + i * w, xx + yy * w, 1));
					}
					edge.add(e);
				}
			}
			int res = dijkstra(0, h * w -1, edge);
			
			
			if(res == -1){
				System.out.println(-1);
			}
			else{
				System.out.println(count - res - 1);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
