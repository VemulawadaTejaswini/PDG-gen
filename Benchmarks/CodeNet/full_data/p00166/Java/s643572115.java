
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			double sa = slove(n, scanner);
			int m = scanner.nextInt();
			double sb = slove(m, scanner);
			if (Math.abs(sa-sb)<1e-7) {
				System.out.println(0);
			} else if (sa > sb) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}

	public static double slove(int n, Scanner scanner) {
		double sa = 0;
		int s = 360;
		while (n-- > 1) {
			int t = scanner.nextInt();
			s -= t;
			sa += Math.sin(Math.toRadians(t));
		}
		sa += Math.sin(Math.toRadians(s));
		return sa;
	}
}