import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		long d = scan.nextLong();
		Treasure tr = new Treasure(n, d, debug);
		for (int i = 0; i < n; i++)
			tr.setTreasure(i, scan.nextLong(), scan.nextLong());
		pwriter.println(tr.getMaxValue());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Treasure {
	boolean debug;
	long differ;
	long[] price;
	long[] value;
	long maxVdef = 0;

	public Treasure(int n, long d, boolean debug) {
		differ = d;
		this.debug = debug;
		price = new long[n];
		value = new long[n];
	}

	public long getMaxValue() {
		setMax(0, 0l, 0l);
		return maxVdef;
	}

	private void setMax(int i, long pd, long vd) {
		// 'pd' is price difference, 'vd' is value difference of already checked
		// difference is presented as Bruno's - Anne's
		// and i is next check treasures
		if (Math.abs(pd) <= differ && vd > maxVdef)
			maxVdef = vd;
		if (i == price.length)
			return;
		setMax(i + 1, pd, vd); // don't get treasure i
		setMax(i + 1, pd + price[i], vd + value[i]); // get treasure by Bruno
		setMax(i + 1, pd - price[i], vd - value[i]); // get treasure by Anne
	}

	public void setTreasure(int i, long p, long v) {
		price[i] = p;
		value[i] = v;
	}

}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public long nextLong() {
		skipCtlSpace();
		long n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10d;
				n += (long) (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}

	public int nextInt() {
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