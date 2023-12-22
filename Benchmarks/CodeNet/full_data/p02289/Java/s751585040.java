import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int[] a = new int[2000000 + 1];
		a[0] = 0;

		while (true) {
			String s = scan.next();
			if (s.equals("end"))
				break;
			if (s.equals("insert")) {
				int k = scan.nextInt();
				insert(a, k);
			}
			if (s.equals("extract"))
				System.out.println(extract(a));
		}

		scan.close();
		System.exit(0);
	}

	private static int extract(int[] a) {
		int r = a[1];
		a[1] = a[a[0]];
		a[0]--;
		maxHeap(a, 1);
		return r;
	}

	private static void insert(int[] a, int k) {
		a[0]++;
		a[a[0]] = k;
		up(a, a[0]);
	}

	private static void up(int[] a, int i) {
		if (i > 1 && a[i] > a[i / 2]) {
			int tmp = a[i];
			a[i] = a[i / 2];
			a[i / 2] = tmp;
			up(a, i / 2);
		}
	}

	private static void maxHeap(int[] a, int i) {
		int l = i * 2;
		int r = i * 2 + 1;
		int max = i;
		if (l <= a[0] && a[l] > a[i])
			max = l;
		if (r <= a[0] && a[r] > a[max])
			max = r;
		if (max != i) {
			int tmp = a[i];
			a[i] = a[max];
			a[max] = tmp;
			maxHeap(a, max);
		}
	}

	private static void print(int[] a, int i) {
		System.out.print("node " + i + ": ");
		System.out.print("key = " + a[i] + ", ");
		if (i > 1)
			System.out.print("parent key = " + a[i / 2] + ", ");
		if (i * 2 < a.length)
			System.out.print("left key = " + a[i * 2] + ", ");
		if (i * 2 + 1 < a.length)
			System.out.print("right key = " + a[i * 2 + 1] + ", ");
		System.out.print("\n");
	}
}