import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		run(a);

		scan.close();
		System.exit(0);
	}

	private static void run(int[] a) {
		for (int i = 1; i < a.length; i++) {
			printA(a);
			int temp = a[i];
			for (int j = i; j > 0; j--)
				if (a[j - 1] > a[j]) {
					a[j] = a[j - 1];
					a[j - 1] = temp;
				} else
					break;
		}
		printA(a);

	}

	private static void printA(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}
}