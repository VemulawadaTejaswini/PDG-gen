import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double[][] ta = new Double[n][2];
		for (int i = 0; i < n; i++) {
			ta[i][0] = sc.nextDouble();
			ta[i][1] = sc.nextDouble();
		}
		Double t = ta[0][0];
		Double a = ta[0][1];

		for (int i = 1; i < n; i++) {
			Double x = Math.ceil(Math.max(t/ta[i][0], a/ta[i][1]));
			t = x*ta[i][0];
			a = x*ta[i][1];
		}
		System.out.println((long)(t+a));
		sc.close();
	}
}