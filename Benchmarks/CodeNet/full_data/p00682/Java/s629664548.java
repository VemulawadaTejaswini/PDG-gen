import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);
		for (int seq = 1; true; seq++) {
			int q = scan.nextInt();
			if (q == 0)
				break;
			Geometry gm = new Geometry();
			for (int i = 0; i < q; i++) {
				gm.polygon(scan.nextInt(), scan.nextInt());
			}
			double area = gm.polygonEnd();
			DecimalFormat df = new DecimalFormat("#######.0");
			pwriter.println(seq + " " + df.format(area));
		}

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Geometry {

	boolean polygonDo;
	double firstX, firstY, preX, preY;
	double area;

	public void polygon(double x, double y) {
		if (polygonDo)
			calcCross(preX, preY, x, y);
		else {
			polygonDo = true;
			firstX = x;
			firstY = y;
		}
		preX = x;
		preY = y;
	}

	public double polygonEnd() {
		calcCross(preX, preY, firstX, firstY);
		polygonDo = false;
		double ret = area;
		area = 0;
		return ret;
	}

	private void calcCross(double x1, double y1, double x2, double y2) {
		area += (x2 * y1 - x1 * y2) / 2;
		//System.out.println(area);
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