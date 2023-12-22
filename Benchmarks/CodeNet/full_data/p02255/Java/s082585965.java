import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next()); // ?¨?????????°
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		Insertion_Sort(a);

	}

	private static void Insertion_Sort(int[] a) {
		for (int i = 0; i < a.length; i++) {

			int p = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > p) {
				a[j + 1] = a[j];

				j--;

			}
			a[j + 1] = p;

			for (int j2 = 0; j2 < a.length; j2++) {
				System.out.print(a[j2]);
				if (j2 != a.length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}