import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_3_C-in10.txt"));
		// while (scan.hasNext()) {

		int n = scan.nextInt();
		Slist s = new Slist(n);
		for (int i = 0; i < n; i++)
			s.add(scan.nextInt());
		int q = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < q; i++)
			if (s.isExist(scan.nextInt()))
				cnt++;
		System.out.println(cnt);
		scan.close();
		System.exit(0);
	}
}

class Slist {
	List<Integer> list = new ArrayList<Integer>();
	boolean sorted = false;

	public Slist(int n) {
		// TODO Auto-generated constructor stub
	}

	public boolean isExist(int e) {
		if (!sorted) {
			Collections.sort(list, null);
			sorted = true;
		}
		return this.bsearch(e, 0, list.size() - 1);
	}

	private boolean bsearch(int e, int min, int max) {
		if (min > max)
			return false;
		int mid = (max + min) / 2;
		if (list.get(mid) > e)
			return bsearch(e, min, mid - 1);
		else if (list.get(mid) == e)
			return true;
		else
			return bsearch(e, mid + 1, max);
	}

	public void add(int e) {
		list.add(e);
	}

}