import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double D1, D2, D3, Dx;
		double sum1 = 0, sum2 = 0, sum3 = 0, max = 0;
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum1 += Math.abs(x[i] - y[i]);
			sum2 += Math.pow(Math.abs(x[i] - y[i]), 2);
			sum3 += Math.pow(Math.abs(x[i] - y[i]), 3);
			max = Math.max(max, Math.abs(x[i] - y[i]));
		}
		D1 = sum1;
		D2 = Math.sqrt(sum2);
		D3 = Math.cbrt(sum3);
		Dx = max;
		System.out.printf("%f%n", D1);
		System.out.printf("%f%n", D2);
		System.out.printf("%f%n", D3);
		System.out.printf("%f%n", Dx);
		sc.close();
	}
}
