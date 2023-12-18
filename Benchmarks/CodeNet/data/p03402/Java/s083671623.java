import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputA = scanner.nextInt();
		int inputB = scanner.nextInt();
		scanner.close();

		String[][] s = new String[40][100];
		for (int i = 0; i < 20; i++) {
			Arrays.fill(s[i], "#");
		}
		for (int i = 20; i < 40; i++) {
			Arrays.fill(s[i], ".");
		}
		for (int i = 0; i < inputA - 1; i++) {
			s[i / 50 * 2][i % 50 * 2] = ".";
		}
		for (int i = 0; i < inputB - 1; i++) {
			s[i / 50 * 2 + 21][i % 50 * 2] = "#";
		}

		System.out.println("40 100");
		for (int i = 0; i < 40; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}
}
