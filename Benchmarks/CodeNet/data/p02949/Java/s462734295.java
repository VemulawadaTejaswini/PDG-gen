import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        Bellman_Ford bf = new Bellman_Ford(n,m);
        for(int i = 0; i < m; i++){
            int s = sc.nextInt()-1;
            int g = sc.nextInt()-1;
            int cost = sc.nextInt();
            bf.edges[i] = new Edge(s,g,-cost+p);
        }
        bf.bellman_ford(0);
        bf.find_negative_loop();
        if(!bf.negative[n-1]){
            System.out.println(Math.max(0L,-bf.d[n-1]));
        }else{
            System.out.println(-1);
        }
        
    }
    
}
class Edge {
    int from,to,cost;
    public Edge(int f, int t, int c){
        this.from = f;
        this.to = t;
        this.cost = c;
    }
}
    	

class Bellman_Ford {
    static int V;
    static int E;
    static Edge[] edges;
    static int[] d;
    static int INF = Integer.MAX_VALUE / 2;
    static boolean[] negative;
    
    public Bellman_Ford(int n, int m){
        this.V = n;
        this.E = m;
        this.edges = new Edge[m];
        this.d = new int[n];
        this.negative = new boolean[V];
    }
    
    static void find_negative_loop(){
    	for(Edge e : edges){
    		if(d[e.to]!=INF && d[e.to] > d[e.from] + e.cost){
    			d[e.to] = d[e.from] + e.cost;
    			negative[e.from] = true;
    		}
    		if(negative[e.from]) negative[e.to] = true;
    	}
	}
    	
    static boolean bellman_ford(int sv) {
    	d = new int[V];
    	Arrays.fill(d, INF); 
    	d[sv] = 0;
    	for(int i = 0; i < E; i++) {
        	int t = edges[i].to;
        	int f = edges[i].from;
        	int c = edges[i].cost;
        	if(d[f] != INF && d[f] + c < d[t]) {
        		d[t] = d[f] + c;
        	}
        }
    	return true;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
