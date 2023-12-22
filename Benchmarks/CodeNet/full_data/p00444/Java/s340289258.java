import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static int amt;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			System.out.println(change(n));
		}

		scan.close();
		System.exit(0);
	}

	private static int change(int n) {
		int c = 0;
		amt = 1000 - n;
		c += chg(500);
		c += chg(100);
		c += chg(50);
		c += chg(10);
		c += chg(5);
		c += chg(1);

		return c;
	}

	private static int chg(int c) {
		int p = amt / c;
		amt %= c;
		return p;
	}

}