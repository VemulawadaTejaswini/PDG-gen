import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] sum = new int[N];

		int a;

		for (int i = 0; i < N; i++) {
			a = scanner.nextInt();
			for (int j = 0; j < K && i + j < N; j++) {
				sum[i + j] += a + 1;
			}

		}

		scanner.close();

		a = 0;

		for (int i = K - 1; i < N; i++) {
			if (sum[i] > a)
				a = sum[i];
		}

		System.out.println((double) a / 2);
	}

}
