// Java program for implementation of Ford Fulkerson algorithm
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

public class Main {
    static int V; //Number of vertices in graph
    public static class FordFulkerson {

        /* Returns true if there is a path from source 's' to sink
        't' in residual graph. Also fills parent[] to store the
        path */
        boolean bfs(int rGraph[][], int s, int t, int parent[]) {
            // Create a visited array and mark all vertices as not
            // visited
            boolean visited[] = new boolean[V];
            for(int i=0; i<V; ++i)
                visited[i]=false;

            // Create a queue, enqueue source vertex and mark
            // source vertex as visited
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(s);
            visited[s] = true;
            parent[s]=-1;

            // Standard BFS Loop
            while (queue.size()!=0)
            {
                int u = queue.poll();

                for (int v=0; v<V; v++)
                {
                    if (visited[v]==false && rGraph[u][v] > 0)
                    {
                        queue.add(v);
                        parent[v] = u;
                        visited[v] = true; 
                    } 
                } 
            } 

            // If we reached sink in BFS starting from source, then 
            // return true, else false 
            return (visited[t] == true); 
        } 

        // Returns tne maximum flow from s to t in the given graph 
        int fordFulkerson(int graph[][], int s, int t) 
        { 
            int u, v; 

            // Create a residual graph and fill the residual graph 
            // with given capacities in the original graph as 
            // residual capacities in residual graph 

            // Residual graph where rGraph[i][j] indicates 
            // residual capacity of edge from i to j (if there 
            // is an edge. If rGraph[i][j] is 0, then there is 
            // not) 
            int rGraph[][] = new int[V][V]; 

            for (u = 0; u < V; u++) 
                for (v = 0; v < V; v++) 
                    rGraph[u][v] = graph[u][v]; 

            // This array is filled by BFS and to store path 
            int parent[] = new int[V]; 

            int max_flow = 0; // There is no flow initially 

            // Augment the flow while tere is path from source 
            // to sink 
            while (bfs(rGraph, s, t, parent)) 
            { 
                // Find minimum residual capacity of the edhes 
                // along the path filled by BFS. Or we can say 
                // find the maximum flow through the path found. 
                int path_flow = Integer.MAX_VALUE; 
                for (v=t; v!=s; v=parent[v]) 
                { 
                    u = parent[v]; 
                    path_flow = Math.min(path_flow, rGraph[u][v]); 
                } 

                // update residual capacities of the edges and 
                // reverse edges along the path 
                for (v=t; v != s; v=parent[v]) 
                { 
                    u = parent[v]; 
                    rGraph[u][v] -= path_flow; 
                    rGraph[v][u] += path_flow; 
                } 

                // Add path flow to overall flow 
                max_flow += path_flow;
            }

            // Return the overall flow
            return max_flow;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        V = 2*N+2;
        // int E = Integer.parseInt(sc.next());
        int[][] graph = new int[2*N+2][2*N+2];
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        int[] d = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i<N;i++) {
            c[i] = Integer.parseInt(sc.next());
            d[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (a[i]<c[j] && b[i]<d[j]) graph[i][j+N] = 1;
            }
        }
        for (int i=0;i<N;i++) {
            graph[2*N][i] = 1;
            graph[N+i][2*N+1] = 1;
        }
        // for (int i=0;i<E;i++) {
        //     int s = Integer.parseInt(sc.next());
        //     int t = Integer.parseInt(sc.next());
        //     int c = Integer.parseInt(sc.next());
        //     graph[s][t] = c;
        // }
        FordFulkerson m = new FordFulkerson();
        // System.out.println(m.fordFulkerson(graph, 0, V-1));
        System.out.println(m.fordFulkerson(graph, 2*N, 2*N+1));

    }
}