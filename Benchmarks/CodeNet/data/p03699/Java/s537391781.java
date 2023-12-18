import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] score = new int[N];
		int grandTotal = 0;
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
			grandTotal += score[i];
		}

		if (grandTotal % 10 != 0) {
			System.out.println(grandTotal);
			return;
		} else {
			Arrays.sort(score);
			for (int i = 0; i < N; i++) {
				if (score[i] % 10 != 0) {
					System.out.println(grandTotal - score[i]);
					return;
				}
			}
		}

		System.out.println(0);
		sc.close();
	}

}
