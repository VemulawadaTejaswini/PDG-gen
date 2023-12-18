
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			solveA();
			//			 solveB();
			//			 solveC();
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

		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		List<Integer> oneZeroList = new ArrayList<Integer>();
		int now = 1;
		int cnt = 0;
		for (int i = 0; i < wk.length; i++) {
			if (wk[i].charAt(0) == (char) ('0' + now)) {
				cnt++;
			} else {
				oneZeroList.add(cnt);
				cnt = 1;
				now = 1 - now;
			}
		}
		if (cnt != 0) {
			oneZeroList.add(cnt);
		}
		if (oneZeroList.size() % 2 == 0) {
			oneZeroList.add(0);
		}

		int countRange = 2 * numK + 1;

		//ここより上は全処理共通------------------------------------------------
		//累積和用の配列
		int[] resList = new int[oneZeroList.size() + 1];

		for (int j = 0; j < oneZeroList.size(); j++) {
			resList[j + 1] = resList[j] + oneZeroList.get(j);
			//			resList[j + 1] = oneZeroList.get(j);
		}

		long res = 0;
		int maxSize = oneZeroList.size();
		//		int rightMax = maxSize - 1;
		int rightMax = maxSize;
		for (int i = 0; i < maxSize; i += 2) {

			//次のleft,rightを計算する[left,right)
			int left = i;
			int right = Math.min(i + countRange, rightMax);
			int temp = resList[right] - resList[left];
			res = Math.max(res, temp);
		}

		out.println(res);

	}

	//	private void solveA() {
	//		int n = nextInt();
	//		int k = nextInt();
	//		String wk = next();
	//
	//		int cnt = 0;
	//		int now = 1;
	//		List<Integer> oneZeroList = new ArrayList<Integer>();
	//		for (char i = 0; i < wk.length(); i++) {
	//			if (wk.charAt(i) == (char) ('0' + now)) {
	//				cnt++;
	//			} else {
	//				oneZeroList.add(cnt);
	//				cnt++;
	//				now = 1 - now;
	//			}
	//		}

	//
	//		int[] resList = new int[oneZeroList.size() + 1];
	//

	//		for (int j = 0; j < oneZeroList.size(); j++) {
	//			resList[j] = oneZeroList.get(j);
	//		}
	//
	//		int range = 2 * k;
	//
	//		long res = 0;
	//		int maxSize = oneZeroList.size();
	//		int rightMax = maxSize - 1;
	//		for (int i = 0; i < maxSize; i += 2) {
	//			int left = i;
	//			int right = Math.min(i + range, rightMax);
	//			long leftNum = i != 0 ? resList[left - 1] : 0;
	//			long temp = resList[right] - leftNum;
	//			res = Math.max(res, temp);
	//		}
	//
	//		out.println(res);
	//	}

	private void solveB() {
		int n = nextInt();

		out.println("");
	}

	private void solveC() {
		int n = nextInt();

		out.println("");
	}

	private void solveD() {
		int n = nextInt();

		out.println("");
	}

	private void solveE() {
		int n = nextInt();

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

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