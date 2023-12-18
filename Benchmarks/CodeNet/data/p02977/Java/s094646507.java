import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		{
			for (long i = 1; i < 1L << 30; i *= 2) {
				if (i == N) {
					System.out.println("No");
					return;
				}
			}
		}

		System.out.println("Yes");
		int M = (N % 2 == 0 ? N - 1 : N);
		for (int i = 2; i <= M; ++i) {
			System.out.println(1 + " " + i);
		}
		for (int i = 2; i <= M; i += 2) {
			System.out.println((i + 1) + " " + (i + N));
		}
		for (int i = 3; i <= M; i += 2) {
			System.out.println((i - 1) + " " + (i + N));
		}
		System.out.println((2 + N) + " " + (1 + N));
		if (M != N) {
			for (int i = 2; i <= M; ++i) {
				if (2 <= (1 ^ i ^ N) && (1 ^ i ^ N) <= M && (1 ^ i ^ N) != i) {
					System.out.println(i + " " + N);
					System.out.println((1 ^ i ^ N) + " " + (N + N));
					return;
				}
			}

		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}