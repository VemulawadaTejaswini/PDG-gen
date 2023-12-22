import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;

public class Main {
	/**
	 * @param args
	 */
	static class Shape {
		public	int	x = 0;
		public	int	y = 0;
		public	int	r = 0;

		public Shape(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Shape(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}

	static class Line {
		public	Shape	ps = null;
		public	Shape	pe = null;
		public	int		a  = 0;
		public	int		b  = 0;
		public	int		c  = 0;

		public Line(Shape ps, Shape pe) {
			this.ps = ps;
			this.pe = pe;
			this.a  = pe.y-ps.y;
			this.b  = ps.x-pe.x;
			this.c  = -(this.a*ps.x+this.b*ps.y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]	d = null;

		while((d = inp()) != null) {
			solve(d);
		}
	}

	private static void solve(int[][] d) {
		{
			int	rr = (d[3][2]*d[3][2]);
			int	d0 = distPow(d[3], d[0]);
			int	d1 = distPow(d[3], d[1]);
			int	d2 = distPow(d[3], d[2]);

			if (d0 <= rr && d1 <= rr && d2 <= rr) {
				System.out.println("b");
				return;
			}
		}

		{
			Point2D.Double	p1 = new Point2D.Double(d[0][0], d[0][1]);
			Point2D.Double	p2 = new Point2D.Double(d[1][0], d[1][1]);
			Point2D.Double	p3 = new Point2D.Double(d[2][0], d[2][1]);
			Point2D.Double	p4 = new Point2D.Double(d[3][0], d[3][1]);
			Line2D.Double	l1 = new Line2D.Double(p1, p2);
			Line2D.Double	l2 = new Line2D.Double(p2, p3);
			Line2D.Double	l3 = new Line2D.Double(p3, p1);
			double			dr = (double)d[3][2];
			double			s1 = l1.ptSegDist(p4);
			double			s2 = l2.ptSegDist(p4);
			double			s3 = l3.ptSegDist(p4);

			if (s1 >= dr && s2 >= dr && s3 >= dr) {
				int	n1 = crossSign(d[0], d[1], d[3]);
				int	n2 = crossSign(d[1], d[2], d[3]);
				int	n3 = crossSign(d[2], d[0], d[3]);

				if ((n1 == n2) && (n2 == n3) && s1 == dr && s2 == dr && s3 == dr) {
					System.out.println("a");
				} else {
					if (s1 == dr || s2 == dr || s3 == dr) {
						System.out.println("c");
					}  else {
						System.out.println("d");
					}
				}
			} else {
				System.out.println("c");
			}
		}
	}

	private static int distPow(int[] p1, int[] p2) {
		return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
	}

	private static int crossSign(int[] p1, int[] p2, int[] p3) {
		int[]	vab = { p2[0]-p1[0], p2[1]-p1[1] };
		int[]	vap = { p3[0]-p1[0], p3[1]-p1[1] };
		int		sgn = cross(vab, vap);
		return (sgn==0)?0:((sgn>0)?1:-1);
	}

	private static int cross(int[] va, int[] vb) {
		return va[0]*vb[1]-va[1]*vb[0];   // x1*x2 + y1*y2
	}

	private static int[][] inp() {
		int[][]	d = new int[4][];

		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				int[]	p = { parseNum(), parseNum() };
				if (p[0] == 0 && p[1] == 0) return null;
				d[i] = p;
			} else {
				int[]	p = { parseNum(), parseNum(), parseNum() };
				d[i] = p;
			}
		}

		return d;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}