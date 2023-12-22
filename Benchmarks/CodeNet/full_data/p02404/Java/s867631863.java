import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0) break;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
						System.out.print("#");
					} else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}