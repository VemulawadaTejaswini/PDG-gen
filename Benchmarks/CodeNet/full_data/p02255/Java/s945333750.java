import java.util.Scanner;
public class Main {
	private static void show(int[] a) {
		for (int t = 0; t < a.length; ++t) {
			System.out.print(a[t]);
			if (t != a.length - 1) 
				System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; ++i) {
			int v = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > v) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = v;
			show(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = scan.nextInt();
		show(a);
		insertionSort(a);
	}
}

