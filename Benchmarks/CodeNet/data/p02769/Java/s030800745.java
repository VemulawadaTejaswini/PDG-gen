import java.util.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		if(k>=n)
			k = n-1;
		
		long ans = 1;
		long comb0 = 1;
		long comb1 = 1;
		for(int i=1; i<=k; i++) {
			comb0 = (comb0*(n-i+1)) % MOD;
			comb0 = (comb0*rev(i)) % MOD;
			comb1 = (comb1*(n-i)) % MOD;
			comb1 = (comb1*rev(i)) % MOD;
			ans = (ans + comb0 * comb1) % MOD;
//			ans = (ans + comb(n, i) * comb(n-1, i)) % MOD;
		}
		
		System.out.println(ans);
		sc.close();
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
	
	static long rev(long a) {
		return pow(a, MOD-2);
	}

	static long comb(long a, long b) {
		long ans = 1;
		for(long i=0; i<b; i++) {
			ans = (ans * (a-i)) % MOD;
			ans = (ans * rev(i+1)) % MOD;
		}
		
		return ans;
	}

}

