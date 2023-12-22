import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int sum = 0;
			if (n == 0) {break;}
			int[] score = new int[n];
			for (int i = 0; i < score.length; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
			}

			double ava, var = 0;
			ava  = sum / n;
			for (int i = 0; i < n ; i++ ) {
				var += (score[i] - ava) * (score[i] - ava) / n;
			}
			System.out.println(Math.sqrt(var));
		}
	}
}