import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r[] = new int[n];
		for (int i = 0; i < r.length; i++) {
			r[i] = sc.nextInt();
		}
		double c[] = new double[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = r[i];
			for (int j = 0; j < i; j++) {
				double t = Math.sqrt(4 * r[i] * r[j]);
				c[i] = Math.max(c[j] + t, c[i]);
			}
		}
		double max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, c[i] + r[i]);
		}
		System.out.println(max);
		sc.close();
	}
}