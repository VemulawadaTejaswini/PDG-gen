import java.io.DataInputStream;
import java.io.IOException;

public class Main {

	static class FastReader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public FastReader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
	}

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		for (int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}

		int cost = 0;
		for (int i = 0; i < n + 1; i++) {
			cost += Math.abs(a[i] - a[i + 1]);
		}
		for (int i = 1; i < n + 1; i++)
			System.out.println(
					cost - Math.abs(a[i] - a[i + 1]) - Math.abs(a[i - 1] - a[i]) + Math.abs(a[i - 1] - a[i + 1]));
	}
}
