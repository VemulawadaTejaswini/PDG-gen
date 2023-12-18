import java.util.*;
public class Main {
    static int min_num_of_edges = 0, edge_count = 0; 
  
    // Class to represent a graph 
    static class Graph 
    { 
  
        // No. of vertices 
        int V; 
  
        // Pointer to an array containing 
        // adjacency lists 
        Vector<Integer>[] adj; 
  
        // A function used by minEdgeDFS 
  
        // Utility function for finding minimum number 
        // of edges using DFS 
        private void minEdgeDFSUtil(boolean[] visited,  
                                    int src, int des)  
        { 
  
            // For keeping track of visited 
            // nodes in DFS 
            visited[src] = true; 
  
            // If we have found the destination vertex 
            // then check whether count of total number of edges 
            // is less than the minimum number of edges or not 
            if (src == des) 
            { 
                if (min_num_of_edges > edge_count) 
                    min_num_of_edges = edge_count; 
            } 
  
            // If current vertex is not destination 
            else 
            { 
                for (int i : adj[src])  
                { 
                    int v = i; 
  
                    if (!visited[v])  
                    { 
                        edge_count++; 
                        minEdgeDFSUtil(visited, v, des); 
                    } 
                } 
            } 
  
            // Decrement the count of number of edges 
            // and mark current vertex as unvisited 
            visited[src] = false; 
            edge_count--; 
        } 
  
        // Constructor 
        @SuppressWarnings("unchecked") 
        Graph(int V) { 
            this.V = V; 
            adj = new Vector[V]; 
  
            for (int i = 0; i < V; i++) 
                adj[i] = new Vector<>(); 
        } 
  
        // Function to add an edge to graph 
        void addEdge(int src, int des)  
        { 
            adj[src].add(des); 
            adj[des].add(src); 
        } 
  
        // Function to print minimum number of edges 
        // It uses recursive minEdgeDFSUtil 
        int minEdgeDFS(int u, int v) 
        { 
  
            // To keep track of all the 
            // visited vertices 
            boolean[] visited = new boolean[this.V]; 
            Arrays.fill(visited, false); 
  
            // To store minimum number of edges 
            min_num_of_edges = Integer.MAX_VALUE; 
  
            // To store total number of 
            // edges in each path 
            edge_count = 0; 
  
            minEdgeDFSUtil(visited, u, v); 
  
            // Print the minimum number of edges 
            return min_num_of_edges; 
        } 
    }  
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt(); 

        Graph g = new Graph(n); 
        int arr[] = new int[n];

        for(int i = 0 ; i < n -1 ; i++)
        g.addEdge(i, i+1);

        g.addEdge(x-1, y-1); 
  
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int a = g.minEdgeDFS(i, j); 
                arr[a]++;
            }
        }
        for(int i = 1 ; i < n ; i++)
        System.out.println(arr[i]);
        

    }
  
}
