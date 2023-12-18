import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			int x = 1;
			while (true) {
				if (x == 1) {
					c -= b;
					if (c <= 0) {
						break;
					}
				} else {
					a -= d;
					if (a <= 0) {
						break;
					}
				}

				x *= -1;
			}

			System.out.println(x == 1 ? "Yes" : "No");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
