import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int h = scan.nextInt();
		int w = scan.nextInt();

		Square sq = new Square(h, w, debug);

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				sq.addTile(i, j, scan.nextInt());

		pwriter.println(sq.getMaxSquare());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Square {
	boolean debug;
	int[][] tile;
	int maxEdge;

	public Square(int h, int w, boolean debug) {
		this.debug = debug;
		tile = new int[h][w];
	}

	public int getMaxSquare() {
		// check right-down of square
		// if tile is countable and upper,left and left-upper have n X n square,
		// n+1 X n+1 square is possible

		for (int h = 1; h < tile.length; h++)
			for (int w = 1; w < tile[0].length; w++)
				if (tile[h][w] > 0) {
					tile[h][w] = 1 + Math.min(tile[h - 1][w - 1], Math.min(tile[h - 1][w], tile[h][w - 1]));
					if (maxEdge < tile[h][w])
						maxEdge = tile[h][w];
				}
		
		return maxEdge * maxEdge;
	}

	public void addTile(int h, int w, int c) {
		// set countable tile as 1
		if (c == 0) {
			tile[h][w] = 1;
			maxEdge = 1;
		} else
			tile[h][w] = 0;
	}

}

class UserScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() throws IOException {
		ptr = 0;
		buflen = in.read(buffer);
		if (buflen <= 0)
			return false;
		else
			return true;
	}

	private byte getByte() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			ptr++;
			skipCtlSpace();
		}
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() throws IOException {
		in.close();
	}

	public String next() throws IOException {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() throws IOException {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}