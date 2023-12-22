import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int s = scan.nextInt();
			if (x == 0 && y == 0 && s == 0) break;
			int maxval = 0;
			for (int i = 1; i < s; i++) {
				for (int j = i; j < s; j++) {
					int sum = (i * (100 + x) / 100) + (j * (100 + x) / 100);
					if (sum != s) continue;
					int val = (i * (100 + y) / 100) + (j * (100 + y) / 100);
					if (maxval < val) maxval = val;
				}
			}
			System.out.println(maxval);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}