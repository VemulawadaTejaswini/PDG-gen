import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, ax, by, g1, g2, g3;
		while (sc.hasNext()) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			ax = sc.nextDouble();
			by = sc.nextDouble();
			g1 = x1 * by - y1 * ax;
			g2 = x2 * by - y2 * ax;
			g3 = x3 * by - y3 * ax;
			if ((g1 >= 0 & g2 >= 0 & g3 >= 0)|(g1 < 0 & g2 < 0 & g3 < 0)) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}