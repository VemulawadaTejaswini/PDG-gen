import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (Math.abs(n - m) <= 1) {
		    long ans = kaijo(n) * kaijo(m);
		    ans %= MOD;
		    if (n == m) {
		        ans *= 2;
		        ans %= MOD;
		    }
		    System.out.println(ans);
		} else {
		    System.out.println(0);
		}
	}
	
	static long kaijo(long x) {
	    long ans = 1;
	    for (int i = 1; i <= x; i++) {
	        ans *= i;
	        ans %= MOD;
	    }
	    return ans;
	}
}
