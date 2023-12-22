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
		boolean[] d = new boolean[(int) Math.pow(4, 13)];

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String s = scan.next();
			if (s.equals("insert"))
				d[idxno(scan.next())] = true;
			if (s.equals("find"))
				if (d[idxno(scan.next())])
					System.out.println("yes");
				else
					System.out.println("no");
		}

		scan.close();
		System.exit(0);
	}

	private static int idxno(String s) {
		int r = 1;
		for (int i = 0; i < s.length(); i++) {
			r <<= 2;
			switch (s.charAt(i)) {
			case ('A'):
				break;
			case ('C'):
				r |= 1;
				break;
			case ('G'):
				r |= 2;
				break;
			case ('T'):
				r |= 3;
				break;
			}
		}
		return r;
	}
}