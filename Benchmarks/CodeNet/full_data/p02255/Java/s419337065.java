import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
	    StringBuilder out;

		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		sort(a);

	}

	static void sort(int[] a) {

		printArray(a);

		for(int i = 1; i < a.length; i++ ) {

			int v = a[i];
			int j = i - 1;

			while(j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = v;
			printArray(a);

		}

	}

	static void printArray(int[] a) {

		for(int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println(a[a.length - 1]);
	}
}
