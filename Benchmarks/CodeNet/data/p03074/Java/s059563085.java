import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws Exception {

		int N = in.i();
		int K = in.i();
		// K > |Array| -> K = |Array| で sum返す
		int[] A = new int[N / 2 + 3];
		int[] B = new int[N / 2 + 3];
		int i = 0;

		byte c;
		int accT = 0, accF = 0;
		boolean b = true;

		// 1回目
		c = in.read();
		b = c == 'i';
		if (b) {
			accT++;
		} else {
			accF++;
		}

		while ((c = in.read()) != '\n') {
			boolean nextb = c == '1';

			if (b) {
				if (nextb) {
					accT++;
				} else {
					accF++;
				}
			} else {
				if (nextb) {
					A[i] = accT + accF;
					B[i++] = accF;
					accT = 1;
					accF = 0;
				} else {
					accF++;
				}
			}
			b = nextb;
		}

		if ((accT + accF) != 0) {
			A[i] = accT + accF;
			B[i++] = accF;
		}

		if (B[i-1] != 0) {
			A[i] = 0;
			B[i++] = 0;
		}

		int sz = i; // free i
		// A[0] - A[sz-1] まで 値が 入っている

		if (K > sz) {
			int sum = 0;
			for (int j = 0; j < sz; j++) {
				sum += A[j];
			}
			out.println(sum);
			return;
		}

		// i : end = i + K - 1
		// 0 -> K-1
		// 1 -> (K-1) + 1
		// ...
		// sz-K -> sz-1

		int maxsum = 0;
		for (i = 0; i <= K; i++) {
			maxsum += A[i];
		}
		int tmp = maxsum;
		maxsum -= B[K];

		for (i = 1; i <= sz - K; i++) {
			tmp = tmp - A[i-1] + A[i + K]; //
			int tmp_ = tmp - B[i + K];
			if (tmp_ > maxsum)
				maxsum = tmp_;
		}

		out.println(maxsum);
	}


	static PrintStream out = System.out;
	static FastReader in = new FastReader();
}

class FastReader {
	final private int BUF_SIZE = 1 << 16;
	private DataInputStream din;
	private byte[] buffer = new byte[BUF_SIZE];
	private int bufferPointer, bytesRead;

	FastReader() {
		din = new DataInputStream(System.in);
	}

	String s() throws IOException {
		byte[] buf = new byte[64];
		int cnt = 0, c;
		while ((c = read()) != -1) {
			if (c == '\n') break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	int i() throws IOException {
		int ret = 0;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do {
			ret = ret * 10 + c - '0';
		}
		while ((c = read()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	long l() throws IOException {
		long ret = 0;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do {
			ret = ret * 10 + c - '0';
		}
		while ((c = read()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	double d() throws IOException {
		double ret = 0, div = 1;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do {
			ret = ret * 10 + c - '0';
		}
		while ((c = read()) >= '0' && c <= '9');
		if (c == '.')
			while ((c = read()) >= '0' && c <= '9')
				ret += (c - '0') / (div *= 10);
		return neg ? -ret : ret;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUF_SIZE);
		if (bytesRead == -1) buffer[0] = -1;
	}

	/*	private */ byte read() throws IOException {
		if (bufferPointer == bytesRead) fillBuffer();
		return buffer[bufferPointer++];
	}

	void close() throws IOException {
		if (din != null) din.close();
	}
}

