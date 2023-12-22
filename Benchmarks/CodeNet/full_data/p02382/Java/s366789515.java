import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = in.nextInt();
		}
		
		double max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, Math.abs(x[i] - y[i]));
		}
		
		out.println(minkowski(n, x, y, 1));
		out.println(minkowski(n, x, y, 2));
		out.println(minkowski(n, x, y, 3));
		out.println(max);
	}
	static double minkowski(int n, int[] x, int[] y, int p) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double temp = Math.abs(x[i] - y[i]);
			sum += Math.pow(temp, p);
		}
		return Math.pow(sum, 1.0 / p);
	}
}