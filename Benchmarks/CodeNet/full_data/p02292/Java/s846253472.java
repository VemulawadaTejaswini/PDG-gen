import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		Geometry geom = new Geometry();

		int x0 = scan.nextInt();
		int y0 = scan.nextInt();
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		geom.setBaseLine(new Point(x0, y0), new Point(x1, y1));

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();

			Point ans = geom.rotateBaseX(new Point(x2, y2), true);
			if (geom.isSameLine(new Point(x0, y0), new Point(x1, y1), new Point(x2, y2)))
				if (ans.x < 0)
					pwriter.println("ONLINE_BACK");
				else if (Math.abs(x2 - x0) > Math.abs(x1 - x0) || Math.abs(y2 - y0) > Math.abs(y1 - y0))
					pwriter.println("ONLINE_FRONT");
				else
					pwriter.println("ON_SEGMENT");
			else if (ans.y > 0)
				pwriter.println("COUNTER_CLOCKWISE");
			else
				pwriter.println("CLOCKWISE");
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
	double sin, cos, cos2, sin2, sincos, cos2msin2;

	public void setBaseLine(Point p0, Point p1) {
		double t2 = (p1.x - p0.x) * (p1.x - p0.x) + (p1.y - p0.y) * (p1.y - p0.y);
		cos2 = (p1.x - p0.x) * (p1.x - p0.x) / t2;
		sin2 = (p1.y - p0.y) * (p1.y - p0.y) / t2;
		sincos = (p1.x - p0.x) * (p1.y - p0.y) / t2;
		sin = (p1.y - p0.y) / Math.sqrt(t2);
		cos = (p1.x - p0.x) / Math.sqrt(t2);
	}

	public boolean isSameLine(Point p0, Point p1, Point p2) {
		if ((p1.x - p0.x) * (p2.y - p0.y) == (p2.x - p0.x) * (p1.y - p0.y))
			return true;
		else
			return false;
	}

	public Point rotateBaseX(Point p, boolean direction) {
		if (direction)
			return new Point(p.x * cos + p.y * sin, -p.x * sin + p.y * cos);
		else
			return new Point(p.x * cos - p.y * sin, p.x * sin + p.y * cos);
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