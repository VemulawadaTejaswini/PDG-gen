import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		int count = 0;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					if (x == a * 500 + b * 100 + c * 50) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

		scanner.close();
	}
}