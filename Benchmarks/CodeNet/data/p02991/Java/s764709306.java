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
		int INF = Integer.MAX_VALUE/2;
		Arrays.fill(dp, INF);
		
		//BFS
		Queue<int[]> q = new ArrayDeque<>();
		int start[] = {T, 2, 0}; 
		q.add(start);

		while(!q.isEmpty()) {
			int nowArr[] = q.poll();
			int now = nowArr[0];
			int cnt = nowArr[2];
			int beforeMod3 = nowArr[1];
			int nowMod3 = (beforeMod3 + 1 )% 3;
			if(nowMod3 == 0) {
				dp[now]=cnt;
				cnt ++;
			}
			for(int next : to.get(now)) {
				if(dp[next]!=INF && (nowMod3+1)%3==0)continue;
				int nextArr[] = {next, nowMod3, cnt};
				q.offer(nextArr);
			}
		}
		System.out.println(dp[S]==INF? -1 : dp[S]);
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