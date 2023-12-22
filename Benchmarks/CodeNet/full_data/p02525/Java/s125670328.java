import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] s = new int[n];
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < s.length; i++) {
				sum += s[i];
			}
			double m = 0.0;
			double aa = 0.0;
			m = sum / n;
			double x = 0.0;
			for (int i = 0; i < s.length; i++) {
				x = x + (s[i] - m) * (s[i] - m);
			}
			aa = x / n;
			double a;
			System.out.println(Math.sqrt(aa));
		}
	}
}