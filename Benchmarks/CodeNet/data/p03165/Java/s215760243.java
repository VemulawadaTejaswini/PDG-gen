import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static int memo[][];
	static char x[][];
	static int H, W;
	static String s,t;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		t=sc.next();
		memo=new int[s.length()][t.length()];
		for (int i = 0; i < memo.length; i++) Arrays.fill(memo[i], -1);		
		trace(0,0);
		out.flush();

	}
	static void trace(int i,int j) {
		if (i==s.length()||j==t.length()) return;
		if (s.charAt(i)==t.charAt(j)) {
			out.print(s.charAt(i));
			trace(i+1,j+1);
		}
		else {
			if(dp(i+1,j)>dp(i,j+1)) {
				trace(i+1,j);
			}
			else {
				trace(i,j+1);
			}
		}

	}

	static final int mod = (int) (1e9 + 7);
	static int dp(int i,int j) {
		if (i==s.length()||j==t.length()) {
			return 0;
		}
		if (memo[i][j]!=-1) {
			return memo[i][j];
		}
		if (s.charAt(i)==t.charAt(j)) {
			return 	memo[i][j]=1+dp(i+1,j+1);
		}
		else {
			int take=dp(i+1,j);
			int leave=dp(i,j+1);
			return memo[i][j]=Math.max(take, leave);
		}
	}






	static class O implements Comparable<O> {
		int from;
		int to;

		O(int f, int t) {
			from = f;
			to = t;
		}

		@Override
		public int compareTo(O o) {
			return this.from - o.from;
		}

	}

	static boolean func(long x, long s) {
		long k = 0;
		long xi = x;
		while (x > 0) {
			k += x % 10;
			x /= 10;
		}
		return xi - k >= s;

	}

	static boolean isSorted(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1])
				return false;
		}
		return true;
	}

	static ArrayList<Integer> adjList[];
	static int visited[];

	static void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s] = 1;
		int i = 1;
		while (!q.isEmpty()) {
			int u = q.remove();

			for (int v : adjList[u])
				if (visited[v] == 0) {
					visited[v] = visited[u] + i;
					q.add(v);
				}
			i++;
		}
	}

	static class UnionFind {
		int[] p, rank, setSize;
		int numSets;

		public UnionFind(int N) {
			p = new int[numSets = N];
			rank = new int[N];
			setSize = new int[N];
			for (int i = 0; i < N; i++) {
				p[i] = i;
				setSize[i] = 1;
			}
		}

		public int findSet(int i) {
			return p[i] == i ? i : (p[i] = findSet(p[i]));
		}

		public boolean isSameSet(int i, int j) {
			return findSet(i) == findSet(j);
		}

		public void unionSet(int i, int j) {
			if (isSameSet(i, j))
				return;
			numSets--;
			int x = findSet(i), y = findSet(j);
			if (rank[x] > rank[y]) {
				p[y] = x;
				setSize[x] += setSize[y];
			} else {
				p[x] = y;
				setSize[y] += setSize[x];
				if (rank[x] == rank[y])
					rank[y]++;
			}
		}

		public int numDisjointSets() {
			return numSets;
		}

		public int sizeOfSet(int i) {
			return setSize[findSet(i)];
		}
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

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public Double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

	}
}