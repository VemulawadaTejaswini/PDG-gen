import static java.lang.Math.toRadians;

import java.awt.geom.AffineTransform;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	AffineTransform affin = new AffineTransform();
	while (in.hasNext()) {
		String[] input = in.next().split(",");
		int length = Integer.parseInt(input[0]);
		double radian = toRadians(-Double.parseDouble(input[1]));
		if (length != 0 || radian != 0) {
			affin.translate(0, length);
			affin.rotate(radian, 0, 0);
		} else {
			System.out.println((int) affin.getTranslateX());
			System.out.println((int) affin.getTranslateY());
			affin.setToIdentity();
		}
	}
}
}