import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] m = new int[N+1][N+1];
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			m[a][b] = 1;
			m[b][a] = 1;
		}
		int ans = 0;
		for(int i=1; i<=N; i++) {
			for(int j=i+1; j<=N; j++) {
				if(m[i][j] == 1 && m[j][i] == 1) {
					m[i][j] = 0;
					m[j][i] = 0;
					ArrayList<Integer> visited = new ArrayList<>();
					dfs(1, m, visited, N);
					if(visited.size() != N) ans++;
					m[i][j] = 1;
					m[j][i] = 1;
				}
			}
		}
		System.out.println(ans);
	}
	
	static void dfs(int current, int[][] nm, ArrayList<Integer> visited, int N) {
		if(visited.contains(current)) return;
		visited.add(current);
		for(int i=1; i<=N; i++) {
			if(visited.contains(i)) continue;
			if(nm[current][i] == 1) {
				dfs(i, nm, visited, N);
			}
		}
		return;
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
	
	static int max(int...ls) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.max(ans, ls[i]);
		}
		return ans;
	}
	
	static int min(int...ls) {
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.min(ans, ls[i]);
		}
		return ans;
	}
	
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