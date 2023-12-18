import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.stream.IntStream;


public class Main {

	class Container {
		String cityName;
		int score;
		int i;

		Container(String cityName, int score, int i) {
			this.cityName = cityName;
			this.score = score;
			this.i = i;
		}
	}

	// invoked from main
	private void solve() throws Exception {
		int N = in.i(), M = in.i();
		int[] pow2 = new int[N+1];
		pow2[0] = 1;
		for (int i = 1; i <= N; i++)
			pow2[i] = 2*pow2[i-1];

		// 電球M個のon条件をbitで表す
		int[] s = new int[M];
		for (int i = 0; i < M; i++) {
			s[i] = 0;
			int k_i = in.i();
			for (int j = 0; j < k_i; j++)
				s[i] += pow2[in.i()-1];
		}

		int[] p = new int[M];
		for (int i = 0; i < M; i++)
			p[i] = in.i();

		int count = 0;
		label: for (int i = 0; i < pow2[N]; i++) {
			for (int j = 0; j < M ; j++)
				if (Integer.bitCount(i & s[j]) % 2 != p[j])
					continue label;
			count++;
		}

		out.println(count);
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

