import java.util.*;

class Main implements Runnable{
    private HashMap<Integer, List<Integer>> graph;
    private int time;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }

    @Override
    public void run() {
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
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        List<int[]> bridges = new LinkedList<>();

        Arrays.fill(parent, -1);
        time = 0;

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                BridgeUtil(i, parent, disc, low, visited, bridges);
            }
        }

        Collections.sort(bridges, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] != b[0]){
                    return a[0] - b[0];
                }
                else {
                    return a[1] - b[1];
                }
            }
        });

        for(int[] bridge : bridges){
            System.out.println(bridge[0] + " " + bridge[1]);
        }
    }
    
    private void BridgeUtil(int u, int[] parent, int[] disc, int[] low, boolean[] visited, List<int[]> bridges){
        if(visited[u]){
            return;
        }

        visited[u] = true;
        disc[u] = low[u] = ++time;

        for(Integer v : graph.get(u)){
            if(!visited[v]){
                parent[v] = u;
                BridgeUtil(v, parent, disc, low, visited, bridges);

                low[u] = Math.min(low[u], low[v]);

                if(low[v] > disc[u]){
                    int min = Math.min(u, v);
                    int max = Math.max(u, v);
                    bridges.add(new int[] {min, max});
                }
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}