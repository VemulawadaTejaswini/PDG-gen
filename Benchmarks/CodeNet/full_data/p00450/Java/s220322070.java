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
		// Scanner scan = new Scanner(new File("c:\\0526-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			Table t = new Table(n);
			for (int i = 0; i < n; i++)
				t.add(scan.nextInt());
			System.out.println(t.count());
		}
		scan.close();
		System.exit(0);
	}
}

class Table {
	public Table(int n) {
		s = new int[n];
	}

	public int count() {
		int t = 0;
		for (int i = 0; i < p; i++)
			if (s[i] == 0)
				t++;
		return t;
	}

	public void add(int nx) {
		if (p % 2 == 1)
			for (int i = p - 1; i >= 0; i--)
				if (s[i] != nx)
					s[i] = nx;
				else
					break;
		s[p++] = nx;
	}

	int[] s;
	int p = 0;
}