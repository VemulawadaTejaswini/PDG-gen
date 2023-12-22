import java.util.*;
import static java.lang.Math.*;

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
					int x = in.nextInt(), fx = in.nextInt();
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
			ret = (ret*((maxCnt/2)%MOD))%MOD;
		}
		return ret;
	}

	void dfs(int v){
		if(visited[v]) return ;
		visited[v] = true;
		for(int i=0; i<2; i++){
			dfs(graph[v][i]);
			if(weight[v][i] >= maxValue){
				if(weight[v][i] == maxValue){
					maxCnt++;
				}
				else{
					maxValue = weight[v][i];
					maxCnt = 1;
				}
			}
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}