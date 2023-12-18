import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Long> b = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		if (n % 2 == 0) {
			epush(a, n);			
		} else {
			opush(a, n);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(b.get(i));
			System.out.print(" ");
		}
		System.out.println("");
	}
	public static void epush(long a[], int n) {
		for (int i = n-1; i >= 0; i--) {
			if (i % 2 == 1) {
				b.add(a[i]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				b.add(a[i]);
			}
		}
		return;
	}
	public static void opush(long a[], int n) {
		for (int i = n-1; i >= 0; i--) {
			if (i % 2 == 0) {
				b.add(a[i]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				b.add(a[i]);
			}
		}
		return;
	}
}
