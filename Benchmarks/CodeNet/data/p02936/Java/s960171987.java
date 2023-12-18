import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        Graph g = new Graph(n);

        for(int i=0 ; i<n-1 ; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.addEdge(u,v);
        }

        for(int i=0 ; i<q ; i++) {
            st= new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.addDist(u,w);
        }

        g.printWeight();
    }
}

class Graph {
    int n;
    LinkedList<Integer> adj[];
    int w[];

    Graph(int v) {
        n = v;
        adj = new LinkedList[n+1];
        for(int i=0 ; i<=n ; i++) {
            adj[i] = new LinkedList<>();
        }
        w = new int[n+1];
    }

    void printWeight() {
        for(int i=1 ; i<=n ; i++) {
            System.out.print(w[i] + " ");
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void addDist(int u, int d) {
        LinkedList<Integer> lp = new LinkedList<>();

        lp.add(u);

        while(!lp.isEmpty()) {
            u = lp.poll();
            w[u] += d;

            adj[u].forEach((x) -> {
                lp.add(x);
            });
        }
    }
}
