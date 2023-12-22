
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> output = new LinkedList<String>();
		double[] p = new double[6];//0a 1b 2c 3d 4e 5f
		double a, b, c, d, e, f;
		while (in.hasNext()) {
			for (int i = 0; i < p.length; i++) {
				p[i] = in.nextDouble();
			}
			a = p[0];
			b = p[1];
			c = p[2];
			d = p[3];
			e = p[4];
			f = p[5];
			double y = (c * d - a * f) / (b * d - a * e);
			double x = (c * e - b * f) / (a * e - b * d);
			BigDecimal X = new BigDecimal(x);
			BigDecimal Y = new BigDecimal(y);
			X = X.setScale(3, BigDecimal.ROUND_HALF_UP);
			Y = Y.setScale(3, BigDecimal.ROUND_HALF_UP);
			output.add(String.format("%.3f %.3f", X, Y));
		}
		in.close();
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
}