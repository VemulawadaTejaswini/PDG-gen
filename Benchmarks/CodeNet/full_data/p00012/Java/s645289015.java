import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i = 0; i < 4; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			Vec AB = new Vec(x[1] - x[0], y[1] - y[0]);
			Vec BC = new Vec(x[2] - x[1], y[2] - y[1]);
			Vec CA = new Vec(x[0] - x[2], y[0] - y[2]);

			Vec AP = new Vec(x[3] - x[0], y[3] - y[0]);
			Vec BP = new Vec(x[3] - x[1], y[3] - y[1]);
			Vec CP = new Vec(x[3] - x[2], y[3] - y[2]);
			// 外積
			double d1 = AB.x * BP.y - AB.y * BP.x;
			double d2 = BC.x * CP.y - BC.y * CP.x;
			double d3 = CA.x * AP.y - CA.y * AP.x;
			if((d1 > 0.0 && d2 > 0.0 && d3 > 0.0) || (d1 < 0.0 && d2 < 0.0 && d3 < 0.0)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
	static class Vec{
		double x, y;
		public Vec(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
