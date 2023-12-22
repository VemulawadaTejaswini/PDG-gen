import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-6;

	int n;
	P[] ps;
	double rad;

	void run() {
		n = sc.nextInt();
		ps = new P[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			ps[i] = new P(x, y, z);
		}
		rad = sc.nextInt();
		solve();
	}

	void solve() {
		int max = 1;
		for (int trial = 0; trial < 10; trial++) {
			Random rand = new Random(trial * trial * trial);
			double d1 = rand.nextDouble() * PI, d2 = rand.nextDouble() * PI, d3 = rand
					.nextDouble()
					* PI;
			for (int i = 0; i < n; i++) {
				ps[i] = ps[i].div(ps[i].norm());
				P p = ps[i];
				double cos = cos(d1), sin = sin(d1);
				p = new P(p.x * cos - p.y * sin, p.x * sin + p.y * cos, p.z);
				cos = cos(d2);
				sin = sin(d2);
				p = new P(p.x, p.y * cos - p.z * sin, p.y * sin + p.z * cos);
				cos = cos(d3);
				sin = sin(d3);
				p = new P(p.z * sin + p.x * cos, p.y, p.z * cos - p.x * sin);
				ps[i] = p;
			}
			rad = toRadians(rad);
			double cos = cos(rad), sin = sin(rad);

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					P P = ps[i], Q = ps[j];
					double A, B, C, D;
					{
						double a = -(P.x * Q.z - Q.x * P.z);
						double b = (Q.z - P.z) * cos * cos;
						double c = (P.y * Q.z - Q.y * P.z);
						A = a / c;
						B = b / c;
					}
					{
						double a = -(P.x * Q.y - Q.x * P.y);
						double b = (Q.y - P.y) * cos * cos;
						double c = (P.z * Q.y - Q.z * P.y);
						C = a / c;
						D = b / c;
					}
					for (double vx : quad(1 + A * A + C * C,
							2 * (A * B + C * D), B * B + D * D - cos * cos)) {
						double vy = A * vx + B, vz = C * vx + D;
						P v = new P(vx, vy, vz);
						int count = 0;
						for (int k = 0; k < n; k++) {
							double acos = acos(v.dot(ps[k])
									/ (v.norm() * ps[k].norm()));
							if (abs(acos) < rad + EPS) {
								count++;
							}
						}
						max = max(max, count);
					}
				}
			}
		}
		println(max + "");
	}

	double[] quad(double a, double b, double c) {
		double D = b * b - 4 * a * c;
		if (D + EPS < 0) {
			return new double[0];
		}
		D = max(D, 0);
		return new double[] { (-b - sqrt(D)) / (2 * a), 2 * c / (-b - sqrt(D)) };
	}

	class P {
		double x, y, z;

		P(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;

		}

		double dot(P p) {
			return x * p.x + y * p.y + z * p.z;
		}

		P div(double d) {
			return new P(x / d, y / d, z / d);
		}

		double norm() {
			return sqrt(x * x + y * y + z * z);
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}