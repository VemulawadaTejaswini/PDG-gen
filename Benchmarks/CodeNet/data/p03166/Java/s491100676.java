import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//G - Longest Path
//refer to https://www.geeksforgeeks.org/longest-path-in-a-directed-acyclic-graph-dynamic-programming/
//https://atcoder.jp/contests/dp/tasks/dp_g

//An efficient approach is to use Dynamic Programming and DFS together to find the longest path in the Graph.

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static ArrayList<Integer> edge[];
    public static void main(String[] args) throws IOException {
  
        int N = nextInt(); 
        int M = nextInt(); 
 
        edge = new ArrayList[N+1];
        for (int i=1; i<=N;  i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i=0; i<M;  i++) {
            int x = nextInt(); 
            int y = nextInt(); 
            edge[x].add(y);
        }

    
        // Dp array 
        int[] dp = new int[N+1]; 
  
        // Visited array to know if the node 
        // has been visited previously or not 
        boolean[] visited = new boolean[N + 1]; 
  
        // Call DFS for every unvisited vertex 
        for (int i = 1; i <= N; i++)  
        { 
            if (!visited[i]) 
                dfs(i, dp, visited); 
        } 
  
        int ans = 0; 
  
        // Traverse and find the maximum of all dp[i] 
        for (int i = 1; i <= N; i++)  
        { 
            ans = Math.max(ans, dp[i]); 
        }  
        
        System.out.println(ans);
  
    }
    
    static void dfs(int node
            , int dp[]
            , boolean visited[]) 
    { 
        // Mark as visited 
        visited[node] = true; 

        // Traverse for all its children 
        for (int i = 0; i < edge[node].size(); i++)  
        { 
            int ChildNode = edge[node].get(i);
            // If not visited 
            if (!visited[ChildNode]) 
                dfs(ChildNode, dp, visited); 

            // Store the max of the paths 
            dp[node] = Math.max(dp[node], 1 + dp[ChildNode]); 
        } 
    } 

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}