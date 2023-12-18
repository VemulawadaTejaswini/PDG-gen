import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t1 = sc.nextLong();
		long t2 = sc.nextLong();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong();
		long b2 = sc.nextLong();

		long tsum = t1 * a1 + t2 * a2;
		long asum = t1 * b1 + t2 * b2;
		if (tsum == asum) {
			System.out.println("infinity");
			return;
		}

		if (asum > tsum) {
			long tmp = a1;
			a1 = b1;
			b1 = tmp;

			tmp = a2;
			a2 = b2;
			b2 = tmp;
		}

		if (b1 < a1) {
			System.out.println(0);
			return;
		}

		long delta = Math.abs(asum - tsum);
		System.out.println(((b1 - a1) * t1 / delta) * 2 + 1);
	}
}
