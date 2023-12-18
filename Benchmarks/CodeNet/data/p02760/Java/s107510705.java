import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] A = new int[9];
		for (int i = 0; i < 9; i++) {
			A[i] = scanner.nextInt();
		}

		final int N = scanner.nextInt();

		long ana = 0;
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

		long[] mask = { 0x111000000l, 0x000111000, 0x000000111, 0x100100100l, 0x010010010, 0x001001001, 0x100010001l,
				0x001010100 };
		for (int i = 0; i < 8; i++) {
			if ((ana & mask[i]) == mask[i]) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

}
