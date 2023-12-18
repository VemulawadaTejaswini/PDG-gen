import java.util.*;
import java.io.*;

public class Main {
	
	static int N, M, P;
	static long dp[];
	static long visited[];
	static ArrayList<int[]> to[];
	static int INF = Integer.MAX_VALUE/2;
	static boolean cannotGoal;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		N = fs.nextInt();
		M = fs.nextInt();
		P = fs.nextInt();
		to = new ArrayList[N]; 
		for(int i=0;i<N;i++)to[i] = new ArrayList<int[]>();
		for(int i=0;i<M;i++) {
			int A = fs.nextInt()-1, B = fs.nextInt()-1, C = fs.nextInt();
			int t[] = {B, C};//頂点、拾えるコイン
			to[A].add(t);
		}
		
		//毎回の移動で拾えるコインを-P枚することで、ゴールにいつたどり着いても良い単純な最大化にできる
		dp = new long[N];//頂点KからNまで向かうのに獲得できるコインの枚数
		Arrays.fill(dp, -1);
		visited = new long[N];
		Arrays.fill(visited, -1);
		cannotGoal = false;
		long ans = Math.max(0,rec(0, 0, false));
		if(cannotGoal) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
	}
	static long rec(int v, long sum, boolean fromGoal) {

		boolean last = false;
		if (v==N-1) {
			last = true;
			visited[v]=sum;
		}
		if(dp[v]!=-1)return dp[v];
		long ret = -INF;
		boolean loopable = false;
		for(int next[]:to[v]) {
			int nextNode = next[0];
			int coin = next[1] - P;
			if(nextNode == v) {
				if(coin<=0)continue;
				else {
					loopable = true;
					continue;
				}
			}
			if((!last||fromGoal)&&visited[v]!=-1) {
				if(sum>visited[v]) {
					cannotGoal = true;
				}
				else continue; //この道はもう止めていい
			}
			if(last)fromGoal = true;
			ret = Math.max(ret, rec(nextNode, sum, fromGoal)+coin);
		}
		visited[v]=sum;
		if(last) if(ret > 0) cannotGoal = true;	
		if(loopable&&(ret>0||last)) cannotGoal = true;
		if(last)ret = 0;
		return dp[v]=ret;
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