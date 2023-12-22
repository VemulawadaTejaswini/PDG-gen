import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int sum = 0;
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int score[] = new int[n];
			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
			}

			double average = (double) sum / n;
			double variance = ver(score, average, n);

			System.out.println(Math.sqrt(variance));
		}

	}

	private static double ver(int[] score, double average, int n) {
		double a = 0;
		for (int i = 0; i < n; i++) {
			a += (double) (score[i] - average) * (score[i] - average);
		}
		return (double) a / n;
	}
}