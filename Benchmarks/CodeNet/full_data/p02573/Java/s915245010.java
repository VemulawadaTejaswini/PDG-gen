import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Graph g = new Graph(n+1);
        for(int i=0; i<m; i++)
            g.add(in.nextInt(), in.nextInt());
        System.out.println(g.getAns());
        in.close();
    }
    
    static class Graph {
        int V;
        ArrayList<Integer> list[];
        
        Graph(int v) {
            this.V = v;
            list = new ArrayList[V];
            for(int i=0; i<V; i++)
                list[i] = new ArrayList<>();
        }
        
        void add(int u, int v) {
            list[u].add(v);
            list[v].add(u);
        }
        
        int getAns() {
            boolean[] visited = new boolean[V];
            int ans = 0;
            for(int i=1; i<V; i++) {
                if(!visited[i])
                    ans = Math.max(ans, dfs(i, visited));
            }
            return ans + 1;
        }
        
        int dfs(int s, boolean[] visited) {
            if(visited[s])
                return 0;
            visited[s] = true;
            int count = 0;
            for(int i : list[s]) {
                if(!visited[i])
                    count += 1 + dfs(i, visited);
            }
            return count;
        }
    }
}