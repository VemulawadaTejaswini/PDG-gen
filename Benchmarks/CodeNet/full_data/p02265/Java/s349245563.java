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

		prev[0] = 1;

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			// System.out.println(i + " " + s);
			switch (s) {
			case ("insert"):
				x[use] = scan.nextInt();
				prev[use] = 0;
				prev[next[0]] = use;
				next[use] = next[0];
				next[0] = use;
				use++;
				if (use == M)
					use = 0;
				break;
			case ("delete"):
				int dx = scan.nextInt();
				int p = next[0];
				while (x[p] != dx && p > 0) {
					p = next[p];
				}
				if (p == 0)
					break;
				if (next[p] == 0) {
					next[prev[prev[0]]] = 0;
					prev[0] = prev[prev[0]];
				}
				prev[next[p]] = prev[p];
				break;
			case ("deleteFirst"):
				prev[next[next[0]]] = 0;
				next[0] = next[next[0]];
				break;
			case ("deleteLast"):
				next[prev[prev[0]]] = 0;
				prev[0] = prev[prev[0]];
				use--;
				if (use == 0)
					use = M - 1;
				break;
			}
		}
		// }
		int p = next[0];
		System.out.print(x[p]);
		while (true) {
			p = next[p];
			if (p == 0)
				break;
			System.out.print(" " + x[p]);
		}
		System.out.println();

		scan.close();
		System.exit(0);
	}

	static int M = 2000001;
	static int[] x = new int[M];
	static int[] next = new int[M];
	static int[] prev = new int[M];
	static int use = 1;
}