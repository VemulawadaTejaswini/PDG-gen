import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1, b = 1;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int k = 1;
			k = Math.max(k, a / x);
			k = Math.max(k, b / y);
			while (x * k < a || y * k < b) {
				k++;
			}
			a = x * k;
			b = y * k;
		}
		System.out.println((a + b));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
