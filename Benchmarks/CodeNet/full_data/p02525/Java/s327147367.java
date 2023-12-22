import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			double m = 0.0;
			double aa = 0.0;
			int sum = 0;

			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum = sum + s[i];
			}
			m = sum / n;
			double x = 0.0;
			for (int i = 0; i < n; i++) {
				x = x + (s[i] - m) * (s[i] - m);
			}
			aa = x / n;
			System.out.println(aa);
		}

	}
}