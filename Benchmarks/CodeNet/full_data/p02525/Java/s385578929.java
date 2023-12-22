

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum = 0, j = 0;
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] point = new int[n];
			for (int i = 0; i < n; i++) {
				point[i] = sc.nextInt();
				sum += point[i];
			}
			double ave = 0, var = 0;
			ave = (double) sum / n;
			for (int i = 0; i < n; i++) {
				j += (point[i] - ave) * (point[i] + ave);
			}
			var = (double) j / n;
			System.out.println(Math.sqrt(var));
		}
	}

}