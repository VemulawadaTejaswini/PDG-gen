import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] array = new double[n + 1];
		array[0] = 0.;
		for (int i = 1; i <= n; ++i) {
			array[i] = sc.nextDouble() / 2. + 0.5 + array[i - 1];
		}
		
		double max = 0;
		for (int i = 0; i < n - k + 1; ++i) {
			double sum = array[i + k] - array[i];
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
