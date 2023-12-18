
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] inputNumbers = new int[4];
		for (int i = 0; i < 4; i++) {
			inputNumbers[i] = Integer.parseInt(sc.nextLine());
		}

		int count = 0;
		for (int i = 0; i <= inputNumbers[3] / 500; i++) {
			for (int j = 0; j <= (inputNumbers[3] - 500 * i) / 100; j++) {
				if ((inputNumbers[3] - 500 * i - 100 * j) % 50 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
