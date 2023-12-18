import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	String s;
	int[] dp;
	public boolean dfs(int n){

		if(n == s.length()){
			return true;
		}

		if(n > s.length()){
			return false;
		}

		if(dp[n] != -1){
			return dp[n] == 0 ? false : true;
		}

		boolean ret = false;

		if(n + 5 <= s.length()){
			String subStr = s.substring(n,n + 5);
			if(subStr.equals("dream") || subStr.equals("erase")){
				ret |= dfs(n + 5);
			}
		}

		if(n + 6 <= s.length()){
			String subStr = s.substring(n,n + 6);
			if(subStr.equals("eraser")){
				ret |= dfs(n + 6);
			}
		}

		if(n + 7 <= s.length()){
			String subStr = s.substring(n,n + 7);
			if(subStr.equals("dreamer")){
				ret |= dfs(n + 7);
			}
		}
		dp[n] = ret ? 1 : 0;
		return ret;
	}

	public void solve() {
		s = next();
		dp = new int[s.length() + 1];
		Arrays.fill(dp, -1);
		out.println(dfs(0) ? "YES" : "NO");

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