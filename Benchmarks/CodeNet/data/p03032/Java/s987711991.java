import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	// invoked from main
	private void solve() throws Exception {
		int N = in.i(), K = in.i();
		ArrayList<Long> V = new ArrayList<>(N);
		for (int i = 0; i < N; i++)
			V.add(in.l());

		long maxsum = 0;
		ArrayList<Long> list = new ArrayList<>(K);
		for (int a = 0; a <= Math.min(N, K); a++) { // ここ K -> min(N, K)
			int b = Math.min(a, K-a);
			for (int l = 0; l <= a; l++) {
				int r = a - l;
				list.clear();
				for (int i = 0; i < l; i++) {
					list.add(V.get(i));
				}
				for (int i = 1; i <= r; i++) {
					list.add(V.get(N-i));
				}
				Collections.sort(list);
				long sum = list.stream().reduce(0L, (x, y) -> x + y);
				for (int i = 0; i < b; i++) {
					if (list.get(i) < 0) {
						sum -= list.get(i);
					} else {
						break;
					}
				}

				if (sum > maxsum) {
					maxsum = sum;
				}
			}
		}
		out.println(maxsum);
	}


	public static void main(String[] args) throws Exception {
		instance.solve();
	}

	static PrintStream out = System.out;
	static FastReader in = new FastReader();
	static Main instance = new Main();
}

class FastReader {
	final private int BUF_SIZE = 1 << 16;
	private DataInputStream din = new DataInputStream(System.in);
	private byte[] buffer = new byte[BUF_SIZE];
	private int bufferPointer, bytesRead;

	String s() throws IOException {
		return s(64);
	}

	// make for line
	String s(int capacity) throws IOException {
		byte[] buf = new byte[capacity];
		int cnt = 0, c;
		while ((c = c()) != -1) {
			if (Character.isSpaceChar(c)) break;
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

