import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
			int x = scanner.nextInt(), y = scanner.nextInt();
			int min = Math.min(x, y) & (~1);
			int max = Math.max(x, y);
			max = (1 == (max & 1)) ? max + 1 : max;
			System.out.println(Math.min(min * Math.min(a + b, 2 * c) + (x - min) * a + (y - min) * b, max * 2 * c));
		}
	}
}
