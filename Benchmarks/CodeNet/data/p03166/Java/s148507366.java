import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>(N);

        for (int i=0; i<N; i++)
            graph.add(new LinkedList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            List<Integer> lst = graph.get(src-1);
            lst.add(dest-1);
            graph.set(src-1, lst);
        }

        Integer[] dp = new Integer[N];
        boolean[] visited = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                ans = Math.max(ans, dfs(i, graph, visited, dp));
            }
        }
        System.out.println(ans);
    }

    public static int dfs(int cur, List<List<Integer>> graph, boolean[] visited, Integer[] dp){
        int ans=0;
        for (int neigh: graph.get(cur)){
            if(visited[neigh]){
                ans = Math.max(dp[neigh], ans);
            }
            else{
                ans = Math.max(ans, dfs(neigh, graph, visited, dp));
            }
        }
        visited[cur] = true;

        if (graph.get(cur).size()==0){
            dp[cur] = ans;
        }
        else
            dp[cur] = ans+1;
        return dp[cur];
    }
}
