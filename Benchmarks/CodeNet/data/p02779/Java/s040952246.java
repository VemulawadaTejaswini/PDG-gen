import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = scanner.nextInt();

		Arrays.parallelSort(A);

		for (int i = 0; i < N - 1; i++) {
			if (A[i] == A[i + 1]) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

		scanner.close();
	}

}
