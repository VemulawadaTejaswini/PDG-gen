import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0530-input.txt"));

		while (scan.hasNext()) {
			int w = scan.nextInt();
			int h = scan.nextInt();
			if (w == 0)
				break;

			Board b = new Board(w, h);
			int n = scan.nextInt();
			for (int i = 0; i < n; i++)
				b.mask(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			System.out.println(b.color());
		}
		scan.close();
		System.exit(0);
	}
}

class Board {
	class Bar {
		int low, hi, color;

		public Bar(int low, int hi) {
			this.low = low;
			this.hi = hi;
		}

	}

	class Bars {
		List<Bar> bar = new ArrayList<Bar>();
	}

	Bars[] bars;

	public Board(int w, int h) {
		bars = new Bars[w];
		for (int i = 0; i < w; i++) {
			bars[i] = new Bars();
			bars[i].bar.add(new Bar(0, h - 1));
		}
	}

	public int color() {
		int maxColor = 0;
		for (int x = 0; x < bars.length; x++)
			for (int i = 0; i < bars[x].bar.size(); i++)
				if (bars[x].bar.get(i).color == 0)
					this.paint(x, i, ++maxColor);
		return maxColor;
	}

	private void paint(int x, int i, int color) {
		if (bars[x].bar.get(i).color != 0)
			return;
		bars[x].bar.get(i).color = color;
		if (x > 0)
			for (int j = 0; j < bars[x - 1].bar.size(); j++)
				if (this.isGroup(x, i, x - 1, j))
					this.paint(x - 1, j, color);
		if (x < bars.length - 1)
			for (int j = 0; j < bars[x + 1].bar.size(); j++)
				if (this.isGroup(x, i, x + 1, j))
					this.paint(x + 1, j, color);
	}

	public int colorXXX() {
		// this.print();
		int colorMax = 0;
		boolean[] colorTbl = new boolean[10000000];
		for (int x = 0; x < bars.length; x++) {
			for (int i = 0; i < bars[x].bar.size(); i++) {
				for (int j = 0; j < bars[x - 1].bar.size(); j++)
					if (this.isGroup(x, i, x - 1, j))
						if (bars[x].bar.get(i).color == 0)
							bars[x].bar.get(i).color = bars[x - 1].bar.get(j).color;
						else if (bars[x].bar.get(i).color != bars[x - 1].bar.get(j).color)
							colorTbl[bars[x - 1].bar.get(j).color] = false;
			}
		}
		return 0;
	}

	private boolean isGroup(int x1, int i1, int x2, int i2) {
		if (bars[x1].bar.get(i1).hi >= bars[x2].bar.get(i2).low && bars[x1].bar.get(i1).low < bars[x2].bar.get(i2).hi)
			return true;
		return false;
	}

	private void print() {
		for (int x = 0; x < bars.length; x++) {
			System.out.print("\n" + x + ":");
			for (int i = 0; i < bars[x].bar.size(); i++)
				System.out.print(" " + bars[x].bar.get(i).low + " " + bars[x].bar.get(i).hi);
			;
		}
		System.out.println();
	}

	public void mask(int x1, int y1, int x2, int y2) {
		for (int x = x1; x < x2; x++)
			for (int i = 0; i < bars[x].bar.size();) {

				if (bars[x].bar.get(i).low > y2 - 1) {
					break;
				}

				if (bars[x].bar.get(i).hi < y1) {
					i++;
					continue;
				}

				if (bars[x].bar.get(i).low >= y1 && bars[x].bar.get(i).hi <= y2 - 1) {
					bars[x].bar.remove(i);
					continue;
				}

				if (bars[x].bar.get(i).low < y1 && bars[x].bar.get(i).hi > y2 - 1) {
					int tmp = bars[x].bar.get(i).low;
					bars[x].bar.get(i).low = y2;
					bars[x].bar.add(i, new Bar(tmp, y1 - 1));
					i++;
					break;
				}

				if (bars[x].bar.get(i).low <= y2 - 1 && bars[x].bar.get(i).hi > y2 - 1) {
					bars[x].bar.get(i).low = y2;
					break;
				}

				if (bars[x].bar.get(i).hi >= y1 && bars[x].bar.get(i).low < y1) {
					bars[x].bar.get(i).hi = y1 - 1;
					i++;
					continue;
				}

			}
	}
}