import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		x = Math.abs(x);
		long p = x / d;
		if (p >= k) {
			x -= d * k;
			System.out.println(x);
		} else {
			x = x % d;
			if ((k - p) % 2 == 0) {
				System.out.println(x);
			} else {
				System.out.println(Math.abs(x - d));
			}
		}
	}

}