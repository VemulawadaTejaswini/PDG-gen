import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double p[];
		int n;
		int count;
		int max;

		n = sc.nextInt();
		while (n != 0) {
			p = new Point2D.Double[n];
			count = 0;
			max = 0;
			for (int i = 0; i < n; i++) {
				String s[] = sc.next().split(",");
				p[i] = new Point2D.Double(Double.valueOf(s[0]), Double.valueOf(s[1]));
			}
			for (int i = 0; i < n; i++) {
				count = 0;
				for (int j = 0; j < n; j++) {
					if (Math.sqrt(Math.pow(p[i].x - p[j].x, 2.0) + Math.pow(p[i].y - p[j].y, 2.0)) <= 2) {
						count++;
					}
				}
				if (max < count) {
					max = count;
				}
			}
			System.out.println(max);
			n = sc.nextInt();
		}
	}
}