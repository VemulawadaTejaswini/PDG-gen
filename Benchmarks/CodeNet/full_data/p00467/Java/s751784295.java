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
		// File("D:\\UserArea\\J0124567\\Downloads\\0542-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] s = new int[n];
			for (int i = 0; i < n; i++)
				s[i] = scan.nextInt();

			int p = 0, t = 0;
			for (int i = 0; i < m; i++) {
				p += scan.nextInt();
				if (p < n && t == 0)
					p += s[p];
				if (p >= n - 1 && t == 0)
					t = i + 1;

			}
			// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();

			System.out.println(t);
		}

		scan.close();
		// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}