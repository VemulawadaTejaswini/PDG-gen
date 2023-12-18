import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] A = new int[9];
		for (int i = 0; i < 9; i++) {
			A[i] = scanner.nextInt();
		}

		final int N = scanner.nextInt();

		int ana = 0;
		int b;
		for (int i = 0; i < N; i++) {
			b = scanner.nextInt();
			for (int j = 0; j < 9; j++) {
				if (A[j] == b) {
					ana |= (1l << j);
					break;
				}
			}
		}

		int[] mask = { 0b111000000, 0b111000, 0b111, 0b100100100, 0b10010010, 0b1001001, 0b100010001, 0b1010100 };

		for (int i = 0; i < 8; i++) {
			if ((ana & mask[i]) == mask[i]) {

				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

}
