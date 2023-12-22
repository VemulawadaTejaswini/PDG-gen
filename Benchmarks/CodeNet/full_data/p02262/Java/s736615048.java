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

		System.out.println(cnt);
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
		for (int i = 1; i < n;) {
			g.add(i);
			i = 3 * i + 1;
		}
		Collections.reverse(g);
		int m = g.size();

		System.out.println(m);
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