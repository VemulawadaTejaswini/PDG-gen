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

		int m = (int)(Math.log(a.length) / Math.log(2));
		System.out.println(m);
		int[] g = new int[m];
		for (int i = 0; i < m; i++) {
			g[m-1-i] = (int)Math.pow(2,i);
			System.out.print(g[m-1-i]);
			if (i != m-1) System.out.print(" ");
		}
		System.out.print("\n");
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

