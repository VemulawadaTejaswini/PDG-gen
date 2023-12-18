import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        Node[] nodes=new Node[k];
        for(int i=0;i<k;nodes[i]=new Node(i++));
        for(int i=1;i<k;i++){
            nodes[i].edges.add(new Edge((i*10)%k, 0));
            if((i*10)%k!=(i+1)%k) nodes[i].edges.add(new Edge((i+1)%k, 1));
        }
        System.out.println(dijkstra(nodes, 1, 0)[0]+1);
    }

    public static int[] _01bfs(Node[] nodes, int s) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(s);
        int n = nodes.length;
        int[] d = new int[n];
        boolean[] visited=new boolean[n];
        for (int i = 0; i < n; d[i++] = Integer.MAX_VALUE) ;
        d[s] = 0;
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            if(visited[now]) continue;
            visited[now]=true;
            for (Edge e : nodes[now].edges) {
                int next = e.id;
                int cost = e.cost;
                if (d[next] > d[now]) {
                    if (cost == 0) {
                        dq.addFirst(next);
                    } else {
                        dq.addLast(next);
                    }
                    d[next] = d[now] + cost;
                }
            }
        }
        return d;
    }

    public static long[] dijkstra(Node nodes[], int st, int ed){
        long[] res=new long[nodes.length];
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((u, v)->res[u]>res[v]?1:res[u]<res[v]?-1:0);
        long max=1_000_000_000_000_000l;
        for(int i=0;i<nodes.length;i++){
            res[i]=max;
        }
        res[st]=0;
        pq.add(st);
        while(pq.size()>0){
            int now=pq.poll();
            if(now==ed) return res;
            for(Edge e:nodes[now].edges){
                int next=e.id;
                if(res[now]+e.cost<res[next]){
                    res[next]=res[now]+e.cost;
                    pq.add(next);
                }
            }
        }
        return res;
    }

    static class Node {
        int id;
        int value;
        ArrayList<Edge> edges;

        public Node(int id) {
            this.id = id;
            this.value = Integer.MAX_VALUE;
            edges = new ArrayList<Edge>();
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node))
                return false;
            Node n = (Node) o;
            if (n.id == id)
                return true;
            else
                return false;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    static class Edge {
        int id;
        int cost;
        public Edge(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }
}
