import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE/2;
	static final int mod = (int)1e9+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		for(int i=0;i<n;i++)x[i] = sc.nextInt();
		sc.close();
			
		int d[] = new int[n-1];
		for(int i=0;i<n-1;i++) {
			d[i] = x[i+1] - x[i];
		}
		
		long ans = 0;

		
		for(int i=0;i<n-1;i++) {
			int dist = d[i];
			long sum = 0;
			for(int j=0;j<=i;j++) {
				sum = plus(sum, div(1,j+1));
			}
			ans = plus(ans, mul(dist, sum));
		}
		
		for(int i=1;i<=n-1;i++) {
			ans = mul(ans, i);
		}
		
		System.out.println(ans);
	}
	
	
	static long mul(long x, long y) {
		return x * y % mod;
	}
	
	static long plus(long x, long y) {
		return (x + y) % mod;
	}
	
	static long div(long x, long y) {
		return x * modpow(y, mod-2);
	}
	
	static long modpow(long x, long p) {
		if(p == 0) return 1;
		if(p%2!=0) return x * modpow(x, p-1) % mod;
		long h = modpow(x, p/2);
		return h * h % mod;
	}
	
}

