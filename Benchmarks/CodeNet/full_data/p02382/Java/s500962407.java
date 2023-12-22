import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}

		System.out.println(getManhattanDistance(n, x, y));
		System.out.println(getEucliDistance2(n, x, y));
		System.out.println(getEucliDistance3(n, x, y));
		System.out.println(getChebyshevDistance(n, x, y));

	}

	static double getManhattanDistance(int n, int x[], int y[]) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.abs(x[i] - y[i]);
		}

		return sum;
	}

	static double getEucliDistance2(int n, int x[], int y[]) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.pow(x[i] - y[i], 2);
		}

		return Math.sqrt(sum);
	}

	static double getEucliDistance3(int n, int x[], int y[]) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.pow(Math.abs(x[i] - y[i]), 3);
		}

		return Math.cbrt(sum);
	}

	static double getChebyshevDistance(int n, int x[], int y[]) {
		double max = Math.abs(x[0] - y[0]);
		for (int i = 1; i < n; i++) {
			if (max < Math.abs(x[i] - y[i])) {
				max = Math.abs(x[i] - y[i]);
			}
		}

		return max;
	}

}