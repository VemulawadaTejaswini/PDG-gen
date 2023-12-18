import java.util.*;
import java.io.*;

public class Main {
	static boolean reachableFrom1[], reachableToN[], ok[];
	static List<ArrayList<Integer>> to, rto;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), M = fs.nextInt();
		int edges[][] = new int[M][3];
		to = new ArrayList<>();
		rto = new ArrayList<>();
		for(int i=0;i<N;i++) {
			to.add(new ArrayList<Integer>()); 
			rto.add(new ArrayList<Integer>()); 
		}
		for(int i=0;i<M;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1, c = fs.nextInt();
			edges[i][0] = a;
			edges[i][1] = b;
			edges[i][2] = -c; //ここを負の数にすることで、最短経路問題にできる。
			//負閉路があった場合は、スコアをいくらでも大きくできるので、infと出力。
			to.get(a).add(b);
			rto.get(b).add(a);
		}
		//前処理：１からたどり着けないノードと、Nまでたどり着けないノードを取り除く
		reachableFrom1 = new boolean[N];
		reachableToN = new boolean[N];
		dfs(0);
		rdfs(N-1);
		ok = new boolean[N];
		for(int i=0;i<N;i++)ok[i] = reachableFrom1[i]&&reachableToN[i];
		
		//Bellman Ford
		long dp[] = new long[N];
		long INF = Long.MAX_VALUE/2;
		Arrays.fill(dp, INF);
		dp[0]=0;
		boolean upd = true;
		int cnt = 0;
		while(upd) {
			upd = false;
			for(int now[]:edges) {
				int from = now[0];
				int to = now[1];
				int dist = now[2];
				if(!(ok[from]&&ok[to]))continue;
				if(dp[from]+dist<dp[to]) {
					upd = true;
					dp[to]= dp[from]+dist;
				}
			}
			cnt++;
			if(cnt > N+3) {
				System.out.println("inf");
				return;
			}
		}
		System.out.println(-dp[N-1]);
	}
	static void dfs(int v) {
		if(reachableFrom1[v]==true)return;
		reachableFrom1[v]=true;
		for(int next:to.get(v)) {
			dfs(next);
		}
	}
	static void rdfs(int v) {
		if(reachableToN[v]==true)return;
		reachableToN[v]=true;
		for(int next:rto.get(v)) {
			rdfs(next);
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