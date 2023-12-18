import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] values = new boolean[n][];
		int[] counts = new int[60];
		for (int i = 0; i < n; i++) {
		    values[i] = getArray(sc.nextLong());
		    for (int j = 0; j < 60; j++) {
		        if (values[i][j]) {
		            counts[j]++;
		        }
		    }
		}
		long base = 1;
		long ans = 0;
		for (int i = 0; i < 60; i++) {
		    long tmp = (long)(n - counts[i]) * (counts[i])  % MOD;
		    ans += tmp * base % MOD;
		    ans %= MOD;
		    base *= 2;
		    base %= MOD;
		}
		System.out.println(ans);
	}
	
	static boolean[] getArray(long x) {
	    boolean[] ret = new boolean[60];
	    for (int i = 0; i < 60; i++) {
	        ret[i] = (x % 2 == 1);
	        x /= 2;
	    }
	    return ret;
	}
}
