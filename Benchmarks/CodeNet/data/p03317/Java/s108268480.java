import java.util.Scanner;

/*
 * AtCoder Beginner Contest 101 C
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] A = new int[N];
		int minNumIndex = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
			if (A[i] == 1) {
				minNumIndex = i + 1;
			}
		}

		
		int count = (N - K) / (K - 1) + 1;
		int remain = (N - K) % (K - 1);
		if (remain != 0) {
			count++;
		}

		System.out.println(count);

	}

}
