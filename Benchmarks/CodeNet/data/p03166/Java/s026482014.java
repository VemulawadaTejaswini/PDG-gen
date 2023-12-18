import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Graph {
    private int v;
    private LinkedList<Integer>[] adj_lists;
    private int[] maxLens;
    //node starts from 1;
    Graph (int v){
        this.v = v;
        adj_lists = new LinkedList[v + 1];
        maxLens = new int[v + 1];
        for (int i = 1; i < v + 1; i++){
            adj_lists[i] = new LinkedList<Integer>();
            maxLens[i] = -1;
        }
    }

    public void addEdge(int source, int dest){
        adj_lists[source].add(dest);
        //adj_lists[dest].add(source);
    }

    public LinkedList<Integer> getAdjs(int node){
        return adj_lists[node];
    }

//    public boolean isEnd(int node){
//        return adj_lists[node].isEmpty();
//    }

    public int DFS(int node){

        if (maxLens[node] != -1){
            return maxLens[node];
        }else{
            int maxlen = 0;
            for (int child : getAdjs(node)){
              maxlen = Math.max(maxlen, 1 + DFS(child));
              maxLens[node] = maxlen;
            }
            return maxlen;
        }
    }

    public int findLongestPath(){
        int maxLen = 0;
        for (int i = 1; i < adj_lists.length; i++ ){

            maxLen = Math.max(DFS(i),maxLen);
        }
        return maxLen;
    }



    public String toString(){
        StringBuilder ans = new StringBuilder();
        int node = 1;

        for (LinkedList<Integer> adjs : Arrays.copyOfRange(adj_lists,1,adj_lists.length)){
            ans.append(node);
              for (int adj : adjs) {
              ans.append(" -> ");
              ans.append(adj);
             }
          ans.append("\n");
          node++;
      }
        return ans.toString();
    }

    public static void main (String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
 
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
 
        Graph g = new Graph(n);
 
        for(int i=0 ; i<m ; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.addEdge(u, v);
        }
 
        int ans = g.findLongestPath();
        pw.print(ans);

        
        pw.flush();
        pw.close();



    }
}