import java.util.*;

public class Main {

	int[][] graph;
	int[][] weight;
	int maxValue, maxCnt;
	int N;
	boolean[] visited;
	static final int MOD = 10007;
	
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N == 0) return ;
			graph = new int[N][2];
			weight = new int[N][2];
			visited = new boolean[N];
			for(int i=0; i<N; i++){
				for(int j=0; j<2; j++){
					int x = Integer.parseInt(in.next()), fx = Integer.parseInt(in.next());
					graph[i][j] = x;
					weight[i][j] = fx;
				}
			}
			System.out.println(solve());
		}
	}

	int solve(){
		int ret = 1;
		for(int i=0; i<N; i++)if(!visited[i]){
			maxValue = -1; maxCnt = 0;
			dfs(i);
			ret = (ret*(maxCnt%MOD))%MOD;
		}
		return ret;
	}

	void dfs(int v){
		for(;;){
			visited[v] = true;
			if(!visited[graph[v][0]]){
				if(maxValue <= weight[v][0]){
					if(maxValue == weight[v][0]){
						maxCnt++;
					}
					else{
						maxValue = weight[v][0];
						maxCnt = 1;
					}
				}
				v = graph[v][0];
			}
			else if(!visited[graph[v][1]]){
				if(maxValue <= weight[v][1]){
					if(maxValue == weight[v][1]){
						maxCnt++;
					}
					else{
						maxValue = weight[v][1];
						maxCnt = 1;
					}
				}
				v = graph[v][1];
			}
			else return ;
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}