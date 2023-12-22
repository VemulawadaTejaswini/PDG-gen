import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.ArrayDeque;
public class Main implements Runnable{
    static final int INF = (int)1e9 + 7;
	int V,E;
	int[] distance,prev;
	int[][] cap;
	
	//Edmonds-Karp
	public void bfs(int s){
		Arrays.fill(distance,-1);
		Arrays.fill(prev,-1);
		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		distance[s] = 0;
		
		while(q.size() > 0){
			
			int v = q.poll();
			
			for(int u = 0;u < V;u++){
				if(cap[v][u] > 0 && distance[u] < 0){
					distance[u] = distance[v]+1;
					prev[u] = v;
					q.add(u);
				}
			}
		}
	}
	
    public int max_flow(int s,int t){
        int flow = 0;
        for(;;){
			bfs(s);
			if(distance[t] < 0)break;			
			
			int minFlow = INF;
			for(int u = prev[t],w = t;u != -1;w = u,u = prev[u]){
				minFlow = Math.min(minFlow,cap[u][w]);
			}
			
			for(int u = prev[t],w = t;u != -1;w = u,u = prev[u]){
				cap[u][w] -= minFlow;
				cap[w][u] += minFlow;
			}
			
            flow += minFlow;
        }
		return flow;
    }
	
    public void solve() {
        V = nextInt();
        E = nextInt();
		
		cap = new int[V][V];
		
		distance = new int[V];
		prev = new int[V];
		
        for(int i = 0;i < E;i++){
 
            int u = nextInt();
            int v = nextInt();
            int c = nextInt();
			
			cap[u][v] = c;
        }
 
        out.println(max_flow(0,V-1));
    }
 
    public static void main(String[] args) {
        new Thread(null,new Main(),"",32 * 1024 * 1024).start();
    }
 
    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;
 
    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }
 
    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }
 
    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
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
 
    @Override
    public void run() {
        out.flush();
        new Main().solve();
        out.close();
 
    }
}