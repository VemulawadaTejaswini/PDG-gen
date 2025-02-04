import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		int kw = scan.nextInt();
		Knap knap = new Knap(n);
		for (int i = 0; i < n; i++)
			knap.addItem(i, scan.nextInt(), scan.nextInt());
		pwriter.println(knap.getAnswer(kw));

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Knap {
	int[] v, w;
	int[] hist;

	public Knap(int n) {
		v = new int[n];
		w = new int[n];
	}

	public int getAnswer(int kw) {
		hist = new int[kw + 1];
		for (int i = 0; i < hist.length; i++)
			hist[i] = -1;
		for(int w=0;w<kw;w++)
			getMaxValue(w);
		return getMaxValue(kw);
	}

	private int getMaxValue(int kw) {
		if (kw < 0)
			return Integer.MIN_VALUE / 2;
		if (kw == 0)
			return 0;
		if (hist[kw] >= 0)
			return hist[kw];
		int max = 0;
		for (int i = 0; i < v.length; i++) {
			int kv = v[i] + getMaxValue(kw - w[i]);
			if (max < kv)
				max = kv;
		}
		hist[kw] = max;
		return max;
	}

	public void addItem(int i, int v, int w) {
		this.v[i] = v;
		this.w[i] = w;
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