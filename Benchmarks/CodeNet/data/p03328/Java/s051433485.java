import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int height = 0;

		int diff = b - a;

		for (int i = 0; i < diff; i++) {
			height = height + i;
			//System.out.println(height);
		}
		int snow = height - a;
		System.out.println(snow);
	}
}