import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] array = new double[n];
		for (int i = 0; i < n; ++i) {
			array[i] = sc.nextDouble() / 2. + 0.5;
		}
		double max = 0;
		int maxIndex = -1;
		for (int i = 0; i < n - k + 1; ++i) {
			double sum = 0;
			for (int j = 0; j < k; ++j) {
				sum += array[i + j];
			}
			if (sum > max) {
				max = sum;
				maxIndex = i;
			}
		}
		double res = 0.;
		for (int i = 0; i < k; i++) {
			res += array[i + maxIndex];
		}
		System.out.println(res);
	}
}
