import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double a[] = new double[n];
		double s = 0;

		for (int i = 0; i < n; i++) {
			a[i] = 1 / sc.nextDouble();
			s += a[i];
		}
		sc.close();
		System.out.println(1 / s);
	}
}