import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}
	static long modinv(long n){
		return modpow(n , MOD - 2);
	}
	static long comb(int N , int R, long fact[]){
		long ret = fact[N];
		ret = (ret * modinv(fact[R])) % MOD;
		ret = (ret * modinv(fact[N - R])) % MOD;
		return ret;
	}
	static class Edge{
		int src;
		int dst;
		int idx;
		public Edge(int src , int dst , int idx) {
			this.src = src;
			this.dst = dst;
			this.idx = idx;
		}
	}
	static class Vertex{
		List<Edge> adj;
		public Vertex() {
			adj = new ArrayList<Edge>();
		}
	}
	static long[] rec(int cur , Vertex[] vs , long memo[] , long memoSize[] , int parent){
		long size = 1;
		long pattern = 1;
		for(Edge e : vs[cur].adj){
			if(e.dst == parent){
				continue;
			}
			if(memo[e.idx] < 0){
				long r[] = rec(e.dst , vs , memo , memoSize , cur);
				memoSize[e.idx] = r[0];
				memo[e.idx] = r[1];
			}
			size += memoSize[e.idx];
		}
		int S = (int)size - 1;
		for(Edge e : vs[cur].adj){
			if(e.dst == parent){
				continue;
			}
			int s = (int)memoSize[e.idx];
			pattern = (pattern * comb(S, s, fact)) % MOD;
			pattern = (pattern * memo[e.idx]) % MOD;
			S -= s;
		}
		long ret[] = {size, pattern};
		return ret;
	}
	static long[] fact;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fact = new long[N + 1];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length ; ++i){
			fact[i] = ((long)(i) * fact[i - 1]) % MOD;
		}
		Vertex vs[] = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		int E = N - 1;
		for(int i = 0 ; i< N -1 ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			Edge e0 = new Edge(a, b, 2 * i);
			Edge e1 = new Edge(b, a, 2 * i + 1);
			vs[a].adj.add(e0);
			vs[b].adj.add(e1);		
		}
		long memo[] = new long[E * 2];
		Arrays.fill(memo, -1);
		long memoSize[] = new long[E * 2];
		Arrays.fill(memoSize, -1);		
		for(int i = 0 ; i < N ; ++i){
			rec(i , vs, memo, memoSize, i);
		}
		for(int i = 0 ; i < memo.length ; ++i){
//			System.out.println(i+" "+memo[i]+" "+memoSize[i]);
		}
		for(int i = 0 ; i < N ; ++i){
			Vertex v = vs[i];
			long pattern = 1;
			int S = (int)N - 1;
			for(Edge e : v.adj){
				int s = (int)memoSize[e.idx];
				pattern = (pattern * comb(S, s, fact)) % MOD;
				pattern = (pattern * memo[e.idx]) % MOD;
				S -= s;
			}
			System.out.println(pattern);
		}
	}
}
