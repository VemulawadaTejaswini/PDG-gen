import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			double[] locate = new double[6];
			String[] locatestr = str.split(" ");
			for (int j = 0; j < 6; j++) {
				locate[j] = Double.parseDouble(locatestr[j]);
			}
			double sub21x = locate[2] - locate[0];
			double sum21x = locate[2] + locate[0];
			double sub21y = locate[3] - locate[1];
			double sum21y = locate[3] + locate[1];
			double sub32x = locate[4] - locate[2];
			double sum32x = locate[4] + locate[2];
			double sub32y = locate[5] - locate[3];
			double sum32y = locate[5] + locate[3];
			double[] ans = Simultaneous(2 * sub21x, 2 * sub21y, sub21x * sum21x
					+ sub21y * sum21y, 2 * sub32x, 2 * sub32y, sub32x * sum32x
					+ sub32y * sum32y);
			Radius(ans[0], ans[1], locate[0], locate[1]);
		}
	}
	public static void Radius(double xp, double yp, double x1, double y1) {
		DecimalFormat df = new DecimalFormat("0.000");
		double radius = Math.pow((xp - x1) * (xp - x1) + (yp - y1) * (yp - y1),
				0.5);
		System.out.println(df.format(radius));
	}
	public static double[] Simultaneous(double a, double b, double c, double d,
			double e, double f) {
		DecimalFormat df = new DecimalFormat("0.000");
		double x = (double) (e * c - b * f) / (a * e - b * d);
		double y = (double) (a * f - c * d) / (a * e - b * d);
		System.out.print(df.format(x) + " " + df.format(y) + " ");
		double[] ans = { x, y };
		return ans;
	}
}