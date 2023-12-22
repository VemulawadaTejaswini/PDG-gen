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
		int k = scan.nextInt();
		int tot = 0, max = 0;
		Tr tr = new Tr(n);
		for (int i = 0; i < n; i++) {
			int w = scan.nextInt();
			tot += w;
			if (w > max)
				max = w;
			tr.add(i, w);
		}
		System.out.println(tr.sesult(k, tot, max));
		scan.close();
		System.exit(0);
	}
}

class Tr {
	int[] w;

	public Tr(int n) {
		w = new int[n];
	}

	public int sesult(int k, int tot, int max) {
		int cp = tot / k;
		if (cp < max)
			cp = max;
		while (true) {
			int rm = (cp * k) - tot;
			if (isPossible(cp, rm))
				return cp;
			else
				cp++;
		}
	}

	private boolean isPossible(int cp, int rm) {
		for (int i = 0, e = cp; i < w.length; i++)
			if (e >= w[i])
				e -= w[i];
			else {
				if (rm > e)
					rm -= e;
				else
					return false;
				e = cp - w[i];
			}

		return true;
	}

	public void add(int i, int _w) {
		w[i] = _w;
	}

}