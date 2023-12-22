import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		int[] w = new int[n];
		int[] sq = new int[n];
		for (int i = 0; i < n; i++) {
			sq[i] = i;
			w[i] = scan.nextInt();
		}

		QuickSsort(w, sq, 0, n - 1);

		int cost = 0;
		for (int i = 0; i < sq.length; i++)
			while (sq[i] != i) {
				int swp = sq[i];
				cost += (w[i] + w[swp]);
				sq[i] = sq[swp];
				sq[swp] = swp;
			}

		System.out.println(cost);

		scan.close();
		System.exit(0);
	}

	private static void QuickSsort(int[] a, int[] sq, int st, int ed) {
		if (st >= ed)
			return;
		int v = Q2sort(a, sq, st, ed);
		QuickSsort(a, sq, st, v - 1);
		QuickSsort(a, sq, v + 1, ed);
	}

	private static int Q2sort(int[] a, int[] sq, int st, int ed) {
		int x = a[ed];
		int i = st - 1;
		for (int j = st; j < ed; j++)
			if (a[j] <= x) {
				i++;
				int tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
				tmp = sq[j];
				sq[j] = sq[i];
				sq[i] = tmp;
			}
		int tmp = a[i + 1];
		a[i + 1] = a[ed];
		a[ed] = tmp;
		tmp = sq[i + 1];
		sq[i + 1] = sq[ed];
		sq[ed] = tmp;

		return i + 1;
	}

}