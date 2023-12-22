import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			ArrayList<Vector> c = new ArrayList<Vector>();
			for(int i = 0; i < 3; ++i) {
				c.add(new Vector(s.nextDouble(), s.nextDouble()));
			}
			Vector p = new Vector(s.nextDouble(), s.nextDouble());
			Collections.sort(c, new Comparator<Vector>() {
				@Override
				public int compare(Vector o1, Vector o2) {
					if(o1.x > o2.x) {
						return 1;
					} else if(o1.x == o2.x) {
						return 0;
					} else {
						return -1;
					}
				}
			});
			Vector[] v = new Vector[2];
			v[0] = c.get(1).sub(c.get(0));
			v[1] = c.get(2).sub(c.get(0));

			boolean f = false;
			double b0 = v[0].y * p.x / v[0].x;
			double b1 = v[1].y * p.x / v[1].x;
			double a = (v[1].y - v[0].y) / (v[1].x - v[0].x);
			double b2 = Double.compare(v[0].x, v[1].x) == 0 ? p.y: a * p.x + p.y - a * p.x ; // @ ここに問題あり。切片を計算に入れる
//			System.out.println(b2);
			if(b1 <= b0) {
				f = (b1 <= p.y) && (p.y <= b0) && (p.y <= b2);
			} else {
				f = (b0 <= p.y) && (p.y <= b1) && (b2 <= p.y);
			}
			System.out.println(f?"YES":"NO");
		}
	}
	static class Vector {
		public double x;
		public double y;
		Vector(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public Vector sub(Vector v) {
			this.x -= v.x;
			this.y -= v.y;
			return this;
		}
	}
}