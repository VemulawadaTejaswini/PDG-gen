import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static int cnt = 0;
	private static int n;
	private static int[] a;

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		shellSort(a, n);

		// output3
		System.out.println(cnt);

		// output4-
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void insertionSort(int[] a, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while (j >= 0 && a[j] > v) {
				a[j + g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j + g] = v;
		}
	}

	private static void shellSort(int[] a, int n) {
		List<Integer> g = new ArrayList<>();
		int x = 0;
		boolean flag = true;
		while (flag) {
			x = 3 * x + 1;
			if (x > n) break;
			g.add(x);
		}
		Collections.reverse(g);
		int m = g.size();

		// output1
		System.out.println(m);

		// output2
		for (int i = 0; i < g.size(); i++) {
			if (i != 0) System.out.print(" ");
			System.out.print(g.get(i));
		}
		System.out.print("\n");

		for (int i = 0; i < m; i++) {
			insertionSort(a, n, g.get(i));
		}
	}
}