import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int x = s.nextInt(), y = s.nextInt(), t = s.nextInt();
			if (x < 1) {
				break;
			}
			int max = 0;
			for (int i = 1; i < t; ++i) {
				for (int j = 1; j <= t - i; ++j) {
					int a = (int) Math.floor(i * (100 + x) / 100.0);
					int b = (int) Math.floor(j * (100 + x) / 100.0);
					if (a + b == t) {
						int c = (int) Math.floor(i * (100 + y) / 100.0);
						int d = (int) Math.floor(j * (100 + y) / 100.0);
						max = Math.max(max, c + d);
					}
				}
			}
			System.out.println(max);

		}
	}
}