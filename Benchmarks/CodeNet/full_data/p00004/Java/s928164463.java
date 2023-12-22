import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			double mag = (double) d / a;
			double y = (mag * c - f) / (mag * b - e);
			double x = (f - e * y) / d;
			if (x == 0) {
				x = Math.abs(x);
			}
			if (y == 0) {
				y = Math.abs(y);
			}
			BigDecimal X = new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal Y = new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP);
			ret.add(String.format("%.3f", X) + " " + String.format("%.3f", Y));
		}
		for (String text : ret) {
			System.out.println(text);
		}
	}
}