import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	double[][] dp;
	double[][] g;
	int N,M;
	public void solve() {
		while (true) {
			N = nextInt();
			M = nextInt();
			if(N + M == 0)break;
			g = new double[N][N];
			dp = new double[M + 1][N];
			for(int i = 0;i < N;i++){
				for(int j = 0;j < N;j++){
					g[i][j] = nextDouble();
				}
			}
			for(int i = 0;i < N;i++){
				dp[0][i] = 1.0;
			}
			for(int i = 0;i < M;i++){
				for(int j = 0;j < N;j++){
					for(int k = 0;k < N;k++){
						dp[i + 1][k] = Math.max(dp[i + 1][k],dp[i][j] * g[j][k]);
					}
				}
			}
			double ans = 0;
			for(int i = 0;i < N;i++){
				ans = Math.max(dp[M - 1][i],ans);
			}
			out.println(String.format("%.09f", ans));
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