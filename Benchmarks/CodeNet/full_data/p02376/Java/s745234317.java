
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Created by shoya on 2017/04/13.
 */
public class Main {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        FordFulkersonClass ff = new FordFulkersonClass(V, E);

        for (int i = 0; i < E; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            ff.addEdge(s, d, c);
        }

        System.out.println(ff.fordFulkerson(0, V - 1));
        return;
    }


    public static class FordFulkersonClass {
        private class edge {
            int to; int cap; int rev;
            edge(int t, int c, int r){
                to = t; cap = c; rev = r;
            }
        }

        private int V, E;
        private boolean[] used;
        private ArrayList<ArrayList<edge>> edgeOfNodes;

        FordFulkersonClass(int v, int e){
            V = v; E = e;
            edgeOfNodes = new ArrayList<ArrayList<edge>>();
            for (int i = 0; i < V; i++)
                edgeOfNodes.add(new ArrayList<edge>());
        }

        public void addEdge(int from, int to, int cap){
            edgeOfNodes.get(from)
                    .add(new edge(to, cap, edgeOfNodes.get(to).size()));
            edgeOfNodes.get(to)
                    .add(new edge(from, 0, edgeOfNodes.get(from).size() - 1));
        }

        private int dfs(int source, int dest, int flow){
            //System.out.printf("%d %d %d\n", source, dest, flow);
            if (source == dest)
                return flow;
            used[source] = true;
            for (edge e : edgeOfNodes.get(source)){
                if (!used[e.to] && e.cap > 0){
                    int d = dfs(e.to, dest, min(flow, e.cap));
                    if (d > 0){
                        e.cap -= d;
                        edgeOfNodes.get(e.to).get(e.rev).cap += d;
                        return d;
                    }
                }
            }
            return 0;
        }

        public int fordFulkerson(int source, int dest){
            final int INF = 1 << 30;
            int flow = 0;
            while (true){
                used = new boolean[V];
                int f = dfs(source, dest, INF);
                if (f == 0)
                    break;
                flow += f;
            }
            return flow;
        }

    }

}