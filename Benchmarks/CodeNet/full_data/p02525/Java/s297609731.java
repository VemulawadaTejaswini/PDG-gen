

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int size = 1000, sum;
			double a, b;
			int[] list = new int[size];
			int n = sc.nextInt();
			if (n == 0)
				break;

			sum = 0;
			for (int i = 0; i < n; i++) {
				int input = sc.nextInt();
				list[i] = input;
				sum += list[i];
			}
			a = 0;
			double avg = (double) (sum / n);
			for (int j = 0; j < n; j++) {
				a += Math.pow(list[j] - avg, 2) / n;
			}
			b = Math.sqrt(a);
			System.out.println(b);
		}
	}
}