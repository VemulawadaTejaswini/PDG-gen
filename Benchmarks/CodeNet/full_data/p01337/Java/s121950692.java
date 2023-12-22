import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, A, B, C, D;
	static double EPS = 1e-8;

	public static void main(String[] args) {
		N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			if (A < 0) {
				A *= -1;
				B *= -1;
				C *= -1;
				D *= -1;
			}
			int[] ans = solve();
			System.out.println(ans[0] + " " + ans[1]);
		}
	}

	static int[] solve() {
		int[] ret = new int[2];
		int QA = 3 * A;
		int QB = 2 * B;
		int QC = C;
		int Q = QB * QB - 4 * QA * QC;
		if (Q < 0) {
			double f = f(0);
			if (f == 0) {
				return new int[] { 0, 0 };
			} else if (f > 0) {
				return new int[] { 0, 1 };
			} else {
				return new int[] { 1, 0 };
			}
		} else if (Q == 0) {
			double axis = -QB / 2.0 / QA;
			double f = f(axis);
			if (Math.abs(f) < EPS) {
				if (axis == 0) {
					return new int[] { 0, 0 };
				} else if (axis > 0) {
					return new int[] { 3, 0 };
				} else {
					return new int[] { 0, 3 };
				}
			} else {
				double f0 = f(0);
				if (f0 > 0) {
					return new int[] { 0, 1 };
				} else {
					return new int[] { 1, 0 };
				}
			}
		} else {
			double x1 = (-QB - Math.sqrt(Q)) / 2.0 / QA;
			double x2 = (-QB + Math.sqrt(Q)) / 2.0 / QA;
			double v1 = f(x1);
			double v2 = f(x2);
			if (Math.abs(v1) < EPS) {
				if (x1 < -EPS) {
					ret[1] += 2;
				} else if (x1 > EPS) {
					ret[0] += 2;
				}
			} else if (v1 > EPS) {
				double r = findRoot(-1000, x1, 1);
				if (r < -EPS) {
					ret[1]++;
				} else if (r > EPS) {
					ret[0]++;
				}
			}
			if (Math.abs(v2) < EPS) {
				if (x2 < -EPS) {
					ret[1] += 2;
				} else if (x2 > EPS) {
					ret[0] += 2;
				}
			} else if (v2 < EPS) {
				double r = findRoot(x2, 1000, 1);
				if (r < -EPS) {
					ret[1]++;
				} else if (r > EPS) {
					ret[0]++;
				}
			}
			if (v1 > EPS && v2 < EPS) {
				double r = findRoot(x1, x2, -1);
				if (r < -EPS) {
					ret[1]++;
				} else if (r > EPS) {
					ret[0]++;
				}
			}
			return ret;
		}
	}

	static double findRoot(double l, double r, int sign) {
		for (int i = 0; i < 1000; ++i) {
			double m = (l + r) / 2;
			double v = f(m) * sign;
			if (v < 0) {
				l = m;
			} else {
				r = m;
			}
		}
		return r;
	}

	static double f(double x) {
		return A * x * x * x + B * x * x + C * x + D;
	}

}