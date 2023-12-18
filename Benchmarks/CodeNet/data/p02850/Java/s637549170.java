import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	static boolean[][] connect;
	static int[][] connectColor;
	static boolean[] visited;
	static int total_paths;

	public static void main(String[] args) {
		FScanner sc = new FScanner();
		int N = sc.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		int input = 0;
		HashMap map = new HashMap();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int[] temp = new int[2];
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.put(a, 1);
			map.put(b, 1);
			temp[0] = a;
			temp[1] = b;
			list.add(temp);
			input++;
			if (map.size() == N) {
				break;
			}
		}
		// つながりを作成
		connect = new boolean[N][N];
		connectColor = new int[N][N];
		for (int i = 0; i < input; i++) {
			// 無向グラフだから双方のパスを作成する
			connect[list.get(i)[0] - 1][list.get(i)[1] - 1] = true;
			connect[list.get(i)[1] - 1][list.get(i)[0] - 1] = true;
		}

		int sum = 0;

		for (int i = 0; i < N; i++) {
			int tmpSum = 0;
			for (int j = 0; j < N; j++) {
				if (connect[i][j]) {
					tmpSum++;
				}
			}
			sum = Math.max(tmpSum, sum);
		}

		for (int i = 0; i < N; i++) {
			HashMap map2 = new HashMap();
			for (int j = 0; j < N; j++) {
				if (connect[i][j]) {
					// 色を塗る
					map2.put(connectColor[i][j], 0);
					int color = 0;
					for (int c = 1; c <= sum; c++) {
						if (!map2.containsKey(c)) {
							color = c;
							break;
						}
					}
					if (connectColor[i][j] == 0) {
						connectColor[i][j] = color;
						connectColor[j][i] = color;
						map2.put(connectColor[i][j], color);
					}
				}
			}
		}

		System.out.println(sum);

		for (int i = 0; i < list.size(); i++) {
			int color = connectColor[list.get(i)[0] - 1][list.get(i)[1] - 1];
			System.out.println(color);
		}
	}

}

class FScanner {
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

	private boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
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

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}