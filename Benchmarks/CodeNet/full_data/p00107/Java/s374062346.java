
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (a == 0 && b == 0 && c == 0)
				break;
			int n = scanner.nextInt();
			int max = Math.max(a, Math.max(b, c));
			for (int i = 0; i < n; i++) {
				int d = scanner.nextInt() *2;
				if (d > max) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}
}