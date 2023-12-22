import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double m[], c[];
		double a[], b[];

		m = new double[100001];
		c = new double[100001];
		a = new double[100001];
		b = new double[100001];
		a[1] = 1;
		b[1] = 1;
		for (int i = 2; i < 100001; i++) {
			a[i] = a[i - 1] * a[i - 1] / 2 + (1.0 - a[i - 1]);
			b[i] += b[i - 1] + a[i];
		}
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(b[n]);
		}
	}
}