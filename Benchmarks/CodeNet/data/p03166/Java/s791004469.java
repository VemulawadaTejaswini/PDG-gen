

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static Map<Integer,List<Integer>> map = new HashMap();
    static int dp[] = new int[100001];
    
	static void solve() {
		int n = in.nextInt();
		int edges = in.nextInt();
		int[] dp = new int[n + 1];
		
		int ans = 0;
		for(int i = 0; i < edges; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if(!map.containsKey(a)) map.put(a, new ArrayList());
			map.get(a).add(b);
		}
		
		for(int i = 1; i < n; i++) ans = Math.max(ans, dfs(i));
		
		System.out.println(ans);
		
	}
	
	static int dfs(int cur)
	{
		int tmp = 0;
		if(dp[cur] != 0) return dp[cur];
		
		if(!map.containsKey(cur))
			return 0;
		for(int next : map.get(cur))
			tmp = Math.max(tmp, dfs(next) + 1);
		
		dp[cur] = tmp;
		return tmp;
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}



