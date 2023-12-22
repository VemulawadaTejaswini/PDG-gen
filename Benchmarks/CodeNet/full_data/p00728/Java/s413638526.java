import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int number = sc.nextInt();
			if (number == 0) {
				break;
			}

			int[] scores = new int[number];

			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}

			int max = 0, min = 1001;
			int maxtag = 0, mintag = 0;

			for (int i = 0; i < scores.length; i++) {
				if (scores[i] > max) {
					max = scores[i];
					maxtag = i;
				}
				if (scores[i] < min) {
					min = scores[i];
					mintag = i;
				}
			}

			scores[maxtag] = 0;
			scores[mintag] = 0;

			int sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum = sum + scores[i];
			}

			int average = sum / (scores.length - 2);

			System.out.printf("%d\n", average);

		}

		sc.close();
	}
}