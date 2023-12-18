import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			x[i] = input - (i + 1);
		}

		Arrays.sort(x);

		int d;
		int minSadness = Integer.MAX_VALUE;
		if (n % 2 == 0) {
			int d1 = x[n / 2 - 1];
			int d2 = x[n / 2];
			for (int j = d1; j <= d2; j++) {
				int sadness = 0;
				for (int i = 0; i < n; i++) {
					sadness += Math.abs(x[i] - j);
				}
				if (sadness < minSadness) {
					minSadness = sadness;
				}
			}
		} else {
			d = x[(n - 1) / 2];
			minSadness = 0;
			for (int i = 0; i < n; i++) {
				minSadness += Math.abs(x[i] - d);
			}
		}

		System.out.println(minSadness);
	}

}
