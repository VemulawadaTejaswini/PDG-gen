import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = sc.nextLong();
		for (int i = 1; i < n; i++) {
		    ans = lcm(ans, sc.nextLong());
		}
        System.out.println(ans);
	}
	
	static long lcm(long a, long b) {
	    long x = gcd(a, b);
	    return a / x * b;
	}
	
	static long gcd(long a, long b) {
	    if (a % b == 0) {
	        return b;
	    } else {
	        return gcd(b, a % b);
	    }
	}
}
