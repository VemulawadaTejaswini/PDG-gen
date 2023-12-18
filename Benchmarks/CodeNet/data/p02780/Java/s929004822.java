import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}

		double MAX = 0;

		for (int i = 0; i < N - K + 1; i++) {
			float EXP = 0;

			for (int j = 0; j < K; j++) {
				EXP += (0.5 * P[i + j]) + 0.5;
			}

			if (EXP > MAX) {
				MAX = EXP;
			}
		}

		System.out.println(String.format("%.12f", MAX));

		sc.close();
	}

}
