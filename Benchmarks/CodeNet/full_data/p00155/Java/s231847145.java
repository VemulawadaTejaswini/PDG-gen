import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//1011 start
	int INF = 1 << 24;
	
	class Edge{
		int from, to;
		double cost;
		public Edge(int from, int to, double cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	class State implements Comparable<State>{
		int now;
		double cost;

		public State(int now, double cost) {
			this.now = now;
			this.cost = cost;
		}

		public int compareTo(State o) {
			if(this.cost < o.cost)return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<ArrayList<Edge>> pass = new ArrayList<ArrayList<Edge>>();
			Point2D [] data = new Point2D[n];
			int [] number = new int[n];
			for(int i = 0 ; i < n; i++){
				number[i] = sc.nextInt() -1;
				data[i] = new Point2D.Double(sc.nextInt(), sc.nextInt());
				pass.add(new ArrayList<Main.Edge>());
			}
			
			for(int i = 0 ; i < n; i++){
				for(int j = i + 1; j < n; j++){
					double dis = data[i].distance(data[j]);
					if(dis <= 50){
						pass.get(number[i]).add(new Edge(number[i], number[j], dis));
						pass.get(number[j]).add(new Edge(number[j], number[i], dis));
					}
				}
			}
			
			int m = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < m; i++){
				int s = sc.nextInt()-1;
				int g = sc.nextInt()-1;
				String res = solve(s,g,pass);
				sb.append(res + "\n");
			}
			System.out.print(sb.toString());
		}
	}

	private String solve(int s, int g, ArrayList<ArrayList<Edge>> pass) {
		PriorityQueue<State> open = new PriorityQueue<Main.State>();
		open.add(new State(s, 0.0));
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
				break;
			}
			for(int i = 0 ; i < pass.get(now.now).size(); i++){
				Edge nowe = pass.get(now.now).get(i);
				double nextcost = now.cost + nowe.cost;
				if(close[nowe.to] <= nextcost) continue;
				close[nowe.to] = nextcost;
				open.add(new State(nowe.to, nextcost));
				route[nowe.to] = nowe.from;
			}
		}
		if(! flg){
			return "NA";
		}
		StringBuilder ans = new StringBuilder();
		int prev = g;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(prev >= 0){
			stack.add(prev + 1);
			prev = route[prev];
		}
		while(! stack.isEmpty()){
			ans.append(" " + stack.removeLast());
		}
		return ans.substring(1);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}