import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long startCpuTime = threadMXBean.getCurrentThreadCpuTime(), stopCpuTime = 0;

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0545-input.txt"));

		while (scan.hasNext()) {

			int w = scan.nextInt();
			int h = scan.nextInt();
			if (w == 0 && h == 0)
				break;
			Map m = new Map();
			System.out.println(m.count(w, h));
			// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();

		}

		scan.close();
		// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Map {
	int W, H;
	int Nor = 1, Est = 0;

	public int count(int w, int h) {
		W = w;
		H = h;
		sav = new int[w + 1][h + 1][2];
		return (this.root(1, 2, Nor) + this.root(2, 1, Est)) % 100000;
	}

	int[][][] sav;

	private int root(int x, int y, int d) {
		if (x >= W - 1 && y >= H - 1)
			return 1;
		if (sav[x][y][d] > 0)
			return sav[x][y][d];
		int r = 0;
		if (d == Nor) {
			if (y < H)
				r += root(x, y + 1, Nor);
			if (x < W - 1)
				r += root(x + 2, y, Est);
		} else {
			if (y < H - 1)
				r += root(x, y + 2, Nor);
			if (x < W)
				r += root(x + 1, y, Est);
		}
		r %= 100000;
		sav[x][y][d] = r;
		return r;
	}
}