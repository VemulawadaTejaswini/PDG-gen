import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long[] left = new long[n];
		long[] right = new long[n];
		left[0] = a[0];
		for (int i = 1; i < n; i++) {
			left[i] = gcd(left[i - 1], a[i]);
		}
		right[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = gcd(right[i + 1], a[i]);
		}
		long ans = Math.max(left[n - 2], right[1]);
		for (int i = 0; i + 2 < n; i++) {
			ans = Math.max(ans, gcd(left[i], right[i + 2]));
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