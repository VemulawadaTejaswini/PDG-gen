import java.util.*;

public class Main {
	static long MOD = 998244353;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		long[] pow = new long[K+1];
		long[] comb = new long[K+1];
		
		long temp = 1;
		for(int i=1; i<=N; i++) {
			temp = i==1 ? M : (temp * (M-1))%MOD;
			if(i>=N-K)
				pow[i-N+K] = temp;
		}
		
		comb[0] = 1;
		for(int i=0; i<K; i++) {
			comb[i+1] = (comb[i]*(N-1-i)) % MOD;
			comb[i+1] = (comb[i+1]*rev(i+1)) % MOD;
		}
		
		long ans = 0;
		for(int i=0; i<=K; i++) {
			ans = (ans + pow[i]*comb[K-i])%MOD;
		}
		System.out.println(ans);
		sc.close();
	}
	
	static long rev(long a) {
		return pow(a, MOD-2);
	}
	
	static long pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			b>>=1;
			a = (a*a)%MOD;
		}
		return ans;
	}
	
}

