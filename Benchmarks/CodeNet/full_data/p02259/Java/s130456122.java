import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cc = 0;
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		cc = bubble_sort(array);
		showArray(array);
		System.out.println(cc);
		sc.close();
	}

	// バブルソート(昇順)して、要素の交換回数を返す
	public static int bubble_sort(int[] a) {
		int cc = 0;
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = a.length - 1; j > i; j--) {
				if(a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					cc++;
				}
			}
		}
		return cc;
	}

	public static void showArray(int[] a) {
		System.out.print(a[0]);
		for(int i = 1; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}
