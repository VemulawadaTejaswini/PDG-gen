import java.util.Scanner;

public class Main {

	static int n;
	static int[] x, y;
	
	static double calcMinkowskiDist(int p) {
		double d = 0.0;
		for (int i = 0; i < n; i++) {
			d += Math.pow(Math.abs(x[i] - y[i]), p);
		}
		d = Math.pow(d, 1.0 / p);
		
		return d;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		x = new int[n];
		y = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			y[i] = scan.nextInt();
		}
		
		for (int p = 1; p <= 3; p++) {
			System.out.println(calcMinkowskiDist(p));
		}

		double d = 0.0;
		
		for (int i = 0; i < n; i++) {
			d = Math.max(d, Math.abs(x[i] - y[i]));
		}
		
		System.out.println(d);
		scan.close();
	}

}