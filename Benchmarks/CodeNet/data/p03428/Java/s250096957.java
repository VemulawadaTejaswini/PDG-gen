import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double m = n;
		Point[] z = new Point[n];
		for (int i = 0; i < n; i++)
			z[i] = new Point(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		Random random = new Random();
		random.nextInt();
		double x, y;
		int[] r = {1, -1, 1, -1, 1, -1};
		int count = 400000;
		double[] h = new double[n];
		for (int i = 0; i < count; i++) {
			x = random.nextInt() * r[random.nextInt(6)];
			y = random.nextInt() * r[random.nextInt(6)];
			double min = Long.MAX_VALUE;
			int index = 0;
			for (int j = 0; j < n; j++) {
				double d = Math.sqrt((z[j].x - x) * (z[j].x - x) + (z[j].y - y) * (z[j].y - y));
				if (d < min) {
					min = d;
					index = j;
				}
			}
			h[index]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(h[i] / count);
		}

	}
	public static  class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}