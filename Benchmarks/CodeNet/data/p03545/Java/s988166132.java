import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = n % 10;
		int c = (n % 100) / 10;
		int b = (n % 1000) / 100;
		int a = n / 1000;

		String x, y, z;

		loop: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					int ans = a;
					if (i == 0) {
						ans += b;
						x = "+";
					} else {
						ans -= b;
						x = "-";
					}

					if (j == 0) {
						ans += c;
						y = "+";
					} else {
						ans -= c;
						y = "-";
					}

					if (k == 0) {
						ans += d;
						z = "+";
					} else {
						ans -= d;
						z = "-";
					}

					if (ans == 7) {
						System.out.println(a + x + b + y + c + z + d + "=7");
						break loop;
					}
				}
			}
		}

		sc.close();
	}
}