import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int s = sc.nextInt();
			if ((a | b | s) == 0) {
				break;
			}
			int max = 0;
			for (int xk = 1; xk <= 1000; xk++) {
				for (int yk = 1; yk <= 1000; yk++) {
					int xValue = xk * (100 + a) / 100;
					int yValue = yk * (100 + a) / 100;
					if (xValue + yValue == s) {
						int xNValue = xk * (100 + b) / 100;
						int yNValue = yk * (100 + b) / 100;
						max = Math.max(max, xNValue + yNValue);
					}
				}
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}