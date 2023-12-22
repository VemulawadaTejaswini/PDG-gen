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

			int m = scan.nextInt();
			int n = scan.nextInt();
			if (m == 0 && n == 0)
				break;
			Map mp = new Map(m, n);
			for (int y = 0; y < n; y++)
				for (int x = 0; x < m; x++)
					mp.add(x, y, scan.nextInt());
			System.out.println(mp.count());
			// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();

		}

		scan.close();
		// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Map {
	int[][] mp;
	boolean[][] flg;
	int stx = -1, sty = -1;
	int[] cnt;

	public Map(int m, int n) {
		mp = new int[m][n];
		flg = new boolean[m][n];
		cnt = new int[0x07fffff];
		for (int i = 0; i < cnt.length; i++)
			cnt[i] = -1;
	}

	public int count() {
		// TODO Auto-generated method stub
		return -1;
	}

	int uno = 0;

	public void add(int x, int y, int s) {
		if (s == 0)
			mp[x][y] = -1;
		if (s == 1)
			mp[x][y] = uno++;
		if (s == 2) {
			mp[x][y] = 99;
			stx = x;
			sty = y;
		}
	}
}