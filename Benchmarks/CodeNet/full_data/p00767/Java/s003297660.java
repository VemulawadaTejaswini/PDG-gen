import java.util.Scanner;

public class Main {
	static final int MAX_LENGTH = 150;

	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h + w == 0)
				break;
			int min = Integer.MAX_VALUE;
			int root = h * h + w * w;
			int min_h = Integer.MAX_VALUE;
			int min_w = 0;
			for (int i = 1; i <= MAX_LENGTH; i++) {
				for (int j = 1; j <= MAX_LENGTH; j++) {
					if (i < j && root < i * i + j * j) {
						if (min > i * i + j * j) {
							min = Math.min(min, i * i + j * j);
							min_h = i;
							min_w = j;
						} else if (min == i * i + j * j) {
							min_h = Math.min(min_h, i);
						}
					}
				}
			}
			System.out.println(min_h + " " + min_w);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}