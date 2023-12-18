import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int input[] = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		for (int i = 0; i < 3; i++) {
			int x = Math.abs(input[i] - input[(i + 1) % 3]);
			int i1 = input[(i + 2) % 3];
			if (i1 < x || (x - i1) % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
