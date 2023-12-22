import java.util.*;
import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    LinkedList<Integer> adj[]; 
    boolean visited[];

    C(int v){
        visited = new boolean[v];
        this.adj = new LinkedList[v]; 
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>(); 
        }
    }

    void addEdge(int v, int w) 
    { 
        adj[v].add(w);
    } 

    
    void DFS(int v){
        visited[v] = true;
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()){ 
            int n = i.next(); 
            if (!visited[n]) 
                DFS(n); 
        } 
    } 
    
    int notConnected(int v){
        int count = 0;
        for (int i = 0; i < v; ++i){
            if (!visited[i]){
                count++;
            }
        }  
        return count;
    }

	public static void main (String[] args) throws IOException{
        String nm[] = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        C g = new C(n); 
  
        for(int i=0;i<m;i++){
            String ip[] = br.readLine().split(" ");
            g.addEdge(Integer.parseInt(ip[0]), Integer.parseInt(ip[1])); 
        }
        g.DFS(1);
        bw.write(g.notConnected(n) + "\n");
        bw.flush();
    }    
}
