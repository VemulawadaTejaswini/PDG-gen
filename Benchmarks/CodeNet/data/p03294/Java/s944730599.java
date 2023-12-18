import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		long x = 1, y = 1;
		for(int i = 0 ; i < n ; i++) {
			x = gcd_lcm.gcd(x, a[i]);
			y = gcd_lcm.lcm(y, a[i]);
		}
		long z = Math.abs(y - 1);
		long ans = 0;
		for(int i = 0 ; i < n ; i++) ans += z % a[i];
		System.out.println(ans);
	}
}

class gcd_lcm {
	static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}