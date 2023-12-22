import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}

		System.out.println(distance(x, y, 1));
		System.out.println(distance(x, y, 2));
		System.out.println(distance(x, y, 3));
		System.out.println(distance_inf(x, y));

	}
	private static double distance_inf(int[] x, int[] y) {
		double D = 0.0;

		for (int i = 0; i < x.length; i++) {
			D = Math.max(D, Math.abs((double)x[i] - (double)y[i]));
		}

		return D;
	}
	private static double distance(int[] x, int[] y, int power) {
		double D = 0.0;

		for (int i = 0; i < x.length; i++) {
			D += Math.pow(Math.abs((double)x[i] - (double)y[i]), (double)power);
		}

		D = Math.pow(D, 1/(double)power);

		return D;
	}

}
