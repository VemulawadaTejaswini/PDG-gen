
import java.util.Scanner;

public class Main {

	public static long Gcd(long m, long n) {
		if(m < n) {
			long temp = n;
			n = m;
			m = temp;
		}
		if(m % n == 0)
			return n;
		else
			return Gcd(n, m % n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long val = 1;
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong() / 2;
			val = val * a / Gcd(val, a);
		}
		System.out.println((m / val + 1) / 2);

	}

}
