import java.util.Scanner;

public class Main {

	public static int[] bubble_sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= i+1; j--) {
				if (a[j] < a[j-1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
		return a;
	}

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(" ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		display(bubble_sort(a));
	}

}
