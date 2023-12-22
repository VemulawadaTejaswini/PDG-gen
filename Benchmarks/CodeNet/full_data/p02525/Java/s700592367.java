import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s;
		double m, i;
		int k;
		while (true) {
			m = 0;
			i = 0;
			n = sc.nextInt();
			if (n == 0)
				break;
			s = new int[n];
			for (k = 0; k < n; k++) {
				s[k] = sc.nextInt();
				m += s[k];
			}
			m = m / n;

			for (k = 0; k < n; k++) {
				i += Math.pow(s[k] - m, 2);
			}
			i = Math.sqrt(i / n);
			System.out.printf("%lf", i);
		}
	}
}