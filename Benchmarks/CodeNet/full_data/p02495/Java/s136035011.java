import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			for (int H = 1; H <= a; H++) {
				for (int W = 1; W <= b; W++) {
					if ((H + W) % 2 == 0) {
						System.out.printf("#");
					} else {
						System.out.printf(".");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}

}