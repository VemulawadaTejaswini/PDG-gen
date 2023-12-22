import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static class FenwickTree {
	    int n;
	    long x[];
	    public FenwickTree(int N) {
	    	this.n = N;
	    	x = new long[N + 1] ;
		}
	    int size()  { return n; }
	    long sum(int i) {
	    	long ret = 0;
	        for (int idx = i; idx > 0; idx -= (idx & -idx)) {
	            ret = (ret + x[idx]) % MOD;
	        }
	        return ret % MOD;
	    }
	    long sum(int l, int r)  { return (sum(r) - sum(l) + MOD) % MOD; }
	    void add(int i, long v) {
	        for (int idx = i; idx <= n; idx += (idx & -idx)) {
	            x[idx] = (x[idx] + v) % MOD;
	        }
	    }
	};
	static class FT2{
		FenwickTree bit0;
		FenwickTree bit1;
		public FT2(int N) {
			bit0 = new FenwickTree(N);
			bit1 = new FenwickTree(N);
		}		
		void add(int l , int r, long x){
			bit0.add(l, - x * (l - 1));
			bit1.add(l, x);
			bit0.add(r + 1, x * r);
			bit1.add(r + 1, -x);
		}
		long sum(int i){
			return bit0.sum(i) + bit1.sum(i) * i;
		}
	}

	final static long MOD = 998244353L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int L[] = new int[K];
		int R[] = new int[K];
		for(int i = 0 ; i < K ; ++i){
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		FenwickTree ft = new FenwickTree(N + 1);
		ft.add(1, 1);
		ft.add(2, -1);
//		long dp[] = new long[N];		
//		dp[0] = 1;
		for(int i = 0 ; i < N ; ++i){
			long cur = ft.sum(i + 1);
			for(int k = 0 ; k < K ; ++k){
				int nl = i + L[k];
				int nr = i + R[k];
				if(nl >= N){
					continue;
				}
				nr = Math.min(N - 1, nr);
				ft.add(nl + 1, cur);
				ft.add(nr + 2, MOD - cur);
//				for(int next = nl ; next <= nr ; ++next){
//					dp[next] = (dp[next] + cur) % MOD;
//				}
			}
		}
		System.out.println(ft.sum(N));
//		System.out.println(dp[N - 1]);
	}
}
