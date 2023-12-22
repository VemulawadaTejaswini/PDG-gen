import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static PriorityQueue <State> pq=new PriorityQueue<>();
	
	static class State implements Comparable<State>{
		int a, cost;
		State(int a, int cost){
			this.a=a;
			this.cost=cost;
		}
		public int compareTo(State s) {
			return this.cost-s.cost;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int s, g, V, P;
			int[] v1=new int[n+1];
			int[] v2=new int[n+1];
			int[][] dist1=new int[n+1][n+1];
			int[][] dist2=new int[n+1][n+1];
			int INF=100000000;
			Arrays.fill(v1, INF);
			Arrays.fill(v2, INF);
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					dist1[i][j]=INF;
					dist2[i][j]=INF;
				}
			}
			
			for(int i=0; i<m; i++) {
				String str=sc.next();
				String[] token=str.split(",");
				int a=Integer.parseInt(token[0]);
				int b=Integer.parseInt(token[1]);
				int c=Integer.parseInt(token[2]);
				int d=Integer.parseInt(token[3]);
				dist1[a][b]=dist2[a][b]=c;
				dist1[b][a]=dist2[b][a]=d;
			}
			String str=sc.next();
			String[] token=str.split(",");
			s=Integer.parseInt(token[0]);
			g=Integer.parseInt(token[1]);
			V=Integer.parseInt(token[2]);
			P=Integer.parseInt(token[3]);
			pq.add(new State(s, 0));
			while(! pq.isEmpty()) {
				State state=pq.poll();
				if(v1[state.a]!=INF) continue;
				v1[state.a]=state.cost;
				for(int i=1; i<=n; i++) {
					if(dist1[state.a][i]!=INF) {
						pq.add(new State(i, state.cost+dist1[state.a][i]));
					}
				}
			}
			pq.clear();
			pq.add(new State(g, 0));
			while(! pq.isEmpty()) {
				State state=pq.poll();
				if(v2[state.a]!=INF) continue;
				v2[state.a]=state.cost;
				for(int i=1; i<=n; i++) {
					if(dist2[state.a][i]!=INF) {
						pq.add(new State(i, state.cost+dist2[state.a][i]));
					}
				}
			}
			System.out.println(V-P-(v1[g]+v2[s]));
			
			
			

		}
	}
}
