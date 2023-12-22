import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int N, M;
	int INF = Integer.MAX_VALUE / 2;
	int[][] graph;
	Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();

	void run() {
		N = sc.nextInt(); 
		M = sc.nextInt();
		graph = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			Arrays.fill(graph[i], INF);
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int cost = sc.nextInt();
			graph[s][t] = cost;
		}
		
	
	}
	
	

	int tsp(int mask, int v) {
		if (dp.contains(mask) && dp.get(mask).contains(v))  return dp.get(mask).get(v);
		
		if (mask == (1 << N) - 1) return graph[v][0];

		int res = INF;
		for (int i = 0; i < N; i++) {
		    if(mask & (1 << i) != 0) continue;
		    int tmp = graph[v][0] + tsp(mask | (1 << N), i);
		    if(tmp < res) res = tmp;
		}
		
		if(!dp.contains(mask)){
		   dp.put(mask, new HashMap<>());
		}
		
		dp.get(mask).put(v,res);
		
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
