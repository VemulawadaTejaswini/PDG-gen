import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int y;
		try (Scanner scanner = new Scanner(System.in)) {
			n = scanner.nextInt();
			y = scanner.nextInt();
		}

		int a = -1;
		int b = -1;
		int c = -1;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int k = n - i - j;

				if (y == i * 10000 + j * 5000 + k * 1000) {
					a = i;
					b = j;
					c = k;
				}
			}
		}

		System.out.println(a + " " + b + " " + c);
	}
}