import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	final int INF = (int)1e9 + 7;
	int N,W;
	int[] v,w;
	public void solve() {
		N = nextInt();
		W = nextInt();
		v = new int[N];
		w = new int[N];

		for(int i = 0;i < N;i++){
			v[i] = nextInt();
			w[i] = nextInt();
		}

		int[][] dp = new int[N + 1][100 * 100 + 1];
		for(int i = 0;i < N + 1;i++){
			Arrays.fill(dp[i], INF);
		}
		dp[0][0] = 0;
		for(int i = 0;i < N;i++){
			for(int j = 100 * 100;j >= 0;j--){
				if(dp[i][j] != INF && dp[i][j] + w[i] <= W){
					dp[i + 1][j + v[i]] = Math.min(dp[i + 1][j + v[i]], dp[i][j] + w[i]);
				}
				dp[i + 1][j] = Math.min(dp[i + 1][j],dp[i][j]);
			}
		}
		int ans = 0;
		for(int i = 100 * 100;i >= 0;i--){
			if(dp[N][i] != INF){
				ans = i;
				break;
			}
		}

		out.println(ans);
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