import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int p = sc.nextInt();
			int n = sc.nextInt();
			if ((p | n) == 0)
				break;
			double max = 0;
			double min = Double.POSITIVE_INFINITY;
			double rp = Math.sqrt(p);
			int a = 1;
			int b = 1;
			int u = 0;
			int v = 0;
			int x = 0;
			int y = 0;
			while (true) {
				if (1.0 * a / b > rp) {
					if (min > 1.0 * a / b) {
						min = 1.0 * a / b;
						x = a;
						y = b;
					}
					b++;
					if (a > n)
						break;
				} else {
					if (max < 1.0 * a / b) {
						max = 1.0 * a / b;
						u = a;
						v = b;
					}
					a++;
					if (b > n)
						break;
				}
			}
			int g1 = gcd(x, y);
			int g2 = gcd(u, v);
			x /= g1;
			y /= g1;
			u /= g2;
			v /= g2;
			System.out.println(x + "/" + y + " " + u + "/" + v);
		}
	}

	int gcd(int a, int b) {
		if (a < b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}