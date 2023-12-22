import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		final int p1 = 1;
		final int p2 = 2;
		final int p3 = 3;
		final int pinf = 0;

		int n;
		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];

		inputLine(n, x, stdIn);
		inputLine(n, y, stdIn);

		System.out.format("%.6f\n", distance(x,y,p1));
		System.out.format("%.6f\n", distance(x,y,p2));
		System.out.format("%.6f\n", distance(x,y,p3));
		System.out.format("%.6f\n", distance(x,y,pinf));
	}

	public static void inputLine(int n, int[] array, Scanner stdIn) {
		for (int i = 0; i < n; i++) {
			array[i] = stdIn.nextInt();
		}
	}

	public static double distance(int[] x, int[] y, int p) {
		double d = 0.0;
		double pinf = 0.0;

		for (int i = 0; i < x.length; i++) {
			int temp = 0;

			temp += Math.abs(x[i] - y[i]);
			d += Math.pow(temp, p);

			if(pinf < temp) {
				pinf = temp;
			}
		}
		switch (p) {
		case 2:
			return Math.sqrt(d);

		case 3:
			return Math.cbrt(d);

		case 0:
			return pinf;

		default:
			return d;

		}
	}
}