import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long ans = ((pow(10, n) + pow(8, n)) % MOD - pow(9, n) * 2 % MOD + MOD) % MOD;
	    System.out.println(ans);
	}
	
	static long pow(long x, long p) {
	    if (p == 0) {
	        return 1;
	    } else if (p % 2 == 0) {
	        return pow(x * x % MOD, p / 2);
	    } else {
	        return pow(x, p - 1) * x % MOD;
	    }
	}
}