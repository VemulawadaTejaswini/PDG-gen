import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H[] = new int[N];

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		loop: while (true) {
			for (int i = N - 1; i > 0; i--) {

				if (H[i] < H[i - 1]) {
					H[i - 1]--;
				}

				if (H[i] < H[i - 1]) {
					System.out.print("No");
					break loop;
				}

			}
			System.out.print("Yes");
			break;
		}

	}
}
