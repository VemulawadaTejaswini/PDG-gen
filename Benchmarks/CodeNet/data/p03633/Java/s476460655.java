import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextLong();
		// 最大公約数求める
		long l = a[0];
		for(int i = 1 ; i < n ; i++) {
			l = lcm(l, a[i]);
		}
		System.out.println(l);
	}

	public static long gcd(long a, long b) {
		if(b == 0) return a;
		if(a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}


}
