import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) break;
			int[] s = new int[n];
			double m = 0;
			double a = 0;
			for (int i = 0; i < n; i++) {
				s[i] = scan.nextInt();
				m += s[i];
			}
			m = m/n;
			for (int i = 0; i < n; i++) {
				a += (s[i] - m) * (s[i] - m);
			}
			System.out.println(Math.sqrt(a/n));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}