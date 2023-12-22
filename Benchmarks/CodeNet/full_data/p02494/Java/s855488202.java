
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int height = scan.nextInt();
			int width = scan.nextInt();
			if (height == 0 && width == 0) {
				System.exit(2);
			}

			if (1 > height || 300 < width) {
				System.exit(1);
			}
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

}