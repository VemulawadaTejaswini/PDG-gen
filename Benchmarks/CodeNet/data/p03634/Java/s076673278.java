import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] cost = new long[N+1];
		HashMap<Integer, ArrayList<Edge>> adjl = new HashMap<Integer, ArrayList<Edge>>();
		for(int i=0; i<N; i++) {
			adjl.put(i+1, new ArrayList<Edge>());
		}
		for(int i=0; i<N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long c = sc.nextLong();
			adjl.get(a).add(new Edge(b, c));
			adjl.get(b).add(new Edge(a, c));
		}
		int Q = sc.nextInt();
		int K = sc.nextInt();
		boolean[] visited = new boolean[N+1];
		long[] d = new long[N+1];
		for(int i=0; i<N+1; i++) {
			visited[i] = false;
		}
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(K);
		while(!dq.isEmpty()) {
			int cur = dq.poll();
			visited[cur] = true;
			for(Edge e : adjl.get(cur)) {
				if(visited[e.next]) continue;
				dq.add(e.next);
				d[e.next] = d[cur] + e.weight;
			}
		}
		long[] ans = new long[Q];
		for(int i=0; i<Q; i++) {
//			print("Z");
			int x = sc.nextInt();
//			print("A");
			int y = sc.nextInt();
//			print("B");
			ans[i] = d[x] + d[y];
//			print("C");
		}
		for(int i=0; i<Q; i++) {
			System.out.println(ans[i]);
		}
	}
		
	static class Edge {
		int next;
		long weight;
		Edge(int next, long weight) {
			this.next = next;
			this.weight = weight;
		}
	}
	
	// print
	static void print(String s) {
		System.out.println(s);
	}
	
	// union find lib
	// usage:
	// 最初にinitを呼ぶ
	// root: 直接は呼ばないで
	// unite: まとめる
	// same: グループ判定
	static void init(int par[], int N) {
		for(int i=0; i<N; i++) {
			par[i] = i;
		}
	}
	
	static int root(int x, int [] par) {
		if(par[x] == x) {
			return x;
		} else {
			return (par[x] = root(par[x], par));
		}
	}
	
	static boolean same(int x, int y, int[] par) {
		return root(x, par) == root(y, par);
	}
	
	static void unite(int x, int y, int[] par) {
		x = root(x, par);
		y = root(y, par);
		if(x == y) return;
		par[x] = y;
	}
	
	// end union find lib
	
	// number lib
	
	static long lcm(long a, long b) {
		return a*(b/gcd(a, b));
	}
	
	static long gcd(long a, long b) {
		long ta = Math.max(a, b);
		long tb = Math.min(a, b);
		long tmp;
		while((tmp = ta%tb) != 0) {
			ta = tb;
			tb = tmp;
		}
		return tb;
	}
	
	static long modcomb(long n, long k, long mod) {
		if(k==1) {
			return n;
		}
		
		long ans = 1;
		for(long i=n; i>=n-k+1; i--) {
			ans = (ans * i)%mod;
		}
		for(long i=k; 0<i; i--) {
			ans = (ans * modpow(i, mod-2, mod)) % mod;
		}
		return ans;
	}
	
	static long modpow(long a, long b, long mod) {
		if(b==0) return 1;
		if(b%2==0) {
			long d = modpow(a, b/2, mod);
			return (d*d)%mod;
		} else {
			return (a*modpow(a, b-1, mod))%mod;
		}
	}
	
	static int disit(long a, long d) {
		int count = 0;
		while(a!=0) {
			a = a/d;
			count++;
		}
		return count;
	}
	
	// end number lib
}