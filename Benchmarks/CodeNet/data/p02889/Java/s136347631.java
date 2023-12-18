import java.util.*;

class Main {
	static final int MAX = Integer.MAX_VALUE / 2;
	Scanner sc;
	int N, M, L;
	int[][] C;
	List<Integer>[] to;
	int[] s, t;
	int Q;
	int[] cnt, r;
	List<Integer> que;
	int[][] ans;
	
	public Main() {
		sc = new Scanner(System.in);
		que = new ArrayList<>();
	}
	
	@SuppressWarnings("unchecked")
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		C = new int[N][N];
		cnt = new int[N];
		r = new int[N];
		to = new List[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			to[A].add(B);
			to[B].add(A);
			C[A][B] = sc.nextInt();
			C[B][A] = C[A][B];
		}
		Q = sc.nextInt();
		s = new int[Q];
		t = new int[Q];
		for (int i = 0; i < Q; i++) {
			s[i] = sc.nextInt()-1;
			t[i] = sc.nextInt()-1;
		}
		ans = new int[N][N];
		for (int i = 0; i < N; i++) solve(i);
		for (int i = 0; i < Q; i++) {
			int a = ans[s[i]][t[i]];
			System.out.println( (a>=MAX)?-1:a );
		}
	}
	
	private void solve(int s) {
		Arrays.fill(cnt, MAX);
		Arrays.fill(r, 0);
		que.clear();
		cnt[s] = 0;
		r[s] = L;
		for (int i = 0; i < N; i++) que.add(i);
		while (!que.isEmpty()) {
			int u = -1;
			int minr = -1;
			int minc = MAX;
			for (int n : que) {
				if (cnt[n] < minc || (cnt[n]==minc && r[n]>minr)) {
					u = n; minr = r[n]; minc = cnt[n];
				}
			}
			que.remove(Integer.valueOf(u));
			for (int v : to[u]) {
				int c = cnt[u];
				int re = r[u];
				if (C[u][v] > L) c = MAX;
				else if (re < C[u][v]) { c++; re = L - C[u][v]; }
				else re -= C[u][v];
				if (cnt[v] < c || (cnt[v]==c && r[v]>=re)) continue;
				cnt[v] = c;
				r[v] = re;
			}
		}
		for (int i = 0; i < N; i++)
			if (i != s) ans[s][i] = ans[i][s] = cnt[i];
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
