import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double[] d = new double[6];
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			for (int i = 0; i < d.length; i++) {
				d[i] = sc.nextDouble();
			}
			double dv = d[0] * d[4] - d[1] * d[3];
			if (Double.compare(dv, 0.0f) == 0) {
				continue;
			}
			double[][] m1 = { { d[4] / dv, -d[1] / dv },
					{ -d[3] / dv, d[0] / dv } };
			double[][] m2 = { { d[2] }, { d[5] } };
			double x = m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0];
			double y = m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0];
			System.out.println(String.format("%.3f %.3f", x, y));
		}
	}
}