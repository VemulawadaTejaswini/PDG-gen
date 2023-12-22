import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			double[] x = new double[n + m];
			double[] y = new double[n + m];
			for (int i = 0; i < n + m; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}

			for (int i = 0; i < n; ++i) {
				for (int j = n; j < n + m; ++j) {
					/*
					 * y-y1=(y2-y1)/(x2-x1)(x-x1) (y-y1)(x2-x1)=(x-x1)(y2-y1)
					 * 0=(y2-y1)*x-(x2-x1)*y+y1(x2-x1)-x1(y2-y1)
					 */

					double a = y[j] - y[i];
					double b = -(x[j] - x[i]);
					double c = -x[i] * (y[j] - y[i]) + y[i] * (x[j] - x[i]);

					/*
					 * ax+by+c=0;
					 */

					ArrayList<Integer> positive = new ArrayList<>();
					ArrayList<Integer> negative = new ArrayList<>();
					ArrayList<Integer> zero = new ArrayList<>();
					zero.add(i);
					zero.add(j);
					for (int k = 0; k < n; ++k) {
						if (k == i)
							continue;
						double sign1 = Math.signum(a * x[k] + b * y[k] + c);
						if (sign1 > 0)
							positive.add(k);
						else if (sign1 == 0)
							zero.add(k);
						else if (sign1 < 0)
							negative.add(k);

					}
					for (int k = n; k < n + m; ++k) {
						if (k == j)
							continue;
						double sign2 = Math.signum(a * x[k] + b * y[k] + c);
						if (sign2 > 0)
							positive.add(k);
						else if (sign2 == 0)
							zero.add(k);
						else if (sign2 < 0)
							negative.add(k);
					}

					if (positive.size() > 0 && positive.get(0) < n && positive.get(positive.size() - 1) >= n) {
						continue;
					}
					if (negative.size() > 0 && negative.get(0) < n && negative.get(negative.size() - 1) >= n) {
						continue;
					}
					if (zero.size() > 0) {
						class cor implements Comparable<cor> {
							double x;
							double y;

							public cor(double x, double y) {
								this.x = x;
								this.y = y;
							}

							public int compareTo(cor o) {
								if (x != o.x)
									return Double.compare(x, o.x);
								else
									return Double.compare(y, o.y);
							};
						}
						ArrayList<cor> lis1 = new ArrayList<>();
						ArrayList<cor> lis2 = new ArrayList<>();
						for (int k : zero) {
							if (k < n) {
								lis1.add(new cor(x[k], y[k]));
							} else {
								lis2.add(new cor(x[k], y[k]));
							}
						}
						Collections.sort(lis1);
						Collections.sort(lis2);
						if (lis1.get(0).compareTo(lis2.get(lis2.size() - 1)) != lis1.get(lis1.size() - 1)
								.compareTo(lis2.get(0))) {
							continue;
						}
					}
					System.out.println("YES");
					continue outer;
				}

			}
			System.out.println("NO");
		}
	}
}