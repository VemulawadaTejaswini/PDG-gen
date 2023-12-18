import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		long amax = -1;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			amax = Math.max(amax, a[i]);
		}
		Arrays.sort(b);
		long ans = 0;
		for(int i=N-1; i>=0; i--) {
			if(amax<b[i]) {
				H -= b[i]; ans++;
			} else {
				H -= amax; ans++;
			}
			if(H<=0) {
				System.out.println(ans);
				return;
			}
		}
		if(H%amax==0) {
			System.out.println(ans+H/amax);
		} else {
			System.out.println(ans+H/amax+1);
		}
	}
	
	static int binarySearch(int[] A, int x) {
		int l = 0;
		int r = A.length;
		while(l<r) {
			int mid = (l+r)/2;
			if(A[mid] == x) return mid;
			else if(x<A[mid]) r = mid;
			else l = mid+1;
		}
		return -1;
	}
	
	static long upper_bound(int[] A, int b) {
		// bよりおおきい値がはじめて出てくるindexを返す
		return lower_bound(A, b+1);
	}

	static long lower_bound(int[] A, int b) {
		// b以上の値がはじめて出てくるindexを返す
		int lb=0;
		int ub=A.length;
		while(ub>lb) {
			int mid = (lb+ub)/2;
			if(A[mid]>=b) ub = mid;
			else lb = mid+1;
		}
		return lb;
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