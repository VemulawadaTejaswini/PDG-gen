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
			for (int i = 0; i < n; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
			}

			double ave = (double) sum / n;
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (score[i] - ave) * (score[i] - ave);
			}
			double variance = sum / n;

			System.out.println(Math.sqrt(variance));
		}
	}
}