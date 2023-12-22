import java.util.*;

class MaxFlow {
    public class CapEdge {
        private final int from, to;
        private long cap;
        private final int rev;
        CapEdge(int from, int to, long cap, int rev) {
            this.from = from;
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
        public int getFrom()  {return from;}
        public int getTo()    {return to;}
        public long getCap()  {return cap;}
        public long getFlow() {return g[to][rev].cap;}
    }

    private static final long INF = Long.MAX_VALUE;

    private final int n;
    private int m;
    private final java.util.ArrayList<CapEdge> edges;
    private final int[] count;
    private final CapEdge[][] g;

    public MaxFlow(int n) {
        this.n = n;
        this.edges = new java.util.ArrayList<>();
        this.count = new int[n];
        this.g = new CapEdge[n][];
    }

    public int addEdge(int from, int to, long cap) {
        vertexRangeCheck(from);
        vertexRangeCheck(to);
        capNonNegativeCheck(cap);
        CapEdge e = new CapEdge(from, to, cap, count[to]);
        count[from]++; count[to]++;
        edges.add(e);
        return m++;
    }

    public CapEdge getEdge(int i) {
        edgeRangeCheck(i);
        return edges.get(i);
    }

    public java.util.ArrayList<CapEdge> getEdges() {
        return edges;
    }

    public void changeEdge(int i, long newCap, long newFlow) {
        edgeRangeCheck(i);
        capNonNegativeCheck(newCap);
        if (newFlow > newCap) {
            throw new IllegalArgumentException(
                String.format("Flow %d is greater than capacity %d.", newCap, newFlow)
            );
        }
        CapEdge e = edges.get(i);
        CapEdge er = g[e.to][e.rev];
        e.cap = newCap - newFlow;
        er.cap = newFlow;
    }

    private void buildGraph() {
        for (int i = 0; i < n; i++) {
            g[i] = new CapEdge[count[i]];
        }
        int[] idx = new int[n];
        for (CapEdge e : edges) {
            g[e.to][idx[e.to]++] = new CapEdge(e.to, e.from, 0, idx[e.from]);
            g[e.from][idx[e.from]++] = e;
        }
    }

    public long maxFlow(int s, int t) {
        return flow(s, t, INF);
    }

    public long flow(int s, int t, long flowLimit) {
        vertexRangeCheck(s);
        vertexRangeCheck(t);
        buildGraph();
        long flow = 0;
        int[] level = new int[n];
        int[] que = new int[n];
        int[] iter = new int[n];
        while (true) {
            java.util.Arrays.fill(level, -1);
            dinicBFS(s, t, level, que);
            if (level[t] < 0) return flow;
            java.util.Arrays.fill(iter, 0);
            while (true) {
                long d = dinicDFS(t, s, flowLimit - flow, iter, level);
                if (d <= 0) break;
                flow += d;
            }
        }
    }

    private void dinicBFS(int s, int t, int[] level, int[] que) {
        int hd = 0, tl = 0;
        que[tl++] = s;
        level[s] = 0;
        while (tl > hd) {
            int u = que[hd++];
            for (CapEdge e : g[u]) {
                int v = e.to;
                if (e.cap <= 0 || level[v] >= 0) continue;
                level[v] = level[u] + 1;
                if (v == t) return;
                que[tl++] = v;
            }
        }
    }

    private long dinicDFS(int cur, int s, long f, int[] iter, int[] level) {
        if (cur == s) return f;
        long res = 0;
        while (iter[cur] < count[cur]) {
            CapEdge er = g[cur][iter[cur]++];
            int u = er.to;
            CapEdge e = g[u][er.rev];
            if (level[u] >= level[cur] || e.cap <= 0) continue;
            long d = dinicDFS(u, s, Math.min(f - res, e.cap), iter, level);
            if (d <= 0) continue;
            e.cap -= d;
            er.cap += d;
            res += d;
            if (res == f) break;
        }
        return res;
    }

