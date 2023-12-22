import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			int[] scores = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			double ave = sum * 1.0 / N;
//			System.out.println(ave);

			double bunsan = 0;
			for (int score : scores) {
				bunsan += Math.pow( (score - ave) , 2);
			}
			bunsan /= N;

			System.out.println(Math.sqrt(bunsan));

		}


	}
}
