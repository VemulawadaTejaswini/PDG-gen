import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static double[] x, y, z;

	public static void main(String[] args) {
		int T = sc.nextInt();
		OUT: for (int i = 0; i < T; ++i) {
			double QR = sc.nextDouble();
			double RP = sc.nextDouble();
			double PQ = sc.nextDouble();
			int N = sc.nextInt();
			x = new double[N];
			y = new double[N];
			z = new double[N];
			for (int j = 0; j < N; ++j) {
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
				z[j] = sc.nextDouble();
			}
			for (int p = 0; p < N; ++p) {
				for (int q = 0; q < N; ++q) {
					if (q == p) continue;
					for (int r = 0; r < N; ++r) {
						if (r == p || r == q) continue;
						double qr = dist(q, r);
						double rp = dist(r, p);
						double pq = dist(p, q);
						if (Math.abs((rp / qr - RP / QR) / (RP / QR)) <= 0.001
								&& Math.abs((pq / qr - PQ / QR) / (PQ / QR)) <= 0.001) {
							System.out.println((p + 1) + " " + (q + 1) + " " + (r + 1));
							continue OUT;
						}
					}
				}
			}
		}
	}

	static double dist(int i, int j) {
		return Math.sqrt(sq(x[i] - x[j]) + sq(y[i] - y[j]) + sq(z[i] - z[j]));
	}

	static double sq(double v) {
		return v * v;
	}

}