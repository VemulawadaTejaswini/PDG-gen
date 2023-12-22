import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int h = scan.nextInt();

		int[] a = new int[h + 1];

		for (int i = 1; i <= h; i++)
			a[i] = scan.nextInt();

		for (int i = 1; i <= h; i++)
			print(a, i);

		scan.close();
		System.exit(0);
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