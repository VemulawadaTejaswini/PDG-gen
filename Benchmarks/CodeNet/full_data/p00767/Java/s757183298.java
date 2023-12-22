import java.util.Scanner;

public class Main {
	int compare(int w1, int h1, int w2, int h2) {
		int d1 = w1 * w1 + h1 * h1;
		int d2 = w2 * w2 + h2 * h2;
		return d1 != d2 ? d1 - d2 : h1 - h2;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if ((h | w) == 0)
				break;

			int optH = 200, optW = 200;
			for (int i = 1; i <= 150; i++) {
				for (int j = 1; j < i; j++) {
					if (compare(w, h, i, j) < 0 && compare(i, j, optW, optH) < 0) {
						optW = i;
						optH = j;
					}
				}
			}
			
			System.out.println(optH + " " + optW);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}