import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(1);
			}

			// int[] score = new int[n];
			int score;
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < n; i++) {
				score = sc.nextInt();
				sum += score;
				if (score > max)
					max = score;
				if (score < min)
					min = score;
			}

			System.out.println((sum - min - max) / (n - 2));
		}

	}
}