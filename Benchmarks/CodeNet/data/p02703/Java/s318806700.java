import java.util.*;
public class Main {

	static long[][] dp;
	static PriorityQueue<S> q;
	
	static class S{
		int a, b;
		long c;
		S(int a, int b, long c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	static void push(int a, int b, long c) {
		if(b < 0)
			return;
		if(dp[a][b] <= c)
			return;
		dp[a][b] = c;
		q.add(new S(a, b, c));
	}
	
	public static void main(String[] args) {
		long INF = Long.MAX_VALUE/10;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		int smax = 50 * N;
		Set<S>[] E = new Set[N];
		for(int i = 0; i < N; i++)
			E[i] = new HashSet<>();
		for(int i = 0; i < M; i++) {
			int U = sc.nextInt()-1;
			int V = sc.nextInt()-1;
			int A = sc.nextInt();
			int B = sc.nextInt();
			E[U].add(new S(V, A, B));
			E[V].add(new S(U, A, B));
		}
		int[] C = new int[N];
		int[] D = new int[N];
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		dp = new long[N][smax+1];
		for(int i = 0; i < N; i++)
			Arrays.fill(dp[i], INF);
		dp[0][Math.min(smax, S)] = 0;
		q = new PriorityQueue<>((p1,p2)->Long.compare(p1.c,p2.c));
		q.add(new S(0, Math.min(smax, S), 0));
		while(q.size() > 0) {
			S s = q.poll();
			if(dp[s.a][s.b] != s.c)
				continue;
			push(s.a, Math.min(s.b + C[s.a], smax), s.c+D[s.a]);
			for(S e : E[s.a])
				push(e.a, s.b-e.b, s.c+e.c);
		}
		for(int i = 1; i < N; i++) {
			long ans = INF;
			for(long t : dp[i])
				ans = Math.min(ans, t);
			System.out.println(ans);
		}
	}

}