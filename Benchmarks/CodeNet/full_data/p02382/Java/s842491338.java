import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] x = new int[n], y = new int[n];
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 0; i < n; ++i) {
			y[i] = sc.nextInt();
		}
		double p1 = 0;
		for (int i = 0; i < n; ++i) {
			p1 += Math.abs(x[i] - y[i]);
		}
		double p2 = 0;
		for (int i = 0; i < n; ++i) {
			p2 += (x[i] - y[i]) * (x[i] - y[i]);
		}
		p2 = Math.sqrt(p2);
		double p3 = 0;
		for (int i = 0; i < n; ++i) {
			p3 += Math.abs((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]));
		}
		p3 = Math.cbrt(p3);
		double p4 = -0;
		for (int i = 0; i < n; ++i) {
			p4 = Math.max(p4, Math.abs(x[i] - y[i]));
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		sc.close();
	}
}
