import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0) break;
			for (int i = 0; i < h; i++) {
				boolean flag = true;
				for (int j = 0; j < w; j++) {
					if (i % 2 == 0) {
						if (flag == true) {
							System.out.print("#");
							flag = false;
						} else {
							System.out.print(".");
							flag = true;
						}
					} else {
						if (flag == true) {
							System.out.print(".");
							flag = false;
						} else {
							System.out.print("#");
							flag = true;
						}
					}
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