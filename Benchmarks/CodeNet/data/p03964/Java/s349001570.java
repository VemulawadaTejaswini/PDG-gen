import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1, b = 1;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = 1;; j++) {
				if (a + b <= (x + y) * j && a <= x * j && b <= y * j) {
					a = x * j;
					b = y * j;
					break;
				}
			}
		}
		System.out.println((a + b));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
