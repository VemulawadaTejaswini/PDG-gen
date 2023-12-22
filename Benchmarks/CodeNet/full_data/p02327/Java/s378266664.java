import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int h = scan.nextInt();
		int w = scan.nextInt();

		Rectangle rg = new Rectangle(h, w, debug);

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				rg.addTile(i, j, scan.nextInt());

		pwriter.println(rg.getMaxRect());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Rectangle {
	boolean debug;
	int wmax, hmax;
	int maxArea;
	int dTile;
	List<Tile> tile = new ArrayList<Tile>();
	int kdTreeRoot;

	int histLeftUpperH = -1, histLeftUpperW = -1, histLeftUpperArea = -1;
	int histRightUpperH = -1, histRightUpperW = wmax + 1, histRightUpperArea = -1;
	int histLeftLowerH = hmax + 1, histLeftLowerW = -1, histLeftLowerArea = -1;
	int histRightLowerH = hmax + 1, histRightLowerW = wmax + 1, histRightLowerArea = -1;

	class Tile {
		int h, w;
		int leChild, gtChild;

		public Tile(int h, int w) {
			this.h = h;
			this.w = w;
			leChild = -1;
			gtChild = -1;
		}

		public int getHW(boolean isHeight) {
			if (isHeight)
				return h;
			else
				return w;
		}
	}

	public Rectangle(int h, int w, boolean debug) {
		this.debug = debug;
		hmax = h - 1;
		wmax = w - 1;
	}

	public int getMaxRect() {
		Tile[] tree = (Tile[]) tile.toArray(new Tile[0]);
		kdTreeRoot = buildKDtree(tree, 0, dTile, true);

		return getMaxArea(tree, 0, 0, hmax, wmax);
	}

	private int getMaxArea(Tile[] tree, int h1, int w1, int h2, int w2) {
		if (h1 > h2 || w1 > w2)
			return 0;

		int area = -1;
		if ((area = getHist(h1, w1, h2, w2)) >= 0)
			return area;
		int in = inTile(kdTreeRoot, tree, true, h1, w1, h2, w2);
		if (debug) {
			System.out.println("- searched area " + h1 + "," + w1 + "\t" + h2 + "," + w2 + "\t" + in);
		}

		if (in == -1)
			area = (h2 - h1 + 1) * (w2 - w1 + 1);
		else {
			area = getMaxArea(tree, h1, w1, h2, tree[in].w - 1);
			area = Math.max(area, getMaxArea(tree, h1, w1, tree[in].h - 1, w2));
			area = Math.max(area, getMaxArea(tree, h1, tree[in].w + 1, h2, w2));
			area = Math.max(area, getMaxArea(tree, tree[in].h + 1, w1, h2, w2));
		}
		saveHist(area, h1, w1, h2, w2);
		return area;
	}

	private void saveHist(int area, int h1, int w1, int h2, int w2) {
		if (h1 == 0 && w1 == 0 && h2 > histLeftUpperH && w2 > histLeftUpperW) {
			histLeftUpperH = h2;
			histLeftUpperW = w2;
			histLeftUpperArea = area;
			return;
		}
		if (h1 == 0 && w2 == wmax && h2 > histRightUpperH && w1 < histRightUpperW) {
			histRightUpperH = h2;
			histRightUpperW = w1;
			histRightUpperArea = area;
			return;
		}
		if (h2 == hmax && w1 == 0 && h1 < histLeftLowerH && w2 > histLeftLowerW) {
			histLeftLowerH = h1;
			histLeftLowerW = w2;
			histLeftLowerArea = area;
			return;
		}
		if (h2 == hmax && w2 == wmax && h1 < histRightLowerH && w1 < histRightLowerW) {
			histRightLowerH = h1;
			histRightLowerW = w1;
			histRightLowerArea = area;
			return;
		}
	}

	private int getHist(int h1, int w1, int h2, int w2) {
		if (h2 <= histLeftUpperH && w2 <= histLeftUpperW)
			return histLeftUpperArea;
		if (h2 <= histRightUpperH && w1 >= histRightUpperW)
			return histRightUpperArea;
		if (h1 >= histLeftLowerH && w2 <= histLeftLowerW)
			return histLeftLowerArea;
		if (h1 >= histRightLowerH && w1 >= histRightLowerW)
			return histRightLowerArea;
		return -1;
	}

	private int inTile(int p, Tile[] tree, boolean isHeight, int h1, int w1, int h2, int w2) {
		if (p == -1)
			return -1;
		if (tree[p].h >= h1 && tree[p].h <= h2 && tree[p].w >= w1 && tree[p].w <= w2)
			return p;
		int ret = -1;
		if (isHeight) {
			if (tree[p].h <= h2)
				ret = inTile(tree[p].gtChild, tree, !isHeight, h1, w1, h2, w2);
			if (ret != -1)
				return ret;
			if (tree[p].h >= h1)
				ret = inTile(tree[p].leChild, tree, !isHeight, h1, w1, h2, w2);
		} else {
			if (tree[p].w <= w2)
				ret = inTile(tree[p].gtChild, tree, !isHeight, h1, w1, h2, w2);
			if (ret != -1)
				return ret;
			if (tree[p].w >= w1)
				ret = inTile(tree[p].leChild, tree, !isHeight, h1, w1, h2, w2);
		}
		return ret;
	}

	private int buildKDtree(Tile[] tree, int start, int to, boolean isHeight) {
		if (start >= to)
			return -1;
		sortHW = isHeight;
		Arrays.sort(tree, start, to, new TreeComp());
		int median = (start + to) / 2;
		tree[median].leChild = buildKDtree(tree, start, median, !isHeight);
		tree[median].gtChild = buildKDtree(tree, median + 1, to, !isHeight);
		return median;
	}

	boolean sortHW;

	class TreeComp implements Comparator<Tile> {
		@Override
		public int compare(Tile o1, Tile o2) {
			return o1.getHW(sortHW) - o2.getHW(sortHW);
		}

	}

	public void addTile(int h, int w, int c) {
		if (c == 1) {
			tile.add(new Tile(h, w));
			dTile++;
		}
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