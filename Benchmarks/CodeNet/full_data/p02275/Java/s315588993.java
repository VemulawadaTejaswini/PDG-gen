import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_5_D-in19.txt"));
		// while (scan.hasNext()) {

		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		Csort(a, b, 10000);

		System.out.print(b[0]);
		for (int i = 1; i < b.length; i++)
			System.out.print(" " + b[i]);
		System.out.println();

		scan.close();
		System.exit(0);
	}

	private static void Csort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		for (int i = 0; i < a.length; i++)
			c[a[i]]++;
		for (int i = 1; i < c.length; i++)
			c[i] += c[i - 1];

		for (int i = a.length - 1; i >= 0; i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}
	}
}