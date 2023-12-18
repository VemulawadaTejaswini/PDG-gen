import java.util.*;

public class Main {
	static int MAX_N = 40;
	static int MAX_a = 10;
	static int MAX_b = 10;
	static int MAX_mb = MAX_N*MAX_a;
	static int Big = 400000;
	static int[] a = new int[MAX_N];
	static int[] b = new int[MAX_N];
	static int[] c = new int[MAX_N];
	static int[][][] memo = new int[MAX_N+1][MAX_mb+1][MAX_mb+1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt(); b[i] = sc.nextInt(); c[i] = sc.nextInt();
		}
		for(int i=0; i<memo.length; i++) {
			for(int j=0; j<memo[i].length; j++) {
				Arrays.fill(memo[i][j], Big);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i=1; i<memo.length; i++) {
			for(int j=1; j<memo[i].length; j++) {
				if(i*Mb == j*Ma && dp(N, i, j) != Big) {
					ans = min(ans, dp(N, i, j));
				}
			}
		}
		if(ans >= Big)
			ans = -1;
		System.out.println(ans);
	}
	
	static int dp(int i, int ma, int mb) {
		if(memo[i][ma][mb]!=Big) return memo[i][ma][mb];
		if(ma==0&&mb==0) return memo[i][ma][mb] = 0;
		if(i<=0) return Big;
		if(ma-a[i-1]>=0 && mb-b[i-1]>=0) {
			return memo[i][ma][mb] = min(dp(i-1, ma-a[i-1], mb-b[i-1])+c[i-1], dp(i-1, ma, mb));
		} else {
			return memo[i][ma][mb] = dp(i-1, ma, mb);
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