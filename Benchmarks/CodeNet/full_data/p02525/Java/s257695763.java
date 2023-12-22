import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] score = new int[n];
			int sum = 0;
			double a = 0;

			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				sum = sum + score[i];
			}

			double average = sum / n;

			for (int i = 0; i < n; i++) {
				a = a + (score[i] - average) * (score[i] - average);
			}

			double variance = a / n;

			System.out.println(Math.sqrt(variance));
		}
		sc.close();
	}
}