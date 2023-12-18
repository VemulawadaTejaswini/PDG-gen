import java.util.Scanner;

class Main {
	int a, b, c;
	int x, y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
	}

	void solve() {
		int cost = 0;
		if (a + b > 2 * c) {
			int min = Math.min(x, y);
			cost += 2 * c * min;
			x -= min;
			y -= min;
			if (a > 2 * c) {
				cost += 2 * c * x;
			} else {
				cost += a * x;
			}
			if (b > 2 * c) {
				cost += 2 * c * y;
			} else {
				cost += b * y;
			}
		} else {
			cost += a * x;
			cost += b * y;
		}
		System.out.println(cost);
	}
}