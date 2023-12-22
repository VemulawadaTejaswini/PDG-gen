import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main main = new Main();

		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = scan.nextInt();
		}

		int v;
		int j;
		main.print(a);

		for(int i = 1 ; i < n ; i++) {
			v = a[i];
			j = i-1;
			while(j >= 0 && a[j] > v) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			main.print(a);
		}

	}

	private void print(int[] a) {

		System.out.print(a[0]);
		for(int i = 1 ; i < a.length ; i++) {

			System.out.print(" " + a[i]);

		}
		System.out.println();
	}
}

