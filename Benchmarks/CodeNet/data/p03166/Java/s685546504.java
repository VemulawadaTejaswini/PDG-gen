import java.util.*;
import java.io.*;

class Main {

	private static void updateDistances(List<Integer> []adjList, int []dp, boolean []visited, int src) {
		
		visited[src] = true;

		for(int target: adjList[src]) {
			if (!visited[target])
				updateDistances(adjList, dp, visited, target);

			dp[src] = Math.max(dp[src], 1 + dp[target]);
		}
	}

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String []s = br.readLine().split(" ");

		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);

		List<Integer> []adjList = new ArrayList[N];

		for(int i=0; i < N; ++i)
			adjList[i] = new ArrayList<>();


		boolean []visited = new boolean[N];

		int []dp = new int[N];
		Arrays.fill(dp, 0);

		for(int i=0; i < M; ++i) {
			s = br.readLine().split(" ");

			int u = Integer.parseInt(s[0]) - 1;
			int v = Integer.parseInt(s[1]) - 1;

			adjList[u].add(v);
		}

		for(int i=0; i < N; ++i)
			if (!visited[i])
				updateDistances(adjList, dp, visited, i);

		int result = 0;
		for(int i=0; i < N; ++i)
			result = Math.max(result, dp[i]);

		System.out.println(result);
    }
}