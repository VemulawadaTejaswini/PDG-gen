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
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
			}

			double ave = (double) sum / n;
			int difference = 0;
			for (int i = 0; i < n; i++) {
				difference += (score[i] - ave) * (score[i] - ave);
			}
			double variance = (double) difference / n;

			System.out.println(Math.sqrt(variance));
		}
	}
}