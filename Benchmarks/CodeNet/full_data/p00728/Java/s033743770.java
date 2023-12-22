import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int judge = sc.nextInt();
			if (judge == 0)
				break;

			int[] score = new int[judge];
			int max = 0, min = 1000, sum = 0;

			for (int i = 0; i < judge; i++) {
				score[i] = sc.nextInt();
				sum += score[i];
				if (score[i] > max)
					max = score[i];
				if (score[i] < min)
					min = score[i];
			}

			System.out.println((int) Math.floor((double) (sum - max - min)
					/ (double) (judge - 2)));
		}
	}
}