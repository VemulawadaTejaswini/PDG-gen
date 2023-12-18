import java.util.*;
import java.lang.*;

public class Main {
	static long[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long ans = a[0];
		for (int i = 0; i < n; i++) {
			ans = gcd(ans, a[i]);
		}
		System.out.println(ans);
	}
	static long gcd(long a, long b) {
	    if (b == 0) {
	        return a;
	    }
	    return gcd(b, a % b);
	}
}