import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	final int MOD = (int)1e5;
	int N,M,S;
	int[][][] dp;
	public int dfs(int n,int m,int s){
		if(n == N * N){
			if(s == S){
				return 1;
			}
			return 0;
		}

		if(dp[n][m][s] != -1)return dp[n][m][s];

		int ret = 0;
		for(int i = m + 1;i <= M;i++){
			if(s + i <= S){
				ret += dfs(n + 1,i,s + i) % MOD;
				ret %= MOD;
			}
		}
		return dp[n][m][s] = ret;
	}
	public void solve() {
		while(true){
			N = nextInt();
			M = nextInt();
			S = nextInt();

			if(N + M + S == 0)break;

			dp = new int[N * N][M + 1][S + 1];
			for(int i = 0;i < N * N;i++){
				for(int j = 0;j < M + 1;j++){
					for(int k = 0;k < S + 1;k++){
						dp[i][j][k] = -1;
					}
				}
			}
			out.println(dfs(0,0,0));
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