import java.util.*;
public class Main {
	
	public static int MOD = 1_000_000_007;
	public static int MAX = 2000000;
	public static long[] fac = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];
	
	public static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
	}
	
	public static long combination(int n, int k){
		if(n < k || n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int N = (X+Y)/3;
		if((X+Y) % 3 != 0)
			System.out.println(0);
		else {
			COMinit();
			System.out.println(combination(N, N*2-X));
		}

	}

}
