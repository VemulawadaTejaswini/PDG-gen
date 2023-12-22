import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	class P {
		double x;
		double y;

		P(double x, double y) {
			this.x = x;
			this.y = y;
		}

		P add(P a) {
			return new P(x + a.x, y + a.y);
		}

		P mul(double a) {
			return new P(x * a, y * a);
		}

		double abs() {
			return Math.sqrt(x * x + y * y);
		}
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			P[] p = new P[3];
			double v = 0;
			for (int i = 0; i < 3; i++) {
				p[i] = new P(sc.nextDouble(), sc.nextDouble());
				v += Math.abs(p[i].x) + Math.abs(p[i].y);
			}
			if (v < 1) {
				break;
			}

			P[] t = new P[3];
			double len[] = new double[3];
			for (int i = 0; i < 3; i++) {
				P p1 = p[(i + 1) % 3].add(p[i].mul(-1));
				P p2 = p[(i + 2) % 3].add(p[i].mul(-1));
				double p1l = p1.abs();
				double p2l = p2.abs();
				P np1 = p1.mul(1 / p1l);
				P np2 = p2.mul(1 / p2l);

				P tt = np1.add(np2);
				t[i] = tt.mul(1 / tt.abs());
				// t[i] = np1.add(np2).mul(0.5);

				len[i] = Math.min(p1.abs(),
						p2.abs());

			}

			double min = 0;
			double max = len[0];
			// double max = t[0].add(p[0].mul(-1)).abs();

			P a[] = new P[3];
			double r[] = new double[3];

			for (;;) {
				// System.out.println(min+" "+max);
				if (Math.abs(min - max) < 1e-6) {
					break;
				}

				double p0 = (min + max) / 2;

				a[0] = t[0].mul(p0).add(p[0]);

				{
					P org = p[0].mul(-1);

					P a0 = a[0].add(org);
					P p1 = p[1].add(org);
					double lp1 = p1.abs();
					P p1v = p1.mul(1 / lp1);

					double dot = a0.x * p1v.x + a0.y * p1v.y;

					// System.out.println("dot"+dot);
					r[0] = Math.sqrt(p0 * p0 - dot * dot);
				}
				// System.out.println(a[0].x + " _81_ "+a[0].y + " "+ r[0]);

				double min1 = 0;
				double max1 = len[1];
				for (;;) {
					if (Math.abs(min1 - max1) < 1e-6) {
						break;
					}
					double p1 = (min1 + max1) / 2;
					a[1] = t[1].mul(p1).add(p[1]);

					{
						P org = p[1].mul(-1);

						P a0 = a[1].add(org);
						P p2 = p[0].add(org);
						double lp1 = p2.abs();
						P p1v = p2.mul(1 / lp1);

						double dot = a0.x * p1v.x + a0.y * p1v.y;

						r[1] = Math.sqrt(p1 * p1 - dot * dot);
					}

					// System.out.println(a[1].x + " _105_ "+a[1].y + " "+
					// r[1]);

					double diff = a[1].mul(-1).add(a[0]).abs();

					if (diff < r[1] + r[0]) {
						max1 = p1;
						// System.out.println("m1");
					} else {
						min1 = p1;
						// System.out.println("m2");
					}
				}

				double min2 = 0;
				double max2 = len[2];
				for (;;) {
					if (Math.abs(min2 - max2) < 1e-6) {
						break;
					}
					double p1 = (min2 + max2) / 2;
					a[2] = t[2].mul(p1).add(p[2]);

					{
						P org = p[2].mul(-1);

						P a0 = a[2].add(org);
						P p2 = p[0].add(org);
						double lp1 = p2.abs();
						P p1v = p2.mul(1 / lp1);

						double dot = a0.x * p1v.x + a0.y * p1v.y;

						r[2] = Math.sqrt(p1 * p1 - dot * dot);
					}
					// System.out.println(a[2].x + " _139_ "+a[2].y + " "+
					// r[2]);

					double diff = a[2].mul(-1).add(a[0]).abs();

					if (diff < r[2] + r[0]) {
						max2 = p1;
					} else {
						min2 = p1;
					}
				}

				// System.out.println(a[1].mul(-1).add(a[0]).abs() +
				// " "+r[1]+" "+r[0]);

				{
					P p1 = a[0];
					P p2 = p[0];
					P p3 = a[1];
					P p4 = a[2];
					{
						P org = p3.mul(-1);
						p1 = p1.add(org);
						p2 = p2.add(org);

						p4 = p4.add(org);

						double a1 = -p1.x * p4.y + p1.y * p4.x;
						double a2 = -p2.x * p4.y + p2.y * p4.x;
						if (a1 * a2 < 0) {
					//		System.err.println("here");
						//	max = p0;
							//continue;
						}
					}
				}

				double diff = a[2].mul(-1).add(a[1]).abs();
				// System.out.println(" a "+diff);
				if (diff > r[2] + r[1]) {
					max = p0;
					// System.out.println(" < "+r[0]);
				} else {
					min = p0;
					// System.out.println(" > "+r[0]);
				}

			}
			for (int i = 0; i < 3; i++) {
//				System.out.println("x:" + a[i].x + " y:" + a[i].y + " r:"
	//					+ r[i]);
			}
		//	Arrays.sort(r);
			System.out.println(r[0] + " " + r[1] + " " + r[2]);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}