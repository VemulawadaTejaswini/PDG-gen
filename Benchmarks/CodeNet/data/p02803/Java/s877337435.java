import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int MAX = 500;
	int INF = 1<<29;
	int[] dx = {1, 0, -1, 0};
	int[] dy = {0, 1, 0, -1};
	int[][] dp = new int[MAX][MAX];
	int H,W;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		H = nextInt(); W = nextInt();
	    String[][] s = new String [H][W];
	    for (int i = 0; i < H; ++i) s[i] = next().split("");

	    // 初期化
	    for (int i = 0; i < MAX; ++i) {
	        for (int j = 0; j < MAX; ++j) dp[i][j] = INF;
	        dp[i][i] = 0; // これを忘れないように
	    }


	    // make graph
	    for (int x = 0; x < H; ++x) {
	        for (int y = 0; y < W; ++y) {
	            if (s[x][y].equals("#")) continue;
	            for (int dir = 0; dir < 4; ++dir) {
	                int nx = x + dx[dir], ny = y + dy[dir];
	                if (nx < 0 || nx >= H || ny < 0 || ny >= W || s[nx][ny].equals("#"))continue;
	                dp[id(x, y)][id(nx, ny)] = 1;
	                dp[id(nx, ny)][id(x, y)] = 1;
	            }
	        }
	    }

	    // Floyd--Warshall
	    int V = H*W;
	    for (int k = 0; k < V; ++k)
	        for (int i = 0; i < V; ++i)
	            for (int j = 0; j < V; ++j)
	            	dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);

	    int res = 0;
	    for (int x = 0; x < H; ++x) {
	        for (int y = 0; y < W; ++y) {
	            if (s[x][y].equals("#")) continue;
	            for (int x2 = 0; x2 < H; ++x2) {
	                for (int y2 = 0; y2 < W; ++y2) {
	                    if (s[x2][y2].equals("#")) continue;
	                    res = Math.max(res, dp[id(x, y)][id(x2, y2)]);
	                }
	            }
	        }
	    }
	    out.println(res);
	}
	public int id (int x,int y) {
		return x * W + y;
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

	long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	}
}