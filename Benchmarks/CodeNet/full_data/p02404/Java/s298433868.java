import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			if (h == 0 && w == 0) {
				break;
			} else if (3 <= h && h <= 300 && 3 <= w && w <= 300) {
				for (int i = 0; i < w; i++) {
					System.out.print("#");
				}
				System.out.println("");
				for (int j = 0; j < h - 2; j++) {
					System.out.print("#");
					for (int k = 0; k < w - 2; k++) {
						System.out.print(".");
					}
					System.out.println("#");
				}
				for (int l = 0; l < w; l++) {
					System.out.print("#");
				}
				System.out.println("");
			}
System.out.println("");

		}

	}

}