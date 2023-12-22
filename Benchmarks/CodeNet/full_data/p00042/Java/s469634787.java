import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	int W,N;
	int[] v,w;
	int[] dp;
	public void solve(){
		for(int cc = 1;;cc++){
			W = nextInt();
			if(W == 0)break;
			
			N = nextInt();
			v = new int[N];
			w = new int[N];
			for(int i = 0;i < N;i++){
				String[] s = next().split(",");
				v[i] = Integer.parseInt(s[0]);
				w[i] = Integer.parseInt(s[1]);
			}
			
			dp = new int[W + 1];
			for(int i = 1;i <= N;i++){
				for(int j = W;j >= 0;j--){
					if(j + w[i - 1] <= W)dp[j + w[i - 1]] = Math.max(dp[j + w[i - 1]],dp[j] + v[i - 1]);
				}
			}
			int ans = 0;
			for(int j = 0;j <= W;j++){
				if(dp[ans] < dp[j]){
					ans = j;
				}
			}
			out.println("Case "+cc+":");
			out.println(dp[ans]);
			out.println(ans);
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