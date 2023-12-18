
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
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
		int n5 = 0;
		int n7 = 0;
		for (int i = 0; i < 3; i++) {
			if (nextInt() == 5) {
				n5++;
			} else {
				n7++;
			}
		}

		out.println(n5 == 2 && n7 == 1 ? "YES" : "NO");
	}

	private void solveB() {
		int numN = nextInt();
		int numL = nextInt();
		String[] wk = IntStream.range(0, numN).collect(() -> new String[numN],
				(t, i) -> {
					t[i] = next();
				},
				(t, u) -> {
					Stream.concat(Arrays.stream(t), Arrays.stream(u));
				});

		Arrays.sort(wk);

		String builder = Arrays.stream(wk).reduce("",
				(sum, i) -> {
					sum += i;
					return sum;
				});

		out.println(builder);
	}

	private void solveC() {
		String defNum = next();
		String[] numN = defNum.split("");
		int numK = nextInt();

		Set<String> notUseSet = IntStream.range(0, numK).mapToObj(i -> next()).collect(
				() -> new HashSet<String>(),
				(t, i) -> {
					t.add(i);
				},
				(t, u) -> {
					t.addAll(u);
				});

		List<Integer> notUseList = notUseSet.stream().collect(() -> new ArrayList<Integer>(),
				(t, i) -> {
					t.add(Integer.parseInt(i));
				},
				(t, u) -> {
					t.addAll(u);
				});

		Collections.sort(notUseList);

		//		List<Integer> useList = IntStream.range(0, 10).collect(
		//				() -> new ArrayList<Integer>(),
		//				(t, i) -> {
		//					if (!notUseList.contains(i + 1)) {
		//						t.add(i + 1);
		//					}
		//				},
		//				(t, u) -> {
		//					t.addAll(u);
		//				});
		//		Collections.sort(useList);

		boolean isAll = true;
		for (int j = 0; j < numN.length; j++) {
			String wk = numN[j];
			if (notUseSet.contains(wk)) {
				isAll = false;
				break;
			}
		}
		//		if (isAll || useList.size() == 0) {
		if (isAll || notUseSet.size() == 10) {
			out.println(defNum);
		} else {
			for (int j = Integer.parseInt(defNum); j <= 100000; j++) {
				String[] wk = Integer.toString(j).split("");
				boolean isRes = true;
				for (String c : wk) {
					if (notUseSet.contains(c)) {
						isRes = false;
						break;
					}
				}
				if (isRes) {
					out.println(j);
					break;
				}
			}

		}

	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
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