import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	int Q;
	int[] l,r;
	boolean[] primes;

	private void solve(){
		Q = nextInt();

		l = new int[Q];
		r = new int[Q];
		for(int i = 0;i < Q;i++) {
			l[i] = nextInt();
			r[i] = nextInt();
		}

		primes = new boolean[100000 + 10];
		for(int i = 2;i <= 100000;i++) {
			boolean flag = true;
			for(int j = 2;j * j <= i;j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				primes[i] = true;
			}
		}


		int[] primeSum = new int[100000 + 10];
		for(int i = 0;i < 100000 + 1;i++) {
			if (primes[i] && primes[i + 1 >> 1]) {
				primeSum[i]++;
			}
		}

		for(int i = 0;i < 100000 + 1;i++) {
			primeSum[i + 1] += primeSum[i];
		}

		for(int i = 0;i < Q;i++) {
			out.println(primeSum[r[i]] - primeSum[l[i]-1]);
		}
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	private boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	private String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	private int nextInt() {
		return Integer.parseInt(next());
	}

	private long nextLong() {
		return Long.parseLong(next());
	}

	private double nextDouble() {
		return Double.parseDouble(next());
	}
}