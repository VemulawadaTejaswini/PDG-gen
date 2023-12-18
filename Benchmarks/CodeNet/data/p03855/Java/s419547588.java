import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList();
        List<List<Integer>> graph2 = new ArrayList();
        for (int i=0; i<N; i++) {
            graph.add(new ArrayList());
            graph2.add(new ArrayList());
        }

        for (int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a-1).add(b-1);
            graph.get(b-1).add(a-1);
        }
        for (int i=0; i<L; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph2.get(a-1).add(b-1);
            graph2.get(b-1).add(a-1);
        }

        HashSet[] roads = new HashSet[N];
        HashSet[] rails = new HashSet[N];

        int[] visited = new int[N];
        for(int i=0; i<N; i++){
            if(visited[i]==0){
                visited[i]=i+1;
                List<Integer> vis = new LinkedList();
                vis.add(i);

                dfs(i,visited,graph,vis);
                for(int m: vis){
                    roads[m]=new HashSet(vis);
                }
            }
        }

        visited = new int[N];
        for(int i=0; i<N; i++){
            if(visited[i]==0){
                visited[i]=i+1;
                List<Integer> vis = new LinkedList();
                vis.add(i);
                dfs(i,visited,graph2,vis);
                for(int m: vis){
                    rails[m]=new HashSet(vis);
                }
            }
        }

        for (int i=0;i<N; i++) {
            roads[i].retainAll(rails[i]);
            System.out.print(roads[i].size()+" ");
        }
        System.out.println();
    }

    public static void dfs(int cur, int[] visited, List<List<Integer>> graph, List<Integer> vis){

        for(int neigh: graph.get(cur)){
            if (visited[neigh]==0) {
                visited[neigh]=1;
                vis.add(neigh);
                dfs(neigh, visited, graph,vis);
            }
        }
        return;
    }
}