    public long fordFulkersonMaxFlow(int s, int t) {
        return fordFulkersonFlow(s, t, INF);
    }

    public long fordFulkersonFlow(int s, int t, long flowLimit) {
        vertexRangeCheck(s);
        vertexRangeCheck(t);
        buildGraph();
        boolean[] used = new boolean[n];
        long flow = 0;
        while (true) {
            java.util.Arrays.fill(used, false);
            long f = fordFulkersonDFS(s, t, flowLimit - flow, used);
            if (f <= 0) return flow;
            flow += f;
        }
    }

    private long fordFulkersonDFS(int cur, int t, long f, boolean[] used) {
        if (cur == t) return f;
        used[cur] = true;
        for (CapEdge e : g[cur]) {
            if (used[e.to] || e.cap <= 0) continue;
            long d = fordFulkersonDFS(e.to, t, Math.min(f, e.cap), used);
            if (d <= 0) continue;
            e.cap -= d;
            g[e.to][e.rev].cap += d;
            return d;
        }
        return 0;
    }

    public boolean[] minCut(int s) {
        vertexRangeCheck(s);
        boolean[] reachable = new boolean[n];
        int[] stack = new int[n];
        int ptr = 0;
        stack[ptr++] = s;
        reachable[s] = true;
        while (ptr > 0) {
            int u = stack[--ptr];
            for (CapEdge e : g[u]) {
                int v = e.to;
                if (reachable[v] || e.cap <= 0) continue;
                reachable[v] = true;
                stack[ptr++] = v;
            }
        }
        return reachable;
    }

    private void vertexRangeCheck(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d", i, n)
            );
        }
    }

    private void edgeRangeCheck(int i) {
        if (i < 0 || i >= m) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d", i, m)
            );
        }
    }

    private void capNonNegativeCheck(long cap) {
        if (cap < 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", cap)
            );
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        for(int n=0; n<N; n++){
            String S = sc.next();
            for(int m=0; m<M; m++) board[n][m] = S.charAt(m);
        }

        MaxFlow G = new MaxFlow(N*M+2);
        int s = N*M, t = N*M+1;

        for(int i=0; i<N; i++) for(int j=0; j<M; j++){
            if(board[i][j] == '#') continue;
            int v = i*M+j;
            if((i+j)%2==0) G.addEdge(s, v, 1);
            else G.addEdge(v, t, 1);
        }

        for(int i=0; i<N; i++) for(int j=0; j<M; j++){
            if((i+j)%2 != 0 || board[i][j]=='#') continue;
            int v0 = i*M+j;
            if(i!=0 && board[i-1][j]=='.') G.addEdge(v0, (i-1)*M+j, 1);
            if(j!=0 && board[i][j-1]=='.') G.addEdge(v0, i*M+j-1, 1);
            if(i+1<N && board[i+1][j]=='.') G.addEdge(v0, (i+1)*M+j, 1);
            if(j+1<M && board[i][j+1]=='.') G.addEdge(v0, i*M+j+1, 1);
        }

        System.out.println(G.maxFlow(s, t));

        List<MaxFlow.CapEdge> edges = G.getEdges();
        for(MaxFlow.CapEdge e:edges){
            if(e.getFrom() == s || e.getTo() == t || e.getFlow() == 0) continue;
            int i0 = e.getFrom() / M, j0 = e.getFrom() % M, i1 = e.getTo() / M, j1 = e.getTo() % M;
            if(i0 == i1+1){
                board[i1][j1] = 'v';
                board[i0][j0] = '^';
            }else if(j0 == j1+1){
                board[i1][j1] = '>';
                board[i0][j0] = '<';
            }else if(i0 == i1-1){
                board[i0][j0] = 'v';
                board[i1][j1] = '^';
            }else{
                board[i0][j0] = '>';
                board[i1][j1] = '<';
            }
        }

        for(int n=0; n<N; n++){
            for(int m=0; m<M; m++) System.out.print(board[n][m]);
            System.out.println();
        }
        
    }
}