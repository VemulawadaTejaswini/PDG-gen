

import java.util.Scanner;

public class Main
 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (0 == n) {
				break;
			}
			Double[] s = new Double[n];
			Double m = 0.0;
			for (int i = 0; i < n; i++) {
				s[i] = scan.nextDouble();
				m += s[i];
			}
			m = m / n;
			double result = 0;
			double temp = 0;
			for (int i = 0; i < n; i++) {
				temp += (s[i] - m) * (s[i] - m);
			}
			result = Math.sqrt((temp / n));
			System.out.printf("%.10s\n", result);
		}
	}

}