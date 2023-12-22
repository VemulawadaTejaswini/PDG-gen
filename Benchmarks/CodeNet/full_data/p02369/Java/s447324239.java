import java.util.*;

public class Main {
    private static HashMap<Integer, List<Integer>> graph;
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[V];

        for(int i = 0; i < V; ++i){
            boolean[] recStack = new boolean[V];
            if(!visited[i] && cyclicUtil(i, visited, recStack)){
                System.out.println("1");
                return;
            }
        }

        System.out.println("0");
        return;
    }

    private static boolean cyclicUtil(int cur, boolean[] visited, boolean[] recStack){
        visited[cur] = true;
        recStack[cur] = true;

        for(Integer adj : graph.get(cur)){
            if(recStack[adj]){
                return true;
            }
            else if(!visited[adj] && cyclicUtil(adj, visited, recStack)){
                return true;
            }
        }

        recStack[cur] = false;
        return false;
    }
}