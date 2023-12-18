import java.util.*;

/* 
 * 取模运算中的除法计算
 * （m + n） ! / (m! * n !)
 * 因为阶乘都被取模操作过， 所以除法时会出现问题
 * 本算法完美解决了此问题
 * */
public class Main {
	
	static int H, W, A, B;
	
	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		/*input*/
		
		H = cin.nextInt();
		W = cin.nextInt();
		A = cin.nextInt();
		B = cin.nextInt();
		
		
		/* start */
		
		//get 
		long[] f = new long[W + H + 1];
		f[0] = 1;
		for (int i = 1; i < f.length; i ++) {
			f[i] = i * f[i-1];
			f[i] %= MOD;
		}
		
		
		//step1
		
		long res = 0;
		
		for (int j = B; j < W; j ++) {
			res += (comb((H - A - 1) + j, j, f) * 
				   comb((A - 1) + (W - j - 1), A - 1, f)) % MOD;
			res %= MOD;
		}
		
		res += MOD;
		res %= MOD;
		
		
		
		/*finish*/	
		System.out.println(res);
		
	}
	
	
	public static long mod_inv(long a, long m){
		return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	public static long comb(int n, int k, long[] fact){
		if(n == 0){ return 1; }
		if(k == 0){ return 1; }
		
		return (((fact[n] * mod_inv(fact[k], MOD)) % MOD) * mod_inv(fact[n - k], MOD)) % MOD;
	}
}

