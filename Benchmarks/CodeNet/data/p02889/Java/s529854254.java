import java.util.*;

class Main {
	static final int MAX = Integer.MAX_VALUE / 2;
	Scanner sc;
	int N, M, L;
	int[][] C;
	List<Integer>[] to;
	int Q;
	int[] s, t;
	Town[] towns;
	TreeSet<Town> que;
	
	static class Town implements Comparable<Town> {
		int i, cnt, r;
		
		Town(int i, int cnt, int r) {
			this.i = i;
			this.cnt = cnt;
			this.r = r;
		}
		
		@Override
		public int compareTo(Town t) {
			if (cnt != t.cnt) return Integer.compare(cnt, t.cnt);
			if (r != t.r) return Integer.compare(t.r, r);
			if (i != t.i) return Integer.compare(i, t.i);
			return 0;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
		que = new TreeSet<>();
	}
	
	@SuppressWarnings("unchecked")
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		
		C = new int[N][N];
		towns = new Town[N];
		to = new List[N];
		for (int i = 0; i < N; i++) {
			to[i] = new ArrayList<>();
			towns[i] = new Town(i, MAX+i, -1);
		}
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
		for (int i = 0; i < Q; i++) {
			int a = solve(s[i], t[i]);
			System.out.println( (a>=MAX)?-1:a );
		}
	}
	
	private int solve(int s, int t) {
		for (int i = 0; i < N; i++) {
			towns[i].cnt = MAX + i;
			towns[i].r = -1;
		}
		towns[s].cnt = 0;
		towns[s].r = L;
		
		que.clear();
		for (int i = 0; i < N; i++) que.add(towns[i]);
		
		while (!que.isEmpty()) {
			Town tu = que.pollFirst();
			int u = tu.i;
			
			for (int v : to[u]) {
				int c = tu.cnt;
				int re = tu.r;
				if (C[u][v] > L) continue;
				else if (re < C[u][v]) { c++; re = L - C[u][v]; }
				else re -= C[u][v];
				
				Town tv = towns[v];
				if (tv.cnt < c || (tv.cnt==c && tv.r>=re)) continue;
				Iterator<Town> it = que.tailSet(tv, true).iterator();
				it.next(); it.remove();
				
				tv.cnt = c; tv.r = re;
				que.add(tv);
			}
		}
		return towns[t].cnt;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
