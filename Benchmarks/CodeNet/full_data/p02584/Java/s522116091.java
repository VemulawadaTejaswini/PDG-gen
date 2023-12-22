import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			x = Math.abs(x);
			long k = sc.nextLong();
			long d = sc.nextLong();
			if (x / d > k) {
				System.out.println(x - d * k);
			} else {
				long cnt = x / d;
				if ((k - cnt) % 2 == 0) {
					System.out.println(x - cnt * d);
				} else {
					System.out.println((cnt + 1) * d - x);
				}
			}
		}
	}
}