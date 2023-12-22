import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int N, M;
	int INF = Integer.MAX_VALUE / 2;
	int[][] graph, memo;
	
	int visitedAll = ((1<<n) -1);

	void run() {
		N = sc.nextInt(); // edge number
		M = sc.nextInt(); // vertex number
		graph = new int[N][N];
		memo = new int[N][1 << N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(graph[i], INF);
			Arrays.fill(memo[i], -1);
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int cost = sc.nextInt();
			graph[s][t] = cost;
		}
		int res = tsp(1, 0);
		System.out.println(res == INF ? -1 : res);
	}

	int tsp(int mask, int pos) {
	   if(mask==VISITED_ALL){
		return dist[pos][0];
	}
	if(dp[mask][pos]!=-1){
	   return dp[mask][pos];
	}

	//Now from current node, we will try to go to every other node and take the min ans
	int ans = INT_MAX;

	//Visit all the unvisited cities and take the best route
	for(int city=0;city<n;city++){

		if((mask&(1<<city))==0){

			int newAns = dist[pos][city] + tsp( mask|(1<<city), city);
			ans = min(ans, newAns);
		}

	}
	
	return dp[mask][pos] = ans;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
