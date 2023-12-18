import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();

			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = in.nextInt();
			}

			int count = 0;
			for (int i = 0; i < N; i++) {
				int xor = 0;
				int plus = 0;
				for (int j = i, length = 0; j < N; j++, length++) {
					if (xor != plus) {
						for (int k = 1; k <= length; k++) {
							count += k;
						}
						break;
					}
					xor ^= A[j];
					plus += A[j];
				}
			}

			System.out.println(count);
		}
	}
}
