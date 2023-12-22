import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;

public class Main {
    ArrayList<Edge>[] graph;
    int V, E;
    
    private class Edge implements Comparable<Edge> {
        int to, cost;
        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }
    }
    
    @SuppressWarnings("unchecked")
    public void solve() {
        V = nextInt();
        E = nextInt();
        graph = new ArrayList[V];
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for(int i = 0; i < E; i++) {
            int s = nextInt();
            int t = nextInt();
            int w = nextInt();
            
            graph[s].add(new Edge(t, w));
            graph[t].add(new Edge(s, w));
        }
        
        int num = 1;
        int sum = 0;
        boolean[] used = new boolean[V];
        used[0] = true;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        for(Edge e : graph[0]) {
            pq.add(e);
        }
        
        while(pq.size() > 0) {
            Edge e = pq.poll();
            if(used[e.to]) continue;
            used[e.to] = true;
            num++;
            sum += e.cost;
            if(num == V) break;
            for(Edge next : graph[e.to]) {
                if(used[next.to]) continue;
                pq.add(next);
            }
        }
        
        out.println(sum);
    }
    
    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }
    
    //Input
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;
    
    private boolean hasNextByte() {
        if(p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        }catch(IOException e) {
            e.printStackTrace();
        }
        if(buflen <= 0)
            return false;
        
        return true;
    }
    
    public boolean hasNext() {
        while(hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }
    
    private boolean isPrint(int ch) {
        if(ch >= '!' && ch <= '~')
            return true;
        
        return false;
    }
    
    private int nextByte() {
        if(!hasNextByte())
            return -1;
        
        return buffer[p++];
    }
    
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while(isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }
    public int nextInt() {
        return Integer.parseInt(next());
    }
    
    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
