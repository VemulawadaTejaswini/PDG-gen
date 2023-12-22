import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by shoya on 2017/04/12.
 */
public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int r = sc.nextInt();
        DijkstraClass dijkstra = new DijkstraClass(V, E, r);
        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            dijkstra.addDistande(s, d, c);
        }
        int[] dist = dijkstra.dikstra();
        for (int i = 0; i < dist.length; i++){
            if (dist[i] == 1 << 30)
                System.out.println("INF");
            else
                System.out.println(dist[i]);
        }
        return;
    }


    private static class DijkstraClass {
        class edge{
            int dest, cost;
            edge(int dest, int cost){
                this.dest = dest;
                this.cost = cost;
            }
        }

        private final int INF = 1 << 30;
        private int S;
        private int V;
        private ArrayList<ArrayList<edge>> edgesOfNodes = new ArrayList<ArrayList<edge>>();

        DijkstraClass(int V, int E, int Start){
            this.S = Start;
            this.V = V;
            for (int i = 0; i < V; i++)
                edgesOfNodes.add(new ArrayList<edge>());
        }

        void addDistande(int source, int dest, int cost){
            edgesOfNodes.get(source).add(new edge(dest, cost));
        }


        int[] dikstra(){
            class costAndNode implements Comparable {
                int cost, node;
                costAndNode(int cost, int node){
                    this.cost = cost;
                    this.node = node;
                }
                @Override
                public int compareTo(Object o) {
                    return this.cost - ((costAndNode) o).cost;
                }
            }

            PriorityQueue<costAndNode> pque = new PriorityQueue<costAndNode>();
            int[] distances = new int[V];
            for (int i = 0; i < V; i++)
                distances[i] = INF;
            distances[S] = 0;

            pque.add(new costAndNode(0, S));
            while (!pque.isEmpty()){
                costAndNode item = pque.poll();
                if (distances[item.node] < item.cost)
                    continue;

                //System.out.printf("Focusing on Node %d\n", item.node);
                //for (int i = 0; i < V; i++)
                //    System.out.printf("%d ", distances[i]);
                //System.out.println();

                for (edge e : edgesOfNodes.get(item.node)) {
                    //System.out.printf("Node %d -> %d, Cost %d -> %d\n",
                    //        item.node, e.dest, distances[e.dest],
                    //        distances[item.node] + e.cost);
                    if (distances[e.dest] > distances[item.node] + e.cost) {
                        distances[e.dest] = distances[item.node] + e.cost;
                        pque.add(new costAndNode(distances[e.dest], e.dest));
                    }
                }
            }

            return distances;
        }

    }
}