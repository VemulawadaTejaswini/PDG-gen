import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry;

// This class represents a directed graph using adjacency list 
// representation 
class Graph
{ 
    private int V;   // No. of vertices 
  
    // Array  of lists for Adjacency List Representation 
    private LinkedList<Integer> adj[]; 
    boolean visited[] = new boolean[V]; 
    // Constructor 
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
    } 
  
    // A function used by DFS 
    void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    int DFS(int v) 
    { 
        visited[v]=true;
        int count=1;
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()){
            if (visited[i.next()]==false){
                int r=DFS(i.next());
                count+=r;
            }
        }
        return count;
    } 
  
    public void main(String args[]) 
    { 
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        Graph g= new Graph(n);
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            if ((map.containsKey(a) && map.get(a)==b) || (map.containsKey(b) && map.get(b)==a))
            continue;
            map.put(a,b);
            map.put(b,a);
            g.addEdge(a,b);
        }
        int result=0;
        for (int i=0;i<n;i++){
            if (visited[i]==false)
            result=Math.max(result,DFS(i));
        }
        System.out.println(result);
    } 
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}