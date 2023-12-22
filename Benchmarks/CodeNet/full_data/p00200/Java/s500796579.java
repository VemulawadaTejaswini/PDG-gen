import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	final int INF = (int)1e9 + 7;
	ArrayList<Integer>[] graph;
	int N,M,K;
	int[][] cost,time;
	private class P implements Comparable<P>{
		int x,y;
		public P(int x,int y){
			this.x = x;
			this.y = y;
		}

		public int compareTo(P p){
			return this.y - p.y;
		}

	}
	public int dijkstra(int s,int t,int[][] dis){

		PriorityQueue<P> pq = new PriorityQueue<P>();
		int[] used = new int[M];
		Arrays.fill(used, INF);
		pq.add(new P(s,0));
		used[s] = 0;
		while(pq.size() > 0){
			P p = pq.poll();
			if(used[p.x] < p.y)continue;
			used[p.x] = p.y;
			for(int next : graph[p.x]){
				if(used[next] > p.y + dis[p.x][next]){
					used[next] = p.y + dis[p.x][next];
					pq.add(new P(next,p.y + dis[p.x][next]));
				}
			}
		}
		return used[t];
	}

    @SuppressWarnings("unchecked")
	public void solve() {
    	while(true){
    		N = nextInt();
        	M = nextInt();
        	if(N + M == 0)break;
        	graph = new ArrayList[M];
        	for(int i = 0;i < M;i++){
        		graph[i] = new ArrayList<Integer>();
        	}

        	cost = new int[M][M];
        	time = new int[M][M];
        	for(int i = 0;i < M;i++){
        		for(int j = 0;j < M;j++){
        			cost[i][j] = INF;
        			time[i][j] = INF;
        		}
        	}

        	for(int i = 0;i < N;i++){

        		int a = nextInt() - 1;
        		int b = nextInt() - 1;
        		int c = nextInt();
        		int t = nextInt();

        		cost[a][b] = c;
        		cost[b][a] = c;
        		time[a][b] = t;
        		time[b][a] = t;

        		graph[a].add(b);
        		graph[b].add(a);
        	}

        	K = nextInt();
        	for(int i = 0;i < K;i++){
        		int p = nextInt() - 1;
        		int q = nextInt() - 1;
        		int r = nextInt();

        		if(r == 0){
        			out.println(dijkstra(p,q,cost));
        		}else{
        			out.println(dijkstra(p,q,time));
        		}

        	}
    	}
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
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
}