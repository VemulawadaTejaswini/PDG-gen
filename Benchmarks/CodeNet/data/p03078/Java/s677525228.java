
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveC();
			solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();
		int numD = nextInt();
		int numE = nextInt();
		int numK = nextInt();

		int[] wk = new int[] { numA, numB, numC, numD, numE };
		Arrays.sort(wk);
		if (wk[4] - wk[0] > numK) {
			out.println(":(");
			return;
		}

		out.println("Yay!");
	}

	private static class SortComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			int sabun1 = (o1 % 10);
			int sabun2 = (o2 % 10);

			if (sabun1 == 0) {
				return -1;
			}
			if (sabun2 == 0) {
				return 1;
			}
			sabun1 = 10 - sabun1;
			sabun2 = 10 - sabun2;
			if (sabun1 < sabun2) {
				return -1;
			} else if (sabun1 < sabun2) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	private void solveB() {
		Integer[] wk = new Integer[5];
		for (int i = 0; i < wk.length; i++) {
			wk[i] = nextInt();
		}

		Arrays.sort(wk, new SortComparator());

		int res = 0;
		for (int i = 0; i < wk.length; i++) {

			if (res % 10 != 0) {
				int temp = 10 - res % 10;
				res += temp;
			}
			res += wk[i];
		}
		out.println(res);
	}

	private void solveC() {
		double numN = nextLong();

		long[] wk = new long[5];
		for (int i = 0; i < wk.length; i++) {
			wk[i] = nextLong();

		}

		Arrays.sort(wk);

		long res = (long) (Math.ceil(numN / (double) wk[0]) + (wk.length - 1));
		out.println(res);
	}

	private void solveD() {
		long numX = nextLong();
		long numY = nextLong();
		long numZ = nextLong();
		long numK = nextLong();

		List<Long> aX = new ArrayList<Long>();
		for (int i = 0; i < numX; i++) {
			aX.add(nextLong());
		}
		List<Long> aY = new ArrayList<Long>();
		for (int i = 0; i < numY; i++) {
			aY.add(nextLong());
		}
		List<Long> aZ = new ArrayList<Long>();
		for (int i = 0; i < numZ; i++) {
			aZ.add(nextLong());
		}

		Collections.sort(aX, (x, y) -> Long.compare(x, y) * -1);
		Collections.sort(aY, (x, y) -> Long.compare(x, y) * -1);
		Collections.sort(aZ, (x, y) -> Long.compare(x, y) * -1);

		List<Long> wkXY = new ArrayList<Long>();
		for (int i = 0; i < aX.size(); i++) {
			for (int j = 0; j < aY.size(); j++) {
				wkXY.add(aX.get(i) + aY.get(j));
			}
		}

		Collections.sort(wkXY, (x, y) -> Long.compare(x, y) * -1);

		List<Long> wkXYZ = new ArrayList<Long>();
		for (int i = 0; i < Math.min(numK, wkXY.size()); i++) {
			for (int j = 0; j < aZ.size(); j++) {
				wkXYZ.add(wkXY.get(i) + aZ.get(j));
			}
		}

		Collections.sort(wkXYZ, (x, y) -> Long.compare(x, y) * -1);

		for (int i = 0; i < numK; i++) {
			out.println(wkXYZ.get(i));
		}

	}

	private void solveD3() {
		long numX = nextLong();
		long numY = nextLong();
		long numZ = nextLong();
		long numK = nextLong();

		List<Long> aX = new ArrayList<Long>();
		for (int i = 0; i < numX; i++) {
			aX.add(nextLong());
		}
		List<Long> aY = new ArrayList<Long>();
		for (int i = 0; i < numY; i++) {
			aY.add(nextLong());
		}
		List<Long> aZ = new ArrayList<Long>();
		for (int i = 0; i < numZ; i++) {
			aZ.add(nextLong());
		}

		Collections.reverse(Arrays.asList(aX));
		Collections.sort(aX, (x, y) -> Long.compare(x, y) * -1);
		Collections.reverse(Arrays.asList(aY));
		Collections.sort(aY, (x, y) -> Long.compare(x, y) * -1);
		Collections.reverse(Arrays.asList(aZ));
		Collections.sort(aZ, (x, y) -> Long.compare(x, y) * -1);

		List<Long> wkXY = new ArrayList<Long>();
		for (int i = 0; i < aX.size(); i++) {
			for (int j = 0; j < aY.size(); j++) {
				wkXY.add(aX.get(i) + aY.get(j));
			}
		}

		Collections.sort(wkXY, (x, y) -> Long.compare(x, y) * -1);

		List<Long> wkXYZ = new ArrayList<Long>();
		for (int i = 0; i < Math.min(numK, wkXY.size()); i++) {
			for (int j = 0; j < aZ.size(); j++) {
				wkXYZ.add(wkXY.get(i) + aZ.get(j));
			}
		}

		Collections.sort(wkXYZ, (x, y) -> Long.compare(x, y) * -1);

		for (int i = 0; i < numK; i++) {
			out.println(wkXYZ.get(i));
		}

	}

	private void solveD2() {
		long numX = nextLong();
		long numY = nextLong();
		long numZ = nextLong();
		long numK = nextLong();

		long[] aX = LongStream.range(0, numX).map(i -> nextLong()).toArray();
		long[] aY = LongStream.range(0, numY).map(i -> nextLong()).toArray();
		long[] aZ = LongStream.range(0, numZ).map(i -> nextLong()).toArray();

		Arrays.sort(aX);
		Collections.reverse(Arrays.asList(aX));
		Arrays.sort(aY);
		Collections.reverse(Arrays.asList(aY));
		Arrays.sort(aZ);
		Collections.reverse(Arrays.asList(aZ));

		List<Long> wkXY = new ArrayList<Long>();
		for (int i = 0; i < aX.length; i++) {
			for (int j = 0; j < aY.length; j++) {
				wkXY.add(aX[i] + aY[j]);
			}
		}

		Collections.sort(wkXY, (x, y) -> Long.compare(x, y) * -1);

		List<Long> wkXYZ = new ArrayList<Long>();
		for (int i = 0; i < Math.min(numK, wkXY.size()); i++) {
			for (int j = 0; j < aZ.length; j++) {
				wkXYZ.add(wkXY.get(i) + aZ[j]);
			}
		}

		Collections.sort(wkXYZ, (x, y) -> Long.compare(x, y) * -1);

		for (int i = 0; i < numK; i++) {
			out.println(wkXYZ.get(i));
		}

	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}