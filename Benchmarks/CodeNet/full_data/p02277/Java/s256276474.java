import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		int[] a = new int[n];
		char[] m = new char[n];
		int[] sq = new int[n];
		for (int i = 0; i < n; i++) {
			sq[i] = i;
			m[i] = scan.next().charAt(0);
			a[i] = scan.nextInt();
		}

		QuickSsort(a, m, sq, 0, n - 1);

		boolean stab = true;
		for (int i = 1; i < a.length; i++)
			if (a[i] == a[i - 1])
				if (sq[i] < sq[i - 1]) {
					stab = false;
					break;
				}
		if (stab)
			System.out.println("Stable");
		else
			System.out.println("Not stable");

		for (int i = 0; i < a.length; i++)
			System.out.println(m[i] + " " + a[i]);

		scan.close();
		System.exit(0);
	}

	private static void QuickSsort(int[] a, char[] m, int[] sq, int st, int ed) {
		if (st >= ed)
			return;
		int v = Q2sort(a, m, sq, st, ed);
		QuickSsort(a, m, sq, st, v - 1);
		QuickSsort(a, m, sq, v + 1, ed);
	}

	private static int Q2sort(int[] a, char[] m, int[] sq, int st, int ed) {
		int x = a[ed];
		int i = st - 1;
		for (int j = st; j < ed; j++)
			if (a[j] <= x) {
				i++;
				int tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
				char t = m[j];
				m[j] = m[i];
				m[i] = t;
				tmp = sq[j];
				sq[j] = sq[i];
				sq[i] = tmp;
			}
		int tmp = a[i + 1];
		a[i + 1] = a[ed];
		a[ed] = tmp;
		char t = m[i + 1];
		m[i + 1] = m[ed];
		m[ed] = t;
		tmp = sq[i + 1];
		sq[i + 1] = sq[ed];
		sq[ed] = tmp;

		return i + 1;
	}

}