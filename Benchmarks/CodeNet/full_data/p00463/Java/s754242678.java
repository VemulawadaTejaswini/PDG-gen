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
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			int h = scan.nextInt();
			int k = scan.nextInt();
			Amida a = new Amida(n, m, k);
			for (int i = 1; i <= n; i++)
				a.addScore(i, scan.nextInt());
			for (int i = 1; i <= m; i++)
				a.addH(i, scan.nextInt(), scan.nextInt());

			System.out.println(a.jscore());
		}

		scan.close();
		System.exit(0);
	}
}

class Amida {
	int[] a;
	int[] b;
	int[] chg;

	int[] sc;
	boolean[] nu;

	public Amida(int n, int m, int k) {
		a = new int[m + 1];
		b = new int[m + 1];
		chg = new int[m + 1];
		sc = new int[n + 1];
		nu = new boolean[n + 1];
		for (int i = 1; i <= k; i++)
			nu[i] = true;
	}

	public int jscore() {
		this.sort();
		int s = this.down() - this.up();
		// TODO Auto-generated method stub
		return s;
	}

	private int up() {
		int max = 0;
		for (int i = a.length - 1; i > 0; i--) {
			int c = (sc[a[i]] - sc[a[i] + 1]) * chg[i];
			if (c > max)
				max = c;
			int t = sc[a[i]];
			sc[a[i]] = sc[a[i] + 1];
			sc[a[i] + 1] = t;
		}

		return max;
	}

	private void sort() {
		for (int i = a.length - 2; i > 0; i--)
			for (int j = i + 1; j < a.length; j++)
				if (b[j - 1] > b[j]) {
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					t = b[j - 1];
					b[j - 1] = b[j];
					b[j] = t;
				}
	}

	private int down() {
		for (int i = 1; i < a.length; i++) {
			if (nu[a[i]])
				if (nu[a[i] + 1])
					continue;
				else
					chg[i] = -1;
			else if (nu[a[i] + 1])
				chg[i] = 1;
			else
				continue;
			nu[a[i]] ^= true;
			nu[a[i] + 1] ^= true;
		}
		int s = 0;
		for (int i = 1; i < nu.length; i++)
			if (nu[i])
				s += sc[i];
		return s;
	}

	public void addH(int m, int a, int b) {
		this.a[m] = a;
		this.b[m] = b;
	}

	public void addScore(int n, int s) {
		sc[n] = s;
	}
}