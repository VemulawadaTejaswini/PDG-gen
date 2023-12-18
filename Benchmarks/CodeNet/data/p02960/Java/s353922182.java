import java.util.*;
import java.io.*;

//復習
//覚えていることもあり方針を思いつけたが、以下は覚えておきたい。
// 1. 余りは各桁（10^n倍することに注意）の余りの和で表せる。
//
public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String S = fs.next();
		int len = S.length();
		
		long dp[][] = new long[len+1][13];
		dp[len][0] = 1;
		int mul = 1;
		for(int i=len-1;i>=0;i--) {
			char nowC = S.charAt(i);
			if(nowC != '?') {
				int now = nowC - '0';
				now *= mul;
				for(int j=0;j<13;j++) {
					int next = (j + now )% 13;
					dp[i][next] += dp[i+1][j];
					dp[i][next] %= mod;
				}
			}else {
				for(int k = 0;k<=9;k++ ) {
					int now = k*mul;
					for(int j=0;j<13;j++) {
						int next = (j + now )% 13;
						dp[i][next] += dp[i+1][j];
						dp[i][next] %= mod;
					}
				}
			}
			mul *= 10;
			mul %= 13;
		}
		System.out.println(dp[0][5]);
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}