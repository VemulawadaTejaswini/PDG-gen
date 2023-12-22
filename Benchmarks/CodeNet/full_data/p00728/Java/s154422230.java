import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int val = sc.nextInt();
			if (val == 0) {
				break;
			}
			fig_ave(val);
		}
	}

	public static void fig_ave(int cou) {
		System.out.println("?????????????????\???????????????");
		int[] score = new int[cou];
		int sum = 0;
		int max = 0;
		int min = 1001;

		for (int i = 0; i < cou; i++) {
			score[i] = sc.nextInt();

			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}

			if (i == cou - 1) {
				for (int j = 0; j < cou; j++) {
					sum = sum + score[j];
					if (j == cou - 1) {
						sum = (sum - max - min) / (cou - 2);
						System.out.println(sum);
					}
				}
			}

		}
	}
}