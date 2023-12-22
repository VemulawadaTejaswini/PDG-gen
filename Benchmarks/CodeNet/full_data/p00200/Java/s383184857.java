import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	int INF = 1 << 24;
	
	class Edge{
		int from, to, cost, time;

		public Edge(int from, int to, int cost,int time) {
			this.from = from;
			this.to = to;
			this.cost = cost;
			this.time = time;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if((m|n) == 0)break;
			Edge [] data = new Edge[m];
			for(int i = 0; i < m; i++){
				int from = sc.nextInt()- 1;
				int to = sc.nextInt()-1;
				int cost = sc.nextInt();
				int time = sc.nextInt();
				data[i] = new Edge(from, to, cost, time);
			}
			
			int [][] costd = new int[n-1][n];
			int [][] timed = new int[n-1][n];
			
			for(int i = 0; i < n-1; i++){
				Arrays.fill(costd[i], INF);
				Arrays.fill(timed[i], INF);
			}
			
			for(int node = 0; node < n-1; node++){
				costd[node][node] = 0;
				timed[node][node] = 0;
				for(int i = 0; i < n; i++){
					for(int j = 0; j < m; j++){
						Edge e = data[j];
						if(costd[node][e.from] != INF && costd[node][e.to] > costd[node][e.from] + e.cost){
							costd[node][e.to] = costd[node][e.from] + e.cost;
						}
						if(timed[node][e.from] != INF && timed[node][e.to] > timed[node][e.from] + e.time){
							timed[node][e.to] = timed[node][e.from] + e.time;
						}
					}
				}
			}
			
			int k = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < k; i++){
				int from = sc.nextInt()-1;
				int to = sc.nextInt()-1;
				if(from > to){
					int temp = from;
					from = to;
					to = temp;
				}
				int digit = sc.nextInt();
				if(digit == 0){
					sb.append(costd[from][to]);
				}
				else{
					sb.append(timed[from][to]);
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}