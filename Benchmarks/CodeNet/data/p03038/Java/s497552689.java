import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	class Operation127D {
		private long B, C;

		Operation127D (int B, int C) {
			this.B = B;
			this.C = C;
		}

		long getC() {
			return C;
		}
	}

	static Main instance = new Main();

	public static void main(String[] args) throws Exception {
		int N = in.i(), M = in.i();
		long[] A = new long[N];
		for (int i = 0; i < N; i++)
			A[i] = in.i();

		ArrayList<Operation127D> operations = new ArrayList<>(M);
		for (int i = 0; i < M; i++) {
			Operation127D op = instance.new Operation127D(in.i(), in.i());
			operations.add(op);
		}

		// smaller -> greater
		Arrays.sort(A);
		// greater -> smaller
		operations.sort(Comparator.comparingLong(Operation127D::getC).reversed());



		long acc = 0;
		int op_i = 0;
		Operation127D op = operations.get(0);
		for ( int i = A.length-1; i >= 0; i-- ) {
			long a = A[i];
			if (op != null && op.B == 0) {
				if (M - 1 == op_i) {
					op = null;
				} else {
					op = operations.get(++op_i);
				}
			}

			if (op == null) {
				acc += a;
			} else {
				if ( a >= op.C ) {
					acc += a;
				} else {
					acc += op.C;
					op.B--;
				}
			}
		}

		out.println(acc);
	}

	static PrintStream out = System.out;
	static FastReader in = new FastReader();
}

class FastReader {
	final private int BUF_SIZE = 1 << 16;
	private DataInputStream din = new DataInputStream(System.in);
	private byte[] buffer = new byte[BUF_SIZE];
	private int bufferPointer, bytesRead;

	String s() throws IOException {
		return s(64);
	}

	String s(int capacity) throws IOException {
		byte[] buf = new byte[capacity];
		int cnt = 0, c;
		while ((c = c()) != -1) {
			if (c == '\n') break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	int i() throws IOException {
		int ret = 0;
		byte c = c();
		while (c <= ' ') c = c();
		boolean neg = (c == '-');
		if (neg) c = c();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = c()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	long l() throws IOException {
		long ret = 0;
		byte c = c();
		while (c <= ' ') c = c();
		boolean neg = (c == '-');
		if (neg) c = c();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = c()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	double d() throws IOException {
		double ret = 0, div = 1;
		byte c = c();
		while (c <= ' ') c = c();
		boolean neg = (c == '-');
		if (neg) c = c();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = c()) >= '0' && c <= '9');
		if (c == '.')
			while ((c = c()) >= '0' && c <= '9')
				ret += (c - '0') / (div *= 10);
		return neg ? -ret : ret;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUF_SIZE);
		if (bytesRead == -1) buffer[0] = -1;
	}

	byte c() throws IOException {
		if (bufferPointer == bytesRead) fillBuffer();
		return buffer[bufferPointer++];
	}
}

