import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double v1, v2, v3;
		String str[];
		double s;

		s = 0.0;
		str = sc.next().split(",");
		v1 = new Point2D.Double(Double.valueOf(str[0]), Double.valueOf(str[1]));
		str = sc.next().split(",");
		v2 = new Point2D.Double(Double.valueOf(str[0]), Double.valueOf(str[1]));
		while (sc.hasNext()) {
			str = sc.next().split(",");
			v3 = new Point2D.Double(Double.valueOf(str[0]), Double.valueOf(str[1]));
			double a = Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2));
			double b = Math.sqrt(Math.pow(v3.x - v1.x, 2) + Math.pow(v3.y - v1.y, 2));
			double c = Math.sqrt(Math.pow(v3.x - v2.x, 2) + Math.pow(v3.y - v2.y, 2));
			double z = (a + b + c) / 2;
			s += Math.sqrt(z * (z - a) * (z - b) * (z - c));
			v2 = v3;
		}
		System.out.println(s);
	}
}