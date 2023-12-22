import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		while (true) {
			int n = scan.nextInt();
			int r = scan.nextInt();
			if (n == 0 && r == 0)
				break;

			short[] x1 = new short[n];
			short[] y1 = new short[n];
			short[] x2 = new short[n];
			short[] y2 = new short[n];
			for (int i = 0; i < n; i++) {
				x1[i] = scan.nextShort();
				y1[i] = scan.nextShort();
				x2[i] = scan.nextShort();
				y2[i] = scan.nextShort();
			}
			Rects rect = new Rects();
			for (int i = 0; i < n; i++) {
				rect.setRect(x1[i], y1[i], x2[i], y2[i]);
			}
			System.out.println(rect.area());
			if (r == 1)
				continue;
			long side = rect.side();

			rect = null;
			rect = new Rects();
			for (int i = 0; i < n; i++) {
				rect.setRect(y1[i], x1[i], y2[i], x2[i]);
			}
			side += rect.side();
			System.out.println(side);

			// rect.debug();
		}

		scan.close();
		System.exit(0);
	}
}

class Vbar {
	public short next = -1;
	public short y1 = -1, y2 = -1;
	boolean empty = true;
}

class Rects {
	private Vbar[][] vb = new Vbar[10000][1001];

	Rects() {
		for (short x = 0; x < vb.length; x++) {
			vb[x][0] = new Vbar();
			vb[x][0].empty = false;
			for (int i = 1; i < vb[x].length; i++)
				vb[x][i] = new Vbar();
		}
	}

	public long side() {
		long result = 0;
		for (short x = 0; x < vb.length; x++)
			for (short i = vb[x][0].next; i > 0; i = vb[x][i].next)
				result += 2;
		return result;
	}

	public long area() {
		long result = 0;
		for (short x = 0; x < vb.length; x++)
			for (short i = vb[x][0].next; i > 0; i = vb[x][i].next)
				result += vb[x][i].y2 - vb[x][i].y1;
		return result;
	}

	public void debug() {
		for (short x = 0; x < vb.length; x++)
			for (short i = vb[x][0].next; i > 0; i = vb[x][i].next) {
				System.out.println(x + "-" + vb[x][i].y1 + "-" + vb[x][i].y2 + " " + i + " " + vb[x][i].next);
			}

	}

	public void setRect(short x1, short y1, short x2, short y2) {
		for (short x = x1; x < x2; x++) {
			short cur, pre = 0;
			for (cur = vb[x][0].next; cur != -1; pre = cur, cur = vb[x][cur].next)
				if (y1 <= vb[x][cur].y1)
					break;
			short me = this.add(cur, pre, x, y1, y2);
			for (short i = vb[x][me].next; i != -1; i = vb[x][i].next) {
				if (vb[x][me].y2 < vb[x][i].y1)
					break;
				if (vb[x][me].y2 < vb[x][i].y2)
					vb[x][me].y2 = vb[x][i].y2;
				vb[x][me].next = vb[x][i].next;
				vb[x][i].empty = true;
			}
		}

	}

	private short add(short cur, short pre, short x, short y1, short y2) {
		if (vb[x][pre].y2 >= y1) {
			if (vb[x][pre].y2 < y2)
				vb[x][pre].y2 = y2;
			return pre;
		}
		for (short i = 1; i < vb[x].length; i++)
			if (vb[x][i].empty == true) {
				vb[x][i].empty = false;
				vb[x][i].y1 = y1;
				vb[x][i].y2 = y2;
				vb[x][i].next = cur;
				vb[x][pre].next = i;
				return i;
			}
		return -1;
	}
}