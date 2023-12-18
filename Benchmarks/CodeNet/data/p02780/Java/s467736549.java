import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] ave = new double[n];

		for (int i = 0; i < n; i++) {
			int roll = sc.nextInt();
			ave[i] = (double) (roll + 1) / 2;
		}

		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += ave[i];
		}
		double max = 0;

		for (int i = 0; i < n - k; i++) {
			sum = sum - ave[i] + ave[i + k];
			max = Math.max(max, sum);
		}

		System.out.println(max);

	}

}
