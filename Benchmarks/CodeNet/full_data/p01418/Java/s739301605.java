import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		double R = (double) sc.nextInt();
		double L = (double) sc.nextInt();

		double P = sc.nextDouble();
		double E = sc.nextDouble();
		double T = sc.nextDouble();

		sc.close();

		Deque<Seek> deque = new ArrayDeque<Seek>();
		deque.add(new Seek(R, L, 1.0, 0));

		double ans = 0;
		while (!deque.isEmpty()) {
			Seek seek = deque.poll();
			if (T - E <= seek.r && seek.l <= T + E) {
				ans += seek.p;
				continue;
			}
			if (seek.l <= T - E || T + E <= seek.r) {
				continue;
			}

			double h = (seek.r + seek.l) / 2;
			if (seek.k == K) {
				if (T - E <= h && h <= T + E) {
					ans += seek.p;
				}
				continue;
			}
			if (Math.abs(seek.l - T) >= Math.abs(seek.r - T)) {
				deque.add(new Seek(seek.r, h, (1 - P) * seek.p, seek.k + 1));
				deque.add(new Seek(h, seek.l, P * seek.p, seek.k + 1));
			} else {
				deque.add(new Seek(seek.r, h, P * seek.p, seek.k + 1));
				deque.add(new Seek(h, seek.l, (1 - P) * seek.p, seek.k + 1));
			}

		}

		// 小数第6位まで表示
		BigDecimal bd = new BigDecimal(String.valueOf(ans));
		System.out.println(bd.setScale(6, BigDecimal.ROUND_HALF_UP));

	}
}

class Seek {
	double r, l, p;
	int k;

	public Seek(double r, double l, double p, int k) {
		this.r = r;
		this.l = l;
		this.p = p;
		this.k = k;
	}
}