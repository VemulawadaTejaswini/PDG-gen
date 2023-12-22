
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while (true) {

			double hei = 0, sum = 0;
			n = sc.nextInt();

			double[] s = new double[n];
			double[] si = new double[n];

			if (n == 0)
				break;

			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				hei += s[i];
			}

			hei = hei / n;

			for (int i = 0; i < n; i++) {
				si[i] = Math.pow(s[i] - hei, 2);
				sum += si[i];
			}

			System.out.printf("%.8f\n", Math.sqrt(sum / n));
		}
		sc.close();

	}
}

