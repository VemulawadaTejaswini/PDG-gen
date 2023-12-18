import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static ArrayList<Long>[] pre, suf;
	static int n, m;
	static long[] par, ans;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		m = sc.nextInt();
		ad = new ArrayList[n];
		pre = new ArrayList[n];
		suf = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			ad[i] = new ArrayList<>();
			pre[i] = new ArrayList<>();
			suf[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			ad[a].add(b);
			ad[b].add(a);
		}
		par = new long[n];
		ans = new long[n];
		idc=new int [n];
		dfs(0, -1);
		up(0, -1);
		for (int i = 0; i < n; i++)
			out.println(ans[i] * par[i] % m);
		out.flush();
	}

	static void dfs(int u, int p) {
		par[u] = 1;
		for (int v : ad[u])
			if (v != p) {
				dfs(v, u);
				par[u] = par[u] * (par[v] + 1)%m;
				idc[v]=pre[u].size();
				pre[u].add(par[v] + 1);
				suf[u].add(par[v] + 1);
			}
		for (int i = 1; i < pre[u].size(); i++)
			pre[u].set(i, pre[u].get(i) * pre[u].get(i - 1) % m);
		for (int i = suf[u].size() - 2; i >= 0; i--)
			suf[u].set(i, suf[u].get(i) * suf[u].get(i + 1) % m);
	}
static int []idc;
	static void up(int u, int p) {
		if (p != -1) {	
			ans[u]=ans[p];
			if(idc[u]!=0)
				ans[u]=ans[u]*pre[p].get(idc[u]-1)%m;
			if(idc[u]!=pre[p].size()-1)
				ans[u]=ans[u]*suf[p].get(idc[u]+1)%m;
		}
		ans[u]++;
		for (int v : ad[u])
			if (v != p)
				up(v, u);
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}