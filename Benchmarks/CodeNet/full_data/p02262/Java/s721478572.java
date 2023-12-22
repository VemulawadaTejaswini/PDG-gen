import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int count = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		shellSort(a);
		System.out.println(count);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	static void shellSort(int[] a) {

		List<Integer> glist = new ArrayList<Integer>();
		for (int i = 1; i < a.length; i=i*3+1) {
			glist.add(i);
		}
		Collections.reverse(glist);
		System.out.println(glist.size());
		Integer[] g = glist.toArray(new Integer[glist.size()]);
		for (int i = g.length-1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(g[i]+" ");
			} else {
				System.out.println(g[i]);
			}
		}

		for (int i = 0; i < g.length; i++) {
			insertionSort(a, g[i]);
		}

	}
	static void insertionSort(int[] a, int g) {
		for (int i = g; i < a.length; i++) {
			int v = a[i];
			int j = i-g;
			while (j >= 0 && a[j] > v) {
				a[j+g] = a[j];
				j=j-g;
				count++;
			}
			a[j+g] = v;
		}
	}
}
