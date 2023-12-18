import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (b - a <= 0) {
			System.out.println("delicious");
		} else {
			if (x - (b - a) >= 0) {
				System.out.println("safe");
			} else {
				System.out.println("dangerous");
			}
		}

	}

}