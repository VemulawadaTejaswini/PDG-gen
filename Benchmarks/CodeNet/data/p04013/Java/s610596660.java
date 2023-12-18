import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int N,A;
	int[] x;
	long[][][] dp;
	public long dfs(int n,int sum,int c){

		if(n == N){
			if(c > 0 && sum % c == 0 && sum / c == A){
				return 1;
			}else{
				return 0;
			}
		}

		if(dp[n][sum][c] != -1)return dp[n][sum][c];

		long ret = 0;
		ret += dfs(n + 1,sum + x[n],c + 1);
		ret += dfs(n + 1,sum,c);
		return dp[n][sum][c] = ret;
	}

	public void solve() {
		N = nextInt();
		A = nextInt();
		x = new int[N];
		for(int i = 0;i < N;i++){
			x[i] = nextInt();
		}
		dp = new long[N + 1][2500 + 1][50 + 1];
		for(int i = 0;i <= N;i++){
			for(int j = 0;j <= 2500;j++){
				for(int k = 0;k <= 50;k++){
					dp[i][j][k] = -1;
				}
			}
		}
		out.println(dfs(0,0,0));
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