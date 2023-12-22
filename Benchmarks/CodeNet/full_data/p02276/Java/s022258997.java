import java.util.Scanner;


public class Main {
	static int n = 0;
	static int mid = 0;
	public static void swap (int a, int b) {
		
	}
	
	public static void partition (int[] a, int p, int r) {
		int pivot = a[r]; mid = pivot;
		int pos = r-1;
		for (int j = r-1; j >= 0; j--) {
			if (a[j] > pivot) {
				//System.out.println(pos);
				int tmp = a[pos];
				a[pos] = a[j];
				a[j] = tmp;
				pos--;
			}
		}
		System.out.println(pos);
		pos++;
		int tmp = a[r];
		a[r] = a[pos];
		a[pos] = tmp;
		
	}
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		partition(a, 0, n-1);
		for (int i = 0; i < n; i++) {
			if (a[i] != mid && i!=n-1)
				System.out.print(a[i] + " ");
			else if (a[i] == mid)
				System.out.print("[" + a[i] + "] ");
			else if (i==n-1)
				System.out.println(a[i]);
		}
		
	}
}