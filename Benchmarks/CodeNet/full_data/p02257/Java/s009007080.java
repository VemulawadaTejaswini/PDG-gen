import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int y = 0;
		int z = 0;
		for (int j = 0; j < n; j++) {
			int x = scanner.nextInt();
			if (x == 2) {
				count += 1;
			} else if (x % 2 == 1) {
				for (int i = x - 1; i > 2; i -= 2) {
					y = x % i;
					if (y == 0) {
						z += 1;
						break;
					}
				}
				if (z == 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
