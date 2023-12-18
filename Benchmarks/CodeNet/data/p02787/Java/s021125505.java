import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int m[] = new int[H + 1];
		int N = scanner.nextInt();

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		for (int i = 1; i <= H; i++)
			m[i] = ((i - 1) / A + 1) * B;

		for (int i = 2; i <= N; i++) {
			A = scanner.nextInt();
			B = scanner.nextInt();

			for (int j = 1; j <= H; j++)
				if (j <= A) {
					if (m[j] > B)
						m[j] = B;
				} else if (m[j] > m[j - A] + B)
					m[j] = m[j - A] + B;

		}
		scanner.close();

		System.out.println(m[H]);

	}

}
