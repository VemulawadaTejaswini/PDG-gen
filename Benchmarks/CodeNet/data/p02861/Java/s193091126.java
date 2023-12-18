import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		double sum = 0;
		int c;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				c = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				sum += Math.sqrt(c) * 2 / n;
			}
		}
		System.out.println(sum);
	}

}
