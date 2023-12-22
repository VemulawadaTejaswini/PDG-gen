import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] c1 = new double[3];// center
		double[] v11 = new double[3];
		double[] v12 = new double[3];
		double[] c2 = new double[3];
		double[] v21 = new double[3];
		double[] v22 = new double[3];
		for (int i = 0; i < 3; ++i)
			c1[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i)
			v11[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i)
			v12[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i)
			c2[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i)
			v21[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i)
			v22[i] = sc.nextDouble();
		for (int i = 0; i < 3; ++i) {
			c2[i] -= c1[i];
		}
		for (int i = 0; i < 3; ++i) {
			c1[i] -= c1[i];
		}
		double[] v13 = new double[3];
		for (int i = 0; i < 3; ++i) {
			v13[i] = v11[(i + 1) % 3] * v12[(i + 2) % 3] - v11[(i + 2) % 3] * v12[(i + 2) % 3];
		}

		double norm = 0;
		for (int i = 0; i < 3; ++i) {
			norm += v11[i] * v11[i];
		}
		norm = Math.sqrt(norm);

		for (int i = 0; i < 3; ++i) {
			v13[i] /= norm;
		}

		v21 = convert(v11, v12, v13, norm, v21);
		v22 = convert(v11, v12, v13, norm, v22);
		c2 = convert(v11, v12, v13, norm, c2);

		ArrayList<Double> o = new ArrayList<>();
		ArrayList<Double> dist = new ArrayList<>();
		for (double i = 0; i < 2 * Math.PI; i += 2 * Math.PI / 1000000) {
			double[] v = new double[3];
			for (int j = 0; j < 3; ++j) {
				v[j] = v21[j] * Math.cos(i) + v22[j] * Math.sin(i) + c2[j];
			}
			if (Math.abs(v[2]) < 0.0001) {
				o.add(i);
				dist.add(Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]));
			}
		}
		int over = 0, less = 0;
		for (double d : dist) {
			if (d > 1)
				++over;
			else
				++less;
		}
		if (over >= 1 && less >= 1) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");

	}

	static double[] convert(double[] v1, double[] v2, double[] v3, double norm, double[] subject) {
		double[] ret = new double[3];
		for (int i = 0; i < 3; ++i) {
			ret[0] += v1[i] * subject[i];
			ret[1] += v2[i] * subject[i];
			ret[2] += v3[i] * subject[i];
		}

		for (int i = 0; i < 3; ++i) {
			ret[i] /= norm;
		}
		return ret;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}