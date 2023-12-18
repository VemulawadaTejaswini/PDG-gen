import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		boolean f = false;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			f |= a[i] >= k;
		}
		if (!f) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		int gcd = a[0];
		for (int i = 0; i < n; ++i) {
			gcd = gcd(a[i], gcd);
		}
		if (k % gcd == 0) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	int gcd(int a, int b) {
		// pa + qb = x
		// ua + vb = y
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int p = 1, q = 0, u = 0, v = 1;
		int x = a;
		int y = b;
		while (y > 0) {
			p -= x / y * u;
			q -= x / y * v;
			x -= x / y * y;
			int tmp = p;
			p = u;
			u = tmp;
			tmp = q;
			q = v;
			v = tmp;
			tmp = x;
			x = y;
			y = tmp;
		}
		return x;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
