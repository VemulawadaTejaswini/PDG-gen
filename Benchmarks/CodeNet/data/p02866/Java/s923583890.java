import java.util.*;

public class Main {
    static final int MOD = 998244353;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[100001];
		int max = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (i == 0 ^ x == 0) {
		        System.out.println(0);
		        return;
		    }
		    max = Math.max(x, max);
		    counts[x]++;
		}
		long ans = 1;
		for (int i = 1; i <= max; i++) {
		    ans *= pow(counts[i - 1], counts[i]);
		    ans %= MOD;
		}
		System.out.println(ans);
	}
	
	static long pow(long a, long b) {
	    long x = 1;
	    for (int i = 0; i < b; i++) {
	        x *= a;
	        x %= MOD;
	    }
	    return x;
	}
}
