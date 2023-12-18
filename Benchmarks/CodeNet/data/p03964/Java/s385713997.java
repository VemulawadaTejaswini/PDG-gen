import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] ta = new double[n][2];
		for (int i = 0; i < n; i++) {
			ta[i][0] = sc.nextDouble();
			ta[i][1] = sc.nextDouble();
		}
		double t = 1;
		double a = 1;

		for (int i = 0; i < n; i++) {
			long x = (long)Math.ceil(Math.max(t/ta[i][0], a/ta[i][1]));
			t = (long)(x*ta[i][0]);
			a = (long)(x*ta[i][1]);
		}
		System.out.println((long)(t+a));
		sc.close();
	}
}