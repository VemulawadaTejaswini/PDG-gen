import java.util.Scanner;

public class Main {
	public static double Dxy(int[] x, int[] y, int p, int n) {
		double output = 0;
		for(int i = 0; i < n; i++) {
			output += Math.pow(Math.abs(x[i] - y[i]), (double)p);
		}
		output = Math.pow(output, (double)1.0 / p);
		return output;
	}
	public static void main(String[] args) {
		int p, i;
		double max = 0;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			for(p = 1; p <= 3; p++) {
				System.out.println(Dxy(a, b, p, n));
			}
			for(i = 0; i < n; i++) {
				if(max < Math.abs(a[i] - b[i])) {
					max = Math.abs(a[i] - b[i]);
				}
			}
			System.out.println(max);
		}
	}
}

