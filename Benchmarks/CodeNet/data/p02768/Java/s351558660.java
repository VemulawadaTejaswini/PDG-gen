import java.util.*;

public class Main {
	static int MOD = 1_000_000_007;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        long res = ((modPow(2, n) - comb(n, a) - comb(n, b) - 1)) % MOD;
        System.out.println( res < 0 ? res + MOD : res);
    }

    private static long modPow(long a, long b) {
    	if(b == 0)
    		return 1;
    	if(a == 0)
    		return 0;
    	if(b == 1)
    		return a;
    	long res = modPow(a, b / 2) % MOD;
    	if(b % 2 == 1)
    		return ((res * res) % MOD) * a % MOD;
    	return (res * res) % MOD;
    }

    private static long factorial(long n, long start) {
    	long res = 1L;
    	for(long i = start; i <= n; i++)
    		res = (res % MOD)* (i % MOD) % MOD;
    	return res;
    }

    private static long comb(long a, long b) {
    	long factA = factorial(a, a - b + 1) % MOD;
    	long factB = factorial(b, 1) % MOD;
    	long inv = modPow(factB, MOD - 2) % MOD;
    	return factA * inv % MOD;
    }
}
