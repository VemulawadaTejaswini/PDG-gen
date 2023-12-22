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
			Fr fr = new Fr(n, m);
			for (int i = 0; i < m; i++)
				fr.rel(scan.nextInt(), scan.nextInt());

			System.out.println(fr.count(2));
			// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();

		}

		scan.close();
		// stopCpuTime = threadMXBean.getCurrentThreadCpuTime();
		// System.out.println("CPU=" + (stopCpuTime - startCpuTime) / 1000000);

		System.exit(0);
	}
}

class Fr {
	boolean[] stu;

	public Fr(int n, int m) {
		stu = new boolean[n + 1];
	}

	class linkComp implements Comparator<Link> {

		@Override
		public int compare(Link o1, Link o2) {
			if (o1.a > o2.a)
				return 1;
			else if (o1.a == o2.a)
				return 0;
			else
				return -1;
		}

	}

	public int count(int tm) {
		Collections.sort(link, new linkComp());
		stu[1] = true;
		int sum = 0;
		for (int i = 0; i < link.size(); i++)
			if (link.get(i).a == 1) {
				if (!stu[link.get(i).b])
					sum++;
				stu[link.get(i).b] = true;
				sum += this.check(link.get(i).b, 1);
			} else
				break;
		return sum;
	}

	private int check(int a, int t) {
		if (t == 0)
			return (0);
		int j = link.size() / 2;
		int k = j / 2;
		while (true) {
			if (link.get(j).a < a)
				j += k;
			else
				j -= k;
			if (k > 2)
				k /= 2;
			else
				break;
		}
		for (; link.get(j).a >= a; j--)
			;
		int sum = 0;
		for (j++; link.get(j).a == a; j++) {
			if (!stu[link.get(j).b])
				sum++;
			stu[link.get(j).b] = true;
			sum += this.check(link.get(j).b, t - 1);
		}

		return sum;
	}

	class Link {
		public Link(int i, int j) {
			a = i;
			b = j;
		}

		int a, b;
	}

	List<Link> link = new ArrayList<Link>();

	public void rel(int i, int j) {
		link.add(new Link(i, j));
		link.add(new Link(j, i));
	}

}