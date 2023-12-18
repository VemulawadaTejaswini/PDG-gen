import java.util.*;
import java.io.*;

public class Main {

	static int N, M, S, T, dp[];
	static List<ArrayList<Integer>> to;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		N = fs.nextInt();
		M = fs.nextInt();
		to = new ArrayList<>();
		for(int i=0;i<N;i++)to.add(new ArrayList<Integer>());
		for(int i=0;i<M;i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			to.get(v).add(u); //逆向きにする
		}
		S = fs.nextInt()-1;
		T = fs.nextInt()-1;
		
		dp = new int[N];
		Arrays.fill(dp, -1);
		dfs(T, 0, 0);
		System.out.println(dp[S]);
	}
	static void dfs(int v, int cnt, int mod3) {
		if(mod3 == 0) {
			if(dp[v] != -1 && dp[v]< cnt)return;
			dp[v] = cnt;
			cnt ++;
		}
		mod3 += 1;
		mod3 %= 3;
		for(int next : to.get(v)) {
			dfs(next, cnt, mod3);
		}
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