import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	static final int INF = (int)1e9 + 7;
	int V,E;
	int[][] cost;
	int[][][] dp;
	public int dfs(int s,int n,int v){
		if(n == V){
			return 0;
		}
		if(dp[s][n][v] != -1)return dp[s][n][v];
		int ret = INF;
		for(int i = 0;i < V;i++){
			if(cost[s][i] == -1)continue;
			if(((v >> i)&1)==1)continue;
			ret = Math.min(ret,dfs(i,n + 1,(v | (1 << i))) + cost[s][i]);
		}
		return dp[s][n][v] = ret;
	}
	
    public void solve() {
		V = nextInt();
		E = nextInt();
		
		cost = new int[V][V];
		dp = new int[V + 1][V + 1][1 << V];
		for(int i = 0;i < V + 1;i++){
			for(int j = 0;j < V + 1;j++){
				Arrays.fill(dp[i][j],-1);
			}
		}
		for(int i = 0;i < V;i++)Arrays.fill(cost[i],-1);
		for(int i = 0;i < E;i++){
			
			int s = nextInt();
			int t = nextInt();
			int d = nextInt();
			cost[s][t] = d;
		}
		int ans = dfs(0,0,0);
		out.println(ans == INF ? - 1 : ans);
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