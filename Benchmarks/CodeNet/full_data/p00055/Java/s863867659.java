import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double[] a = new double[10];
			a[0] = sc.nextDouble();
			double s = a[0];
			for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
					a[i] = a[i - 1] / 3;
				} else {
					a[i] = a[i - 1] * 2;
				}
				s+=a[i];
			}
			System.out.println(s);
		}
	}
}