import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = scan.nextInt();
		}
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double din = Math.abs(x[0] - y[0]);
		for (int i = 0; i < n; i++) {
			int xy = Math.abs(x[i] - y[i]);
			d1 += xy;
			d2 += xy * xy;
			d3 += xy * xy * xy;
			if (din < xy) din = xy;
		}
		System.out.println(d1);
		System.out.println(Math.sqrt(d2));
		System.out.println(Math.cbrt(d3));
		System.out.println(din);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}