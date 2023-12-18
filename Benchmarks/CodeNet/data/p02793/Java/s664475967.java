
import java.util.Scanner;

public class Main {

	public static long div = (long) (Math.pow(10, 9) + 7);

	public static long Gcd(long m, long n) {
		if(m < n) {
			long tmp = n;
			n = m;
			m = tmp;
		}
		if(m % n == 0)
			return n;
		else
			return Gcd(n, m % n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long ans = 0;
		long min = 1;
		for(int i = 0; i < n; i++) {
			min = min * a[i] / Gcd(min, a[i]);
		}
		for(int i = 0; i < n; i++) {
			ans += min / a[i];
			ans %= div;
		}
		System.out.println(ans);

	}

}
