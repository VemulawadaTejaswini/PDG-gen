import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0212().doIt();
	}

	class AOJ0212{
		int C,N,M,S,D;
		int[][] cost;
		
		void solve(){
			int[][] closed = new int[N][C+1];
			for(int i=0;i<N;i++)Arrays.fill(closed[i],Integer.MAX_VALUE/2);
			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(S-1,0,C));
			closed[S-1][C] = 0;
			int result = -1;
			while(q.size()>0){
				State now = q.remove();
				int v = now.v;
				int c = now.cost;
				int w = now.wari;
//				System.out.println(v+" "+c+" "+w);
				if(v==D-1){
					result = c;
					break;
				}
				for(int i=0;i<N;i++)if(cost[v][i]>0){
					//割引券を使用しない場合
					if(closed[i][w]>cost[v][i]+c){
						q.add(new State(i, c+cost[v][i], w));
						closed[i][w] = cost[v][i]+c;
					}
					//使用する場合
					if(w>0){
						if(closed[i][w-1]>cost[v][i]/2+c){
							q.add(new State(i, c+(cost[i][v]/2), w-1));
							closed[i][w-1] = c+(cost[v][i]/2);
						}
					}
				}
			}
			System.out.println(result);
		}
		
		void doIt(){
			while(in.hasNext()){
				C = in.nextInt();
				N = in.nextInt();
				M = in.nextInt();
				S = in.nextInt();
				D = in.nextInt();
				if(C+N+D+S==0)break;
				cost = new int[N][N];
				for(int i=0;i<M;i++){
					int a = in.nextInt()-1;
					int b = in.nextInt()-1;
					cost[a][b] = cost[b][a] = in.nextInt();
				}
				solve();
			}
			
		}
		class State implements Comparable<State>{
			int v,cost,wari;
			public State(int v,int cost,int wari) {
				this.v = v;
				this.cost = cost;
				this.wari = wari;
			}
			public int compareTo(State o) {
				return cost-o.cost;
			}
		}
	}

}