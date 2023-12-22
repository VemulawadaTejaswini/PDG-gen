import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			while (N-- > 0) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int b = sc.nextInt();
				int p = sc.nextInt();

				int min = x * b + y * p;
				double ans;
				if (b >= 5 && p >= 2) {
					ans = min * 0.8;
				} else {
					int div = x * b + y * p;
					if (b < 5) {
						div += (5 - b) * x;
					}
					if (p < 2) {
						div += (2 - p) * y;
					}
					ans = Math.min(min, div * 0.8);
				}
				System.out.println((int) ans);
			}
		}
	}
}