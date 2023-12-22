import java.util.*;

class Main {
    private static HashMap<Integer, List<Integer>> graph;
    private static int time;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int s = scanner.nextInt();
            int t = scanner.nextInt();

            graph.get(s).add(t);
            graph.get(t).add(s);
        }

        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];
        boolean[] AP = new boolean[V];

        time = 0;

        Arrays.fill(parent, -1);

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                APUtil(i, disc, low, parent, visited, AP);
            }
        }

        for(int i = 0; i < V; ++i){
            if(AP[i]){
                System.out.println(i);
            }
        }
    }

    private static void APUtil(int u, int[] disc, int[] low, int[] parent, boolean[] visited, boolean[] AP){
        if(visited[u]){
            return;
        }

        int children = 0;

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                ++children;

                parent[v] = u;
                APUtil(v, disc, low, parent, visited, AP);

                low[u] = Math.min(low[u], low[v]);

                if(parent[u] == -1 && children > 1){
                    AP[u] = true;
                }

                if(parent[u] != -1 && low[v] >= disc[u]){
                    AP[u] = true;
                }
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}