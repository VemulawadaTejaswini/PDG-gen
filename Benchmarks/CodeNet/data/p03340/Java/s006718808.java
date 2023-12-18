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

			{
				int xor = 0;
				int plus = 0;
				int length = 0;
				for (int l = 0, r = 0;; l++) {
					for (;; r++) {
						if (r < N) {
							xor ^= A[r];
							plus += A[r];
						} else {
							count += length;
							break;
						}
						if (xor == plus) {
							length++;
						} else {
							count += length;
							xor ^= A[r];
							plus -= A[r];
							break;
						}
					}
					if (l >= N) {
						break;
					}
					xor ^= A[l];
					plus -= A[l];
					length--;
				}
			}

			System.out.println(count);
		}
	}
}
