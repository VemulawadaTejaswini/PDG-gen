import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		SubSeq subseq = new SubSeq(n);
		for (int i = 0; i < n; i++)
			subseq.addElem(i, scan.nextInt());
		pwriter.println(subseq.getAnswer());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class SubSeq {
	int[] elemA;
	int[] maxA;

	public SubSeq(int n) {
		elemA = new int[n];
		maxA = new int[n + 1];
		for (int i = 1; i < maxA.length; i++)
			maxA[i] = Integer.MAX_VALUE;
		maxA[0] = Integer.MIN_VALUE;
	}

	public int getAnswer() {
		for (int k = 0; k < elemA.length; k++)
			for (int i = 0; i <= k; i++)
				if (maxA[i] < elemA[k] && elemA[k] < maxA[i + 1])
					maxA[i + 1] = elemA[k];

		int ret = maxA.length - 1;
		for (; ret >= 0 && maxA[ret] == Integer.MAX_VALUE; ret--)
			;

		return ret;
	}

	public void addElem(int i, int a) {
		elemA[i] = a;
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