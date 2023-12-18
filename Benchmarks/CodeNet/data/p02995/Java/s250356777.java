import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long lcm = lcm(c,d);
		long cnomi = b / c - (a - 1) / c;
		long dnomi = b / d - (a - 1) / d;
		long ctod = b / lcm - (a - 1) / lcm;
		long result = (b - a + 1) - cnomi -dnomi + ctod;
		System.out.println(result);

	}
	
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	
	static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

}
