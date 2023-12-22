import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();

		scan = new Scanner(System.in);
		int a[] = new int[length];

		for (int i = 0; i < length; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (i + 1 == a.length) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}

		// 挿入ソート
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				int temp = a[j];
				a[j] = key;
				a[j + 1] = temp;
				j = j - 1;
			}
			for (int k = 0; k < a.length; k++) {
				if (k + 1 == a.length) {
					System.out.println(a[k]);
				} else {
					System.out.print(a[k] + " ");
				}
			}

		}

	}

}