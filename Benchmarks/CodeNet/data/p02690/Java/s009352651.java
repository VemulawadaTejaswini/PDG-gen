
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		for (long a = 0; a <= 1000; a++) {
			long a5 = a * a * a * a * a;
			for (long b = 0; b <= 1000; b++) {
				long b5 = b * b * b * b * b;
				if (a5 - b5 == x) {
					System.out.println(a + " "+ b);
					return;
				}
				if (-a5 - b5 == x) {
					System.out.println(-a + " "+ b);
					return;
				}
				if (-a5 + b5 == x) {
					System.out.println(-a + " "+ -b);
					return;
				}
				if (a5 + b5 == x) {
					System.out.println(a + " "+ -b);
					return;
				}
			}
		}
	}
}
