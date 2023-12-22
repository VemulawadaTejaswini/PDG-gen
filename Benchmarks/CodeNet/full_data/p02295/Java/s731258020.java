import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		Geometry geom = new Geometry();

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x0 = scan.nextInt();
			int y0 = scan.nextInt();
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int x3 = scan.nextInt();
			int y3 = scan.nextInt();
			geom.setBaseLine(new Point(x1 - x0, y1 - y0));
			// Point s1 = geom.rotateBaseX(new Point(x1 - x0, y1 - y0), true);
			Point p2 = geom.rotateBaseX(new Point(x2 - x0, y2 - y0), true);
			Point p3 = geom.rotateBaseX(new Point(x3 - x0, y3 - y0), true);
			Point s2 = geom.crossX(p2, p3);
			s2 = geom.rotateBaseX(s2, false);
			pwriter.print(s2.x + x0);
			pwriter.print(' ');
			pwriter.println(s2.y + y0);
			/*
			 * if (p2.y == p3.y) if (p2.y == 0) if (Math.min(p2.x, p3.x) <=
			 * Math.max(0, s1.x) && Math.max(p2.x, p3.x) >= Math.min(0, s1.x))
			 * pwriter.println("1"); else pwriter.println("0"); else
			 * pwriter.println("0"); else { if (p2.y * p3.y <= 0) { Point s2 =
			 * geom.crossX(p2, p3); if (s2.x <= Math.max(0, s1.x) && s2.x >=
			 * Math.min(0, s1.x)) pwriter.println("1"); else
			 * pwriter.println("0"); } else pwriter.println("0"); }
			 */
		}
		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Point {
	public double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

}

class Geometry {
	double sin, cos;

	public void setBaseLine(Point v) {
		double t2 = v.x * v.x + v.y * v.y;
		sin = v.y / Math.sqrt(t2);
		cos = v.x / Math.sqrt(t2);
	}

	public Point crossX(Point p0, Point p1) {
		if (p0.y == p1.y)
			return null;
		// y=(y1-y0)/(x1-x0)*(x-x0)+y0 : y=0
		// (y1-y0)*(x-x0)=-y0*(x1-x0)
		// x=x0-y0*(x1-x0)/(y1-y0)
		// x=(x0y1-x1y0)/(y1-y0)
		return new Point(round((p0.x * p1.y - p1.x * p0.y) / (p1.y - p0.y)), 0);
	}

	public boolean isSameLine(Point p0, Point p1, Point p2) {
		if ((p1.x - p0.x) * (p2.y - p0.y) == (p2.x - p0.x) * (p1.y - p0.y))
			return true;
		else
			return false;
	}

	public Point rotateBaseX(Point p, boolean direction) {
		if (direction)
			return new Point(round(p.x * cos + p.y * sin), round(-p.x * sin + p.y * cos));
		else
			return new Point(round(p.x * cos - p.y * sin), round(p.x * sin + p.y * cos));
	}

	private double round(double d) {
		long x = 1000000000 * 1000;
		return (double) Math.round(d * x) / x;
	}

}

class UserScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() throws IOException {
		ptr = 0;
		buflen = in.read(buffer);
		if (buflen <= 0)
			return false;
		else
			return true;
	}

	private byte getByte() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			ptr++;
			skipCtlSpace();
		}
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() throws IOException {
		in.close();
	}

	public String next() throws IOException {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() throws IOException {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}